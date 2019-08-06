<%@ page import="com.tieto.geekoff.warmup.Config" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <% out.print(request.getAttribute(Config.URL_PARAMETER_USER_NAME)); %>

  <FORM ACTION="test" METHOD="POST">
    Please enter text:
    <BR>
    <% out.print(Config.URL_PARAMETER_USER_NAME_LABEL); %> : <input type = "text" name = "<% out.print(Config.URL_PARAMETER_USER_NAME); %>">
    <BR>
    <INPUT TYPE="SUBMIT" VALUE="Submit">
  </FORM>
  </body>
</html>