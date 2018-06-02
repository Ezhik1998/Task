<html>
<head>
    <title> VODAFONE</title>
    <link href="style.css" rel="stylesheet">
</head>
<body>
<div class="header">
    <div class="company">
        <div class="logo"><img src="vodafone.jpg"></div>
        <div class="slogan">The future <br>is exciting. <br> <b>Ready?</b></div>
    </div>

</div>
<div class="users">
    <div class="num"> Users: <%=request.getAttribute("usersAmount") %></div>

</div>
    <div class="main"> Tariffs plans</div>


<form name="registration_form" action="servlet" method="post">

    <div class="tariff"><label><%=request.getAttribute("tariffs")%>
    </label>
        <br/>
        <div class = "filter"> Filter by month price </div>
        <label><%=request.getAttribute("tariffsByFilter")%>
        </label>
    </div>


</form>

</body>
</html>
