<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
<link href="Styles/Main.css" rel=stylesheet>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Password Reset</title>
    </head>
    <body>
        <h1>To reset your password enter it below</h1>
        <form action="reset" method="post">
            Old Password: ${user.password}<br>
            New Password: <input type="password" name="password" placeholder="Enter new password" required><br>
            Re-enter Password: <input type="password" name="password" placeholder="Re-enter password" required><br>
           
            <input type="button" value="Reset Pasword" onClick="window.location = 'account_activity.jsp';">
        </form>
    </body>
</html>
<c:import url="/includes/footer.jsp" />

