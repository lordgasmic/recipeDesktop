<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<form:form action="/postRecipe" method="POST" modelAttribute="recipeDto">
	   <div class="input">
	        Recipe Name:
	    </div>
	    <form:input path="recipeName" />
	    <br>
	    <div class=input>
	        Description
	    </div>
	    <form:input path="description" placeholder="Optional" />
	    <br>
	    <input type="submit">
	</form:form>
</body>
</html>