<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>Portal do Professor - Escola Conquer</title>
<style type="text/css">
/*Formatação Geral*/

body{
  background-color: #000000;
  text-align: center;
}

/**/

/*Formatação do cabeçalho e rodapé*/

header#cabecalho img{
  height: 150px;
  width: 400px;
  float: 200px;
}

footer#rodape img{
  height: 50px;
  width: 50px;
  float: 200px;
}

footer#rodape a{
  height: 50px;
  width: 50px;
  float:50px;
}

/**/

/*Formatação área de login*/

form{
	border: 3px solid #ffff00;
	padding: 14px 20px;
	margin-top: 100px;
	margin-bottom: 100px;
    margin-right: 150px;
  	margin-left: 150px;
}

input[type=text], input[type=password] {
  padding: 12px 20px;
  margin: 8px 0;
  border: 1px solid #ccc;
  box-sizing: border-box;
  color: #000000;
  font-family:Arial, Helvetica, sans-serif;
  font-size: 20px;
}

button {
  background-color: #ffff00;
  color: #000000;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
}

button:hover {
  opacity: 0.8;
}

.container {
  margin: 30px;
}

label {
  color: #ffffff;
  font-family:Arial, Helvetica, sans-serif;
  font-size: 20px;
  text-align: center;
}
/**/
</style>
</head>
<body>
	<div id="interface">

		<div class=container>
			<header id=cabecalho>
				<img src="https://static-cdn.myedools.com/org-14781%2Fschool-15779%2F5a214ce880dc86a53524f15db026d4b8%2FConquer+Online+White.png"> 
			</header>
			<div class="col-12">
				<hr>
			</div>
		</div>

		<form id="model" method="POST" action="/principal">
			<div class="container">
				<label for="userName"><b>UserName </b></label> 
				<input type="text" placeholder="Enter Username" name="userName" required><br>
				<label for="password"><b>Password </b></label> 
				<input type="password" placeholder="Enter Password" name="password" required><br>
				<button id="btnConfirmar" type="submit" onclick="Login()">Login</button><br>
			</div>
		</form>

		<footer class="footer-for-businesses">
			<div class="container">
				<div class="row">
					<div class="col-md-10 mx-auto mb-0 mb-lg-5">
						<div class="row pb-5">
							<div class="col-12">
								<hr>
							</div>
							<div class="col-12 col-sm-6 text-center text-sm-left">
								<a><img
									src="https://escolaconquer.com.br/wp-content/uploads/2019/10/Marca_CONQUER.png"
									class="logo-conquer"></a>
							</div>
							<div class="col-12 col-sm-6 text-center text-sm-right pt-4">
								<a href="https://www.linkedin.com/school/escolaconquer/"
									class="mx-3"><img
									src="https://escolaconquer.com.br/wp-content/uploads/2019/10/linkedin.png"></a>
								<a href="https://www.facebook.com/escolaconquer/" class="mx-3"><img
									src="https://escolaconquer.com.br/wp-content/uploads/2019/10/facebook.png"></a>
								<a href="https://www.instagram.com/escolaconquer/" class="mx-3"><img
									src="https://escolaconquer.com.br/wp-content/uploads/2019/10/instagram.png"></a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</footer>
	</div>
</body>
</html>