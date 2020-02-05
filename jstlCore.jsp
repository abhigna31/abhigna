<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp"%>

<c:out value="hello world" />
<br/>
<c:set var="name" value="abhigna" />
<c:out value="${name}" />
<c:remove var="name" />

<br>
name:<c:out value="${name}"/>
Loop:<br/>

<%-- <c:forEach var="i" begin="1" end="10" step="1">
<h2>${i}</h2>
</c:forEach> --%>


<%-- loop with array:<br/>
<c:forEach var="i" items="1,3,5,7,9,12,13,15"><h2>${i}</h2></c:forEach>
 --%>
 
 
 <%-- <c:forEach var = "i" begin = "1" end = "5">
         Item <c:out value = "${i}"/><p>
      </c:forEach> --%>
      
      
      
      
      
     <%--  <c:forTokens items = "abhi,tanu,divya,sony" delims = "," var = "name">
         <c:out value = "${name}"/><p>
         </c:forTokens> --%>
         
         
         
         
         
         <%-- <c:set var = "salary" scope = "session" value = "${2000*2}"/>
      <p>Your salary is : <c:out value = "${salary}"/></p>
      <c:choose>
         
         <c:when test = "${salary <= 0}">
            Salary is very low to survive.
         </c:when>
         
         <c:when test = "${salary > 1000}">
            Salary is very good.
         </c:when>
         
         <c:otherwise>
            No comment sir...
         </c:otherwise>
      </c:choose>
    --%>



<%-- <c:import var="data" url="index.html"/>  
<c:out value="${data}"/>  --%>
 


</body>
</html>

