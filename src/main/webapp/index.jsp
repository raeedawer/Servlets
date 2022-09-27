<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= request.getParameter("n1")%>
</h1>
<br/>
<form action="/login" >
    <label> Enter number</label>
    <input type="password" name="n1"><br>
    <label> Enter number</label>
    <input type="email" name="n2"><br>
    <button type="submit"  ><%! int nb=90;%></button>

</form>
</body>
</html>