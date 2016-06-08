<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
	pageEncoding="ISO-8859-2"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h1>${titleMsg}</h1>
	<h1>Congratulations!! The Engineering college has processed your
		Application form successfully.</h1>

	<h2>${headermsg}</h2>
	<p>
		Student name: <br> ${student1.studentName}
	</p>
	<p>
		Student hobby: <br> ${student1.studentHobby}
	</p>

	<p>
		Student mobile: <br> ${student1.studentMobile}
	</p>

	<p>
		Student DOB: <br> ${student1.studentDOB}
	</p>

	<p>
		Student skills: <br> ${student1.studentSkills}
	</p>
	<h3>Adress:</h3>
	<p>
		Student country:  ${student1.studentAddress.country}<br>
		Student city:  ${student1.studentAddress.city}<br>
		Student street:  ${student1.studentAddress.street}<br>
		Student pincode: ${student1.studentAddress.pincode}<br>
	</p>

</body>
</html>