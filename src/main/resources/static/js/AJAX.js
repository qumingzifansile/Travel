function $ajax({method="get",url,data,success,nodes}) {
    //1、创建ajax对象
    var xhr = null;
    try {
        xhr = new XMLHttpRequest();
    } catch (error) {
        xhr = new ActiveXObject("Microsoft.XMLHTTP");
    }

    //2、调用open

    if(method == "get" && data){
        url += "?" + data;
    }

    xhr.open(method, url, true);

    //3、调用send
    xhr.send();


    //4、等待数据响应

    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4) {
            //判断本次下载的状态码都是多少
            if (xhr.status == 200) {
                success(xhr.responseText,nodes);
                return xhr.responseText;
            } else {
                alert("error");
            }
        }
    }

}