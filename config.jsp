<%@include file="header.jsp" %>
    
<body>
<% out.print("Welcome "+request.getParameter("uname"));  

String driver=config.getInitParameter("dname");  
out.print("driver name is="+driver);   %>

</body>
</html>