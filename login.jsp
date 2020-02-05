
<%@include file="header.jsp" %>
<% Date date =new Date();%>

     
     <%=date %>
     <br>
     <%=getsum(3,4) %>
     <%!
     public static int getsum(int a,int b){
     return a+b;
     }%>


<form action="config.jsp">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form>  

</body>
</html>