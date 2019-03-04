function seachImages() {
var name=document.getElementById("userName").value;
console.log(name);
$.ajax({
    type:'post',
    url:'/JavaWebSocket/user/seachImage.do?userName='+name,
    // data:{userName:name},
    dataType:'json',
    success:function (data) {
        console.log("${pageContext.request.contextPath}"+data);
        $("#image").attr("src","/JavaWebSocket"+data);
        console.log(data);
    }
})
}