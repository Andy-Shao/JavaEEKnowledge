<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="preds" type="predictions.Predictions" class="predictions.Predictions">
<%
String verb = request.getMethod();

if(!verb.equalsIgnoreCase("GET"))
    response.sendError(response.SC_METHOD_NOT_ALLOWED, "GET request only are allowed.");
//if it's a GET request the predictions.
else {
    //Object reference application has the value
    //pageContext.getServletContext()
    preds.setServletContext(application);
    out.println(preds.getPredictions());
}
%>
</jsp:useBean>
</body>
</html>