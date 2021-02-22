<%--
  Created by IntelliJ IDEA.
  User: D.Dilara
  Date: 08.02.2021
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="resources/formstyle.css" rel="stylesheet">


    <title>Main</title>
</head>
<body>
<h1> Welcome to the website!</h1>
<form>
    <div class="container">

        <div class="field">
            <button type="submit" class="btn" formaction="registration.jsp">Register</button>
        </div>
        <div class="field">
        <button type="submit" class="btn" formaction="login.jsp">Log In</button>
        </div>
        <div class="field">
            <button type="submit" class="btn" formaction="LogoutServlet">Logout</button>
        </div>
        <div class="field">
            <button type="submit" class="btn" formaction="ProfileServlet">Profile</button>
        </div>
        <div class="field">
            <button type="submit" class="btn" formaction="HiddenField.jsp">Check Hidden Form Field</button>
        </div>
        <div class="field">
            <button type="submit" class="btn" formaction="UrlRewriting.jsp">Check Url Rewriting</button>
        </div>

    </div>
</form>
</body>
</html>
