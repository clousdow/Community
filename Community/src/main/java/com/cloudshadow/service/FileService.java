package com.cloudshadow.service;



import com.cloudshadow.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class FileService {

    @Autowired(required = false)
    private HttpSession session;

    @Value("${file.location}")
    private String fileLocation;

    @Value("${file.local.server}")
    private String fileLocalServer;
    /**
     * 上传处理
     *
     * @param uploadFile
     * @return
     */
    public String upload(MultipartFile uploadFile)throws IOException{
        String fileName = uploadFile.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf(".") - 1);
        String uuid = UUID.randomUUID().toString().toUpperCase().replace("-", "");
        fileName = uuid + suffix;

        String parent = session.getServletContext().getRealPath(fileLocation);
        File file = new File(parent, fileName);
        if (!file.exists()) {
            file.mkdirs();
        }
        uploadFile.transferTo(file);
        return fileName;
    }

    /**
     * 上传文件到本地服务器
     *
     * @param uploadFile
     * @return
     */
    public R uplaodToLocal(MultipartFile uploadFile) throws IOException {
        String fileName = upload(uploadFile);
        R r = R.ok()
                .put("url", fileLocalServer + "/" + fileName)
                .put("name", fileName);
        return r;
    }
    /**
     * 上传至富文本编辑器
     *
     * @param uploadFile
     * @return
     */
    public R uplaodToWangEditor(MultipartFile uploadFile) throws IOException {
        String fileName = upload(uploadFile);
        String[] data = {fileLocalServer + "/" + fileName};
        R r = R.wangeditorOk(data);
        return r;
    }
}
