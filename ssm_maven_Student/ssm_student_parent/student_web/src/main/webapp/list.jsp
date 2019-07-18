<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
  <script>
    function delStudents() {
        var arr = new Array();
        var elements = document.getElementsByTagName("input");
        for (var i = 0;i<elements.length;i++){
            if(elements[i].checked){
                arr.push(elements[i].value)
            }
        }
        location.href="${pageContext.request.contextPath}/student/delByIds?ids="+arr;
    }
  </script>
</head>
<body>
  <h1>学生信息列表</h1>
  <a href="/add.jsp">新增</a>     
  &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
  <button onclick="delStudents()">批量删除</button>
  
  <table border="1" cellspacing="0">
    <tr>
      <th></th>
      <th>学生id</th>
      <th>学生名称</th>
      <th>学生性别</th>
      <th>学生年龄</th>
      <th>居住地址</th>
      <th>操作</th>
    </tr>
    <c:forEach items="${pageInfo.list}" var="student">
    <tr>
      <td><input type="checkbox" value="${student.id}"></td>
      <td>${student.id}</td>
      <td>${student.name}</td>
      <td>${student.sex==0?'男':student.sex==1?'女':'其他'}</td>
      <td>${student.age}</td>
      <td>${student.address}</td>
      <td>
          <a href="${pageContext.request.contextPath}/student/updateBefore?id=${student.id}">修改</a>
          &nbsp;&nbsp;
          <a href="${pageContext.request.contextPath}/student/delete?id=${student.id}">删除</a>
        </td>
      </c:forEach>
    </tr>
  </table>

<table>
  <tr>
    <td><a href="/student/find?pageNum=1">首页</a></td>
    <td>
      <c:if test="${pageInfo.pageNum==1}">上一页</c:if>
      <c:if test="${pageInfo.pageNum>1}">
      <a href="/student/find?pageNum=${pageInfo.pageNum-1}">上一页</a>
    </c:if>
    </td>
    <td>
      <c:if test="${pageInfo.pageNum==pageInfo.pages}">下一页</c:if>
      <c:if test="${pageInfo.pageNum<pageInfo.pages}">
        <a href="/student/find?pageNum=${pageInfo.pageNum+1}">下一页</a>
      </c:if>
    </td>
    <td><a href="/student/find?pageNum=${pageInfo.lastPage}">尾页</a></td>
  </tr>
</table>
</body>
</html>
