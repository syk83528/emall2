<%--
  Created by IntelliJ IDEA.
  User: syk
  Date: 2018/8/25
  Time: 下午9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传图片</title>
    <style type="text/css">
        #form {
            text-align: center;
        }
        #form input {

        }
    </style>
</head>
<body>
<h1>上传图片</h1>
<form id="form" action="/upload.do" method="post" enctype="multipart/form-data">
    <div>
        <span>用户名</span><input type="text" name="name">
    </div>
    <div>
        <span>文件</span><input type="file" name="file">
    </div>
    <div>
        <input type="submit" name="确定">
    </div>
</form>
</body>
</html>
