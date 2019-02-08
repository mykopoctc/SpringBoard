<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form method="POST" action="login" class="form-signin">
    <h2 class="form-heading">Log in</h2>

    <div class="form-group">
        <input name="username" type="text" class="form-control" placeholder="Username" autofocus="true"/>
        <input name="password" type="password" class="form-control" placeholder="Password"/>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
    </div>

</form>