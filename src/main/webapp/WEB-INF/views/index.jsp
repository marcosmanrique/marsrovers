<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html lang="pt_br">
<head>
<title>Mars Rovers</title>
</head>
<body>
	<form:form method="post"
		action="${pageContext.request.contextPath}/robot/execute"
		commandName="robotForm">
		<h3>Mars Rovers</h3>
		<div>
			Instruction row1:&nbsp;
			<form:input path="secondLine" id="secondLine" />
			&nbsp; Ex: 1 2 N
		</div>
		<div>
			Instruction row2:&nbsp;
			<form:input path="thirdLine" id="thirdLine" />
			&nbsp; Ex: LMLMLMLMM
		</div>
		<div>
			Current Position:&nbsp;
			<form:input readonly="true" path="result" id="result" />
		</div>
		<br>
		<div>
			<button id="btnSend" type="submit">SEND</button>
		</div>
	</form:form>

</body>
</html>