<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/7/2023
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<style>
    h1 {
        margin: auto;
    }
    input[type=text], select {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }
    input[type=password], select {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    button {
        width: 50%;
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        margin-left : 25%;
    }

    input[type=submit]:hover {
        background-color: #45a049;
    }

    div {
        border-radius: 5px;
        background-color: #f2f2f2;
        padding: 20px;
    }
</style>
<body>

<h1>From Dang ky</h1>

<div>
    <form action="products" method="post">
        <label >Mô tả của sản phẩm</label>
        <input type="text" id="description" name="description" placeholder="Mô tả của sản phẩm ...">

        <label >Giá niêm yết của sản phẩm</label>
        <input type="text" id="price" name="price" placeholder="Giá niêm yết của sản phẩm ...">

        <label >Tỷ lệ chiết khấu </label>
        <input type="text" id="percent" name="percent" placeholder="Tỷ lệ chiết khấu  ...">

        <button type="submit" >Tính triết khấu</button>
    </form>
</div>

</body>
</html>
