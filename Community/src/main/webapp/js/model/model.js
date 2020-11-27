Vue.component('mynav', {
    data:function(){
        var userJsonStr = sessionStorage.getItem('user');
        var user = JSON.parse(userJsonStr);
        return {
            user
        }
    },
    template: '<nav class="navbar navbar-default navbar-fixed-top mynav"><div class="container"> <div class="navbar-header"> <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button> <a class="navbar-brand" href="/Community/">简易社区</a> </div> <div id="navbar" class="navbar-collapse collapse"> <ul class="nav navbar-nav"> <li><a href="/Community/">主页</a></li> <li><a href="/Community/view/plate.html">版块</a></li> </ul> <ul class="nav navbar-nav input-group-prepend searchtext"> <li><input type="text" class="form-control " placeholder="搜索"></li> <li><button class="btn btn-default" type="button" onclick="window.location.href=\'/Community/view/search.html\'"><span class="glyphicon glyphicon-search"></span></button></li> </ul> <ul class="nav navbar-nav navbar-right" v-if="user === null"> <li><a class="text-white" href="" data-toggle="modal" data-target="#myModal">登录</a></li> <li><a href="/Community/view/register.html">注册</a></li> </ul> <ul class="nav navbar-nav navbar-right user" v-else> <li><span class="glyphicon glyphicon-bell mybell"></span></li> <li><img  :src="user.userimg == null ? \'\':user.userimg" class="img-circle" onclick="window.location.href=\'/Community/view/user.html\'"></li> </ul> </div> </div></nav>'
})
Vue.component('myfooter',{
    template: '<footer><div class="footavatar"><h2 class="text-center">简易社区<small>2.0.1版本</small></h2> <p class="text-muted text-center">开发自[200733班某未命名]小组，于2020年11月</p><p class="text-muted text-center">用于学生实验项目，功能尚未完全完善</p><p class="text-muted text-center">项目中使用的框架都是开源框架</p></div><div class="Copyright"> <ul> <a href="/">帮助中心</a><a href="/">联系我们</a><a href="/">广告投放</a><a href="/">关于我们</a> </ul><p class="text-muted">Design by CloudShadow</p></div></footer>'
})
Vue.component('loginmodal',{
    template:'<div id="myModal" class="modal fade" tabindex="-1" role="dialog">\<div class="modal-dialog" role="document"><div class="modal-content"> <div class="modal-header"> <h4 class="modal-title">登录</h4> </div> <div class="modal-body"> <form class="form-signin"> <h5 id="message" class="text-danger">{{message}}</h5> <label for="userName" class="sr-only">用户名</label> <input type="text" id="userName" name="userName" class="form-control" placeholder="用户名" required autofocus v-model="userName"> <label for="userPassword" class="sr-only">密码</label> <input type="password" id="userPassword" name="userPassword" class="form-control" placeholder="密码" required v-model="userPassword"> <br /> <a href="/Community/view/register.html">创建用户</a> </form> </div> <div class="modal-footer"> <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> <button type="button" class="btn btn-primary btn-login" v-on:click="userlogin">登录</button> </div> </div> </div></div>',
    data:function(){
        return{
            userName: '',
            userPassword: '',
            message:''
        }
    },
    methods:{
        userlogin : function () {
            if(this.userName === ""){
                this.message = '请输入用户名';
                return;
            }
            if(this.userPassword === ""){
                this.message = '请输入密码';
                return;
            }
            this.$http.post('/Community/user/userLogin',{userName:this.userName,userPassword:this.userPassword},{emulateJSON:true}).then(function(res){
                if(res.body.code === 0){
                    sessionStorage.setItem('user',JSON.stringify(res.body.user));
                    location.reload();
                }else {
                    this.message = res.body.msg;
                }
            },function(res){
                console.log(res.status);
            });
        }
    }
})