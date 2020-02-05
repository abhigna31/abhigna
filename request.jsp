<%@include file="header.jsp" %>
<body>
<%   
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%>  
</body>
</html>