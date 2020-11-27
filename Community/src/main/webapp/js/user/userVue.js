var inputUserName = null;
var inputPassword = null;
var inputName = null;
var sex = null;
var inputBirth = null;
new Vue({
    el: '#app',
    data: {
        inputUserName: '',
        inputPassword: '',
        inputName: '',
        sex : 'male',
        inputBirth: '',
        registerMessage: ''
    },
    mounted:function(){
        //this.getdata();
    },
    methods:{
        userRegister : function () {
            //发送post请求
            this.$http.post('/Community/user/register',{userName:this.inputUserName,userPassword:this.inputPassword,name:this.inputName,sex:this.sex,birth:this.inputBirth},{emulateJSON:true}).then(function(res){
                alert(res);
            },function(res){
                console.log(res.status);
            });
        }
    }
})