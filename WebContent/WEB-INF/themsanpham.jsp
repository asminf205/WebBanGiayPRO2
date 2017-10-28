<%-- 
    Document   : newProducts
    Created on : Oct 15, 2016, 1:43:32 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    	<base href="${pageContext.request.contextPath}/">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
       <jsp:include page="menu.jsp"></jsp:include>
       
            <h1>New Product!</h1>
            <form action="${pageContext.request.contextPath}/sanpham/moi" method="post" enctype="multipart/form-data" onsubmit="editImageName()">       
            Tên sản phẩm: <input type="text" name="ten" onkeydown="passValue(this)"/> <br/>
            Gía: <input type="text" name="gia" /> <br/>                      
            Hinh:<input type="button" value="upload" id="btnUpload" onclick="activateUpload()"><br>
    			<input type="file" style="display:none" id="upload" name="image" onchange="readURL(this)"/>
    			<input type="hidden" name="hinh" id="objImage" value=""/>
    		<input id="photo" />         
            <img id="imgPreview" width="250" height="200"/>
            Số lượng: <input type="text" name="soluong" /> <br/>
            Màu: <input type="text" name="mau" /> <br/>
            Size: <input type="text" name="size" /> <br/>
            Hãng SX: <input type="text" name="hangsx" /> <br/>
            
            
            <input type="submit" name="action" value="Insert"/>

        </form>
        <script>
        if(document.getElementById("photo").value!=""){document.getElementById("imgPreview").src=document.getElementById("photo").value;}
		function editImageName(){
			document.getElementById("objImage").value += ".jpg";
			}
        function passValue(obj){
        	document.getElementById("objImage").value = obj.value ;
            }
        function activateUpload(){
        	document.getElementById("upload").click();
        }
        function readURL(input) {
        	var path=input.value;
        	var fileName = path.match(/[^\/\\]+$/);
        			document.getElementById("photo").value=fileName;
        	       if (input.files && input.files[0]) {
        	            var reader = new FileReader();
        	            reader.onload = function (e) {
        	                $('#imgPreview')
        	                    .attr('src', e.target.result)
        	                    .width(250)
        	                    .height(200);
        	            };
        	            reader.readAsDataURL(input.files[0]);
        	        }
        	    }
        </script>
  <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
