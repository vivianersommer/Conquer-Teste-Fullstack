<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>Portal do Professor - Escola Conquer</title>
<link
	href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="style/principal.css">
<body>
	<div id="interface">

		<div class=container>
			<header id=cabecalho>
				<img
					src="https://static-cdn.myedools.com/org-14781%2Fschool-15779%2F5a214ce880dc86a53524f15db026d4b8%2FConquer+Online+White.png">
			</header>
			<div class="col-10">
				<hr>
			</div>
			<div class="container">
				<div class="navbar">
					<div class="navbar-inner" id="menu">
						<a class="btn btn-navbar" data-toggle="collapse"
							data-target=".nav-collapse"> <span class="icon-bar"></span> <span
							class="icon-bar"></span> <span class="icon-bar"></span>
						</a>
						<div class="nav-collapse collapse">
							<ul class="nav">
								<li class="active"><a href="/principalLogged">PÁGINA
										PRINCIPAL</a></li>
								<li><a href="/turma">ADICIONAR TURMA</a></li>
								<li><a href="/aluno">ADICIONAR ALUNO</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div id="tabelas">
			<h2>Lista de Turmas</h2>
			<table class="table">
				<thead>
					<tr>
						<th>Nome</th>
						<th>Professor</th>
						<th>Número de Alunos</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th></th>
						<th></th>
						<th></th>
					</tr>
					<c:forEach items="${Turms}" var="listTurms">
						<tr>
							<td>${listTurms.name}</td>
							<td>${listTurms.teacher}</td>
							<td>${listTurms.numberStudents}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<h2>Lista de Alunos</h2>
			<table class="table">
				<thead>
					<tr>
						<th>Nome</th>
						<th>Sobrenome</th>
						<th>Nome da Turma</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th></th>
						<th></th>
						<th></th>
					</tr>
					<c:forEach items="${Students}" var="listStudents">
						<tr>
							<td>${listStudents.firstName}</td>
							<td>${listStudents.lastName}</td>
							<td>${listStudents.nameTurm}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

		<footer class="footer-for-businesses" id="container_amarelo">
			<a href="https://www.linkedin.com/school/escolaconquer/" class="mx-3"><img
				src="https://escolaconquer.com.br/wp-content/uploads/2019/10/linkedin.png"></a>
			<a href="https://www.facebook.com/escolaconquer/" class="mx-3"><img
				src="https://escolaconquer.com.br/wp-content/uploads/2019/10/facebook.png"></a>
			<a href="https://www.instagram.com/escolaconquer/" class="mx-3"><img
				src="https://escolaconquer.com.br/wp-content/uploads/2019/10/instagram.png"></a>
		</footer>

	</div>
</body>
</html>
