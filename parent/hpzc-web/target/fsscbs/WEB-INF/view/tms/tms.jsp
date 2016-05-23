<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
  var tms = ${tms} </br>
  <tr>
  <td> ${tms.name} </td>
  <td> ${tms.age} </td>
   </tr>
   
  <a href="index"><input type="button" value="提交" id="button" /></a></br></br></br>
  <button onclick="this.innerHTML=Date()">现在的时间是?</button>
  </br>
  <%-- <button onclick="window.location.href = '${pageContext.request.contextPath}/tms/index'">zhizheng</button>
   --%>
   <button onclick="myFunction()">Try it</button>
   <button onclick="save()">测试</button>
   <script type="text/javascript">
   function myFunction()
   {
   alert("Hello World!");
   }
    function save(){
    	    window.location.href = "${pageContext.request.contextPath}/tms/index"
      } 
   
   </script>
</body>
</html>