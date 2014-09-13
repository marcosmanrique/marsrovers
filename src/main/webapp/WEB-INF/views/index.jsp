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
		<table>
			<tbody>
				<tr>
					<td>Instruction row 1:</td>
					<td><form:input path="secondLine" id="secondLine" /> &nbsp;Ex: 1 2 N</td>
				</tr>
				<tr>
					<td>Instruction row 2:</td>
					<td><form:input path="thirdLine" id="thirdLine" /> &nbsp;Ex: LMLMRMLMMRM</td>
				</tr>
				<tr>
					<td style="align: right;">Result:</td>
					<td><b>${result}<font color="red">${error}</font></b></td>
				</tr>
			</tbody>
		</table>
		<br>
		<div>
			<button id="btnSend" type="submit">SEND</button>
		</div>
	</form:form>

</body>
</html>