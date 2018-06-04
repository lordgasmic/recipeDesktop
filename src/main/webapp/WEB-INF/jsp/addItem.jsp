<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<form:form method="POST" action="/item/add" modelAttribute="itemDto">
        <div class="input">Name</div>
	    <form:input path="name" />
	    <br>
	    <input type="submit" value="Submit">
	</form:form>
</body>
</html>