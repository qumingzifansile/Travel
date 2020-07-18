document.write("<script language=javascript src='./js/AJAX.js'></script>");
function ResetPage({nodes, data}) {
    alert(data);
    for (var i = 0; i < nodes.length; i++) {
        nodes[i].innerHTML = data[i];
    }
}

function gbID(id) {
    return document.getElementById(id);
}

function gbCs(classN) {
    return document.getElementsByClassName(classN);
}

function gbTag(tag) {
    return document.getElementsByTagName(tag);
}

/* //加载数据库信息到页面
function $reset({furl,fdata,fnodes,successfunc}){
    //请求信息
    $ajax({
        method: "get",
        url: furl,
        data: fdata,
        success: successfunc,
        error: function () {
            alert("error111111");
        },
        nodes:fnodes
    })
}
 */


