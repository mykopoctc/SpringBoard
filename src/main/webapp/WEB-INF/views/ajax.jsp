<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<title>Hello jQuery Ajax</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <script>
	    $(document).ready(function() {
	        $.ajax({
	            url: "http://localhost:8080/SpringBoard/api/sample/findOne/type1",
	            data: { 
	                "id": 1, 
	            },
	            type: "GET",
	        }).then(function(data) {
		        console.log(data);
	            $('.ajax-id').append(data.id);
	            $('.ajax-title').append(data.title);
	        });
	    });
    </script>
</head>
<body>
	<div>
		<p class="ajax-id">The ID is </p>
		<p class="ajax-title">The title is </p>
	</div>
</body>
</html>
