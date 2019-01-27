<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
	<div>
		<div>HelloController</div>
		<a href="hello">hello</a><br>
		<a href="ajax">ajax</a><br>
	</div>
	<br>
	<div>
		<div>SampleController</div>
		<a href="sample/findAll">sample/findAll</a><br><br>
		<div>Aop</div>
		<a href="sample/noAop">sample/noAop</a><br>
		<a href="sample/aop">sample/aop</a><br><br>
		<div>Transactional</div>
		<a href="sample/noTransactional">sample/noTransactional</a><br>
		<a href="sample/transactional">sample/transactional</a><br><br>
		<div>Cache</div>
		<a href="sample/noCache?id=1">sample/noCache</a><br>
		<a href="sample/cache?id=1">sample/cache</a><br>
	</div>
	<br>
	<div>
		<div>SampleRestController</div>
		<a href="api/sample/findOne/type1?id=2&title=t1">api/sample/findOne/type1, id=2, title=t1</a><br>
		<a href="api/sample/findOne/type2?id=2&title=t1">api/sample/findOne/type2, id=2, title=t1</a><br>
		<a href="api/sample/findOne/type3?id=2&title=t1">api/sample/findOne/type3, id=2, title=t1</a><br>
	</div>
</body>
</html>

