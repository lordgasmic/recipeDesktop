<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<form:form method="POST" action="/recipe/add" modelAttribute="recipeDto">
        <!-- <div class="input">RecipeName</div> -->
	    <form:input path="name" />
	    <br>
	    <!-- <div class="input">Description</div> -->
	    <form:input path="description" placeholder="Optional" />
	    <br>
	    <input type="submit" value="Submit">
	</form:form>
</body>
</html>