<%@page import="in.co.rays.Model.UserModel"%>
<%@page import="in.co.rays.Bean.UserBean"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String firstName = request.getParameter("first_name");
String lastName = request.getParameter("last_name");
String loginId = request.getParameter("login_id");
String password = request.getParameter("password");
String dob = request.getParameter("dob");
String Address = request.getParameter("address");

SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

UserBean bean = new UserBean();

 bean.setFirstName(firstName); 
 bean.setLastName(lastName);
bean.setLoginId(loginId);
bean.setPassword(password);
bean.setDOB(sdf.parse(dob));
bean.setAddress(Address);
UserModel model = new UserModel();
model.add(bean);
%>
<h1><%=firstName%></h1>
<h1><%=lastName%></h1>
<hi><%=loginId%></hi>
<hi><%=password%></hi>
<hi><%=dob%></hi>
<hi><%=Address%></hi>




</body>
</html>