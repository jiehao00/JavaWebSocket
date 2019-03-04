<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>结款测试</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/order/payment.do" method="post">
    <table>
        <tr>
            <td>订单名称：</td>
            <td><input type="text" value="" name="orderName"></td>
        </tr>
        <tr>
            <td>付款金额：</td>
            <td><input type="text" value="" name="price"></td>
        </tr>
        <tr>
            <td>商品描述：</td>
            <td><input type="text" value="" name="description"></td>
        </tr>
        <tr>
            <td>付款人：</td>
            <td><input type="text" value="" name="people"></td>
        </tr>
        <tr>
            <td>电话号码：</td>
            <td><input type="text" value="" name="tel"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit"value="提交">
            </td>
        </tr>
    </table>


</form>



</body>
</html>
