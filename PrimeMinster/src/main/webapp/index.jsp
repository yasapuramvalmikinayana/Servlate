<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>CREATING JAVA SEVER PAGE</h1>
<form action="modi" method="post">
NAME<input type="text" id="nm" name="name">
<br>
<br>
COUNTRY:<br>
<select name= "CountryName">
<option>----AllCountryName----</option>
<option value="India">INDIA</option>
<option value="America">AMERICA</option>
<option value="England">ENGLAND</option>
<option value="SRILANKHA">SRILANKHA</option>
<option value="Ausrtila">AUSTRILA</option>
<option value="Zombia">ZOMBIA</option>
</select>
<br>
<br>
MARRIAGE STATUS
<input type="radio" id="married" name="married">MARRIED</input>
<input type="radio" id="married" name="unmarried">UNMARRIED</input>
<br>
<br>

PARTY: <br>
<select name="PARTY">
<option>---PARTY NAMES----</option>
<option value="BJP"> BJP</option>
<option value="TDP"> TDP</option>
<option value="CONGRESS"> CONGRESS</option>
<option value="JDS"> JDS</option>
<option value="JANASENA"> JANASENA</option>
</select>
<br>
<br>
AGE:<br>
<input type="text" id="age" name="age">
<br>
<br>
GENDER:<br>
<input type="radio" id="gender" name="female">FEMALE</input>
<input type="radio" id="gender" name="male">MALE</input>
<input type="radio" id="gender" name="Transgender">TRANSGENDER</input>
<br>
<br>
PERIOD AS:<br>
<input type="text" id="period" name="10years">
<br>
<br>
TIMES REPESENTED:<br>
<select name="times">
<option>------SELECT------</option>
<option value="2times">2times</option>
<option value="3times">3times</option>
<option value="4times">4times</option>
</select>
<br>
<br>
<input type="submit" value="SAVE"></input>



</form>

</body>
</html>