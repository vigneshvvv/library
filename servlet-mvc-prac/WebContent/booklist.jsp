<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>

<script type="text/javascript">


function deleteBook(id)
{
	alert("Deleting :"+id);
	
	const xhttp = new XMLHttpRequest();
	  
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	      alert(this.responseText);
	      location.reload();
	    }
	  };
	  xhttp.open("DELETE", "./books?id="+id);
	  xhttp.send(); 
	}


</script>

</head>
<body>
<%-- request.getSession().getAttribute("bookList") --%>

<h2>Books List</h2>
<table>
<tr>
<th>Book Id</th>
<th>Book Name</th>
<th>Book Author</th>
<th>Book Price</th>
<th> Action </th>
</tr>
<c:forEach items="${listbooks}" var="books" >

<tr>
<td>${books.id}</td>
<td>${books.book_name}</td>
<td>${books.author}</td>
<td>${books.price}</td>
<td> 
	
	<input onclick="javascript:deleteBook(${books.id})" type="button" value="Delete">
	

</tr>

</c:forEach>
</table>
</body>
</html>