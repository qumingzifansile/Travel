function footer(){
    var oAdm = document.getElementsByClassName("contact");
    for(let i=0;i<oAdm.length;i++){
        oAdm[i].onclick = function(){
            location.assign("/adminlines");
        }
    }
}