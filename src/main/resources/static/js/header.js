function headerReset(){

    //获取存储的用户姓名
    var username = localStorage.getItem("username");
    //标记是否已经登录
    var isLogin = false;

    if(username){
        isLogin = true;
    }
    
    //获取登录、注册、订单元素节点
    var oUserinfo = document.getElementsByClassName("userinfo");
    var oUsers = oUserinfo[0].getElementsByTagName("*");
    //给登录、注册、订单元素添加点击事件（跳转到相应页面）
    for(var i=0; i<oUsers.length; i++){
        if(oUsers[i].className == "login"){
            if(isLogin){
                oUsers[i].style.borderRight = "0";
                oUsers[i].style.cursor = "none";
                oUsers[i].style.textDecoration = "none";
                oUsers[i].style.color = "black";
                oUsers[i].innerHTML = "欢迎：";
            }else{
                oUsers[i].onclick = function(){
                    location.assign("/login");
                }
            }
        }
        if(oUsers[i].className == "register"){
            if(isLogin){
                oUsers[i].innerHTML = username;
                oUsers[i].onclick = function(){
                    location.assign("/userinfo");
                }
            }else{
                oUsers[i].onclick = function(){
                    location.assign("/register");
                }
            }
        }
        if(oUsers[i].className == "order"){
            oUsers[i].onclick = function(){
                if(isLogin){
                    location.assign("/userinfo");
                }else{
                    location.assign("/login");
                }
                
            }
        }
    }


    //搜索按钮
    var oSearch = document.getElementsByClassName("sbtn");
    var msg = document.getElementsByClassName("sInput");
    //存储查询信息
    var txt = null;
    oSearch[0].onclick = function(){
        txt = msg[0].value;
        location.assign("/result");
    }

    //表单
    // var oForm = document.getElementsByClassName("search");
    //搜索输入框
    var osInput = document.getElementsByClassName("sInput");
    //搜索按钮
    var osbtn = document.getElementsByClassName("sbtn");
    osbtn[0].onclick = function(){
        var txt = osInput[0].value;
        var url = "/result";

        alert(txt);
        localStorage.setItem("searchContent",txt);
        location.assign("/result");
    }
}