document.write("<script language=javascript src='./js/ResetPage.js'></script>");
function headerReset(){

    //获取存储的用户姓名
    var username = localStorage.getItem("username");
    //标记是否已经登录
    var isLogin = false;

    if(username){
        isLogin = true;
    }

    //用户类型
    var userType = parseInt(localStorage.getItem("userType"));

    //获取登录、注册、订单元素节点
    var oUserinfo = document.getElementsByClassName("userinfo");
    //给登录、注册、订单元素添加点击事件（跳转到相应页面）
    if(isLogin){
        oUserinfo[0].style.display = "none";
        oUserinfo[userType+1].style.display = "block";

        //username添加鼠标移入移出事件，移入显示下拉菜单，移出隐藏
        var oUsername = document.getElementsByClassName("username");
        var odds = oUsername[userType].getElementsByTagName("dd");
        oUsername[userType].onmouseover = function(){
            for(let i=0;i<odds.length;i++){
                odds[i].style.display = "block";
            }
        }
        oUsername[userType].onmouseout = function(){
            for(let i=0;i<odds.length;i++){
                odds[i].style.display = "none";
            }
        }
    }else{
        oUserinfo[0].style.display = "block";
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

        localStorage.setItem("searchContent",txt);
        location.assign("/result");
    }
}