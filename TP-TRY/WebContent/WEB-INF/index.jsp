<%@page import="pkgBean.Vodka"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	ArrayList<Vodka> mesVodkas = (ArrayList<Vodka>) request.getAttribute("listeVodka");
%>



<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Les Buveurs de Vodka Anonymes</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/shop-homepage.css" rel="stylesheet">

<!--NEW FONT -->
<link href='http://fonts.googleapis.com/css?family=Oswald'
	rel='stylesheet' type='text/css'>

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

</head>

<body>

	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">BUVEURS DE VODKA ANONYMES</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="#">NOS BUVEURS</a></li>

					<li><a href="#">CONTACTEZ-NOUS</a></li>
				</ul>

				<!-- /.navbar-collapse -->
				<ul class="nav navbar-nav navbar-right">


					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"><b>LOGIN</b> <span class="caret"></span></a>
						<ul id="login-dp" class="dropdown-menu">
							<li>
								<div class="row">
									<div class="col-md-12">

										<form class="form" role="form" method="post" action="login"
											accept-charset="UTF-8" id="login-nav">
											<div class="form-group">
												<label class="sr-only" for="exampleInputEmail2">Email
													address</label> <input type="email" class="form-control"
													id="exampleInputEmail2" placeholder="Email address"
													required>
											</div>
											<div class="form-group">
												<label class="sr-only" for="exampleInputPassword2">Password</label>
												<input type="password" class="form-control"
													id="exampleInputPassword2" placeholder="Password" required>
												<div class="help-block text-right">
													<a href="">Forget the password ?</a>
												</div>
											</div>
											<div class="form-group">
												<button type="submit" class="btn btn-primary btn-block">Sign
													in</button>
											</div>
											<div class="checkbox">
												<label> <input type="checkbox"> keep me
													logged-in
												</label>
											</div>
										</form>
									</div>
									<div class="bottom text-center">
										New here ? <a href="#"><b>Join Us</b></a>
									</div>
								</div>
							</li>
						</ul>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-expanded="false"> <span
							class="glyphicon glyphicon-shopping-cart"></span> 7 - ITEMS<span
							class="caret"></span></a>
						<ul class="dropdown-menu dropdown-cart" role="menu">
							<li><span class="item"> <span class="item-left">
										<img src="http://lorempixel.com/50/50/" alt="" /> <span
										class="item-info"> <span>Item name</span> <span>23$</span>
									</span>
								</span> <span class="item-right">
										<button class="btn btn-xs btn-danger pull-right">x</button>
								</span>
							</span></li>
							<li><span class="item"> <span class="item-left">
										<img src="http://lorempixel.com/50/50/" alt="" /> <span
										class="item-info"> <span>Item name</span> <span>23$</span>
									</span>
								</span> <span class="item-right">
										<button class="btn btn-xs btn-danger pull-right">x</button>
								</span>
							</span></li>
							<li><span class="item"> <span class="item-left">
										<img src="http://lorempixel.com/50/50/" alt="" /> <span
										class="item-info"> <span>Item name</span> <span>23$</span>
									</span>
								</span> <span class="item-right">
										<button class="btn btn-xs btn-danger pull-right">x</button>
								</span>
							</span></li>
							<li><span class="item"> <span class="item-left">
										<img src="http://lorempixel.com/50/50/" alt="" /> <span
										class="item-info"> <span>Item name</span> <span>23$</span>
									</span>
								</span> <span class="item-right">
										<button class="btn btn-xs btn-danger pull-right">x</button>
								</span>
							</span></li>
							<li class="divider"></li>
							<li><a class="text-center" href="">View Cart</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		<!-- /.container -->
	</nav>

	<!-- Page Content -->
	<div class="container">

		<div class="row">

			<div class="col-md-3">
				<p class="lead">CATHEGORIES POUR LES B.A.A</p>
				<div class="list-group">
					<a href="redirection?cat=1" class="list-group-item" >PREMIUM</a>
					 <a href="redirection?cat=2" class="list-group-item">NEUTRE</a> <a href="redirection?cat=3"
						class="list-group-item">AROMATISEE</a> <a href="redirection?cat=4"
						class="list-group-item">NON-AROMATISEE</a>
				</div>
			</div>

			<div class="col-md-9">

				<div class="row carousel-holder">

					<div class="col-md-12">
						<div id="carousel-example-generic" class="carousel slide"
							data-ride="carousel">
							<ol class="carousel-indicators">
								<li data-target="#carousel-example-generic" data-slide-to="0"
									class="active"></li>
								<li data-target="#carousel-example-generic" data-slide-to="1"></li>
								<li data-target="#carousel-example-generic" data-slide-to="2"></li>
							</ol>
							<div class="carousel-inner">
								<div class="item active">
									<img class="slide-image" src="img_vodka/baner1.jpg" alt="">
								</div>
								<div class="item">
									<img class="slide-image" src="img_vodka/banner2.jpg" alt="">
								</div>
								<div class="item">
									<img class="slide-image" src="img_vodka/banner3.jpg" alt="">
								</div>
								<div class="item">
									<img class="slide-image" src="img_vodka/banner4.jpg" alt="">
								</div>
								<div class="item">
									<img class="slide-image" src="img_vodka/banner5.jpg" alt="">
								</div>
								<div class="item">
									<img class="slide-image" src="img_vodka/banner6.jpg" alt="">
								</div>
							</div>
							<a class="left carousel-control" href="#carousel-example-generic"
								data-slide="prev"> <span
								class="glyphicon glyphicon-chevron-left"></span>
							</a> <a class="right carousel-control"
								href="#carousel-example-generic" data-slide="next"> <span
								class="glyphicon glyphicon-chevron-right"></span>
							</a>
						</div>
					</div>

				</div>

				<div class="row">


	
  	 		<%
						
						for(Vodka uneVodka: mesVodkas){
					                      %>  <div class="col-sm-4 col-lg-4 col-md-4">
					                            <div class="thumbnail">
					                                <img src="img_vodka/<%=uneVodka.getImage_small()%>.jpg" alt="image_vodka">
					                                <div class="caption">
					                                    <h4 class="pull-right"><%=uneVodka.getPrix()%>$</h4>
					                                    <h4><a href="#"><%=uneVodka.getTitre()%></a>
					                                    </h4>
					                                    <p><%=uneVodka.getDescription()%></p>
					                                </div>
					               
					                            </div>
					                        </div> <%
					                        }
					%>
	
				


				</div>

			</div>

		</div>

	</div>
	<!-- /.container -->

	<div class="container">

		<hr>

		<!-- Footer -->
		<footer>
			<div class="row">
				<div class="col-lg-12">
					<p>Copyright &copy; Your Website 2014</p>
				</div>
			</div>
		</footer>

	</div>
	<!-- /.container -->

	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

</body>

</html>
