<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-09-19
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8"/>
    <title>Title</title>
</head>
<body>
<h1>保存商品</h1>
<s:form action="product_Save" method="POST" namespace="/" theme="simple">
    <table border="1" width="400px">
        <tr>
            <td>商品名称</td>
            <td><s:textfield name="productName"/></td>
        </tr>
        <tr>
            <td>商品价格</td>
            <td><s:textfield name="productPrice"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="添加"/></td>
        </tr>
    </table>
</s:form>
</body>
</html>
