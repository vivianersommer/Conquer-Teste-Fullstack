<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>Portal do Professor - Escola Conquer</title>
<style type="text/css">
/*Formatação Geral*/
body {
	background-color: #000000;
	text-align: center;
}

/**/

/*Formatação do cabeçalho e rodapé*/
header#cabecalho img {
	height: 150px;
	width: 400px;
	float: 200px;
}

footer#rodape img {
	height: 50px;
	width: 50px;
	float: 200px;
}

footer#rodape a {
	height: 50px;
	width: 50px;
	float: 50px;
}

/**/

/* Formatação Menu Principal */
#menu ul {
	background-color: #000000;
	list-style: none;
	padding: 15px;
	position: static;
}

#menu ul li {
	display: inline;
	padding: 10px;
	position: static;
}

#menu ul li a {
	padding: 5px;
	display: inline-block;
	color: #ffffff;
	background-color: #000000;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 20px;
	text-align: center;
	text-decoration: none;
	text-align: center;
	font-size: 20px;
	position: static;
	height: 50px;
	width: 200px;
	padding: 10px;
	border: 3px #ffff00 solid;
	background-color: #000000;
	box-sizing: border-box;
	border-image-slice: 30%;
}

#menu ul li a:hover {
	background-color: #ffff00;
	color: #000000;
}

/**/
</style>
</head>
<body>
	<div id="interface">

		<div class=container>
			<header id=cabecalho>
				<img
					src="https://static-cdn.myedools.com/org-14781%2Fschool-15779%2F5a214ce880dc86a53524f15db026d4b8%2FConquer+Online+White.png">
			</header>
			<div class="col-12">
				<hr>
			</div>
			<div>
				<nav id="menu">
					<ul>
						<li><a href="/principalLogged"> Página Principal </a></li>
						<li><a href="/turma"> Adicionar Turma </a></li>
						<li><a href="/aluno"> Adicionar Aluno </a></li>
					</ul>
				</nav>
			</div>
		</div>

		<div class="col-12">
			<hr>
		</div>

		<form id="model">
			<div class="container">
				<label for="name"><b>Nome do Aluno </b></label> 
					<input type="text"  name="name" required><br>
				<label for="team"><b>Turma </b></label> 
					<input type="text"  name="team" required><br>
				<button id="btnAdicionaAluno" type="submit" > Adicionar Aluno </button>
				<br>
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
