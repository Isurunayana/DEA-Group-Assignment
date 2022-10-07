<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
	<link rel="stylesheet" type="text/css" href="HomePage.css">
	<meta name="viewport" content="with=device-width, initial-scal=1.0">
	<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;600;700&display=swap" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.4/css/fontawesome.min.css">
	<title> Phoenix Airline design</title>
</head>
<body>

	<style>
		*{
	margin: 0;
	padding: 0;
	font-family: 'Poppins', sans-serif;
}
.header{
	min-height: 100vh;
	width: 100%;
	background-image: linear-gradient(rgba(4, 9, 30, 0.7),rgba(4, 9, 30, 0.7)),url(Home.jpeg);
	background-position: center;
	background-size: cover;
	position: relative;
}

nav{
	display: flex;
	padding: 2% 6%;
	justify-content: space-between;
	align-items: center;
}
nav img{
	width: 100px;
}
.nav-links{
	flex: 1;
	text-align: right;
}
.nav-links ul li{
	list-style: none;
	display: inline-block;
	padding: 8px 12px;
	position: relative;
}

.nav-links ul li a{
	color: white;
	text-decoration: none;
	font-size: 17px;
}
.nav-links ul li ::after{
	content: '';
	width: 0%;
	height: 2px;
	background: #f44336;
	display: block;
	margin: auto;
	transition: 0.5s;
}
.nav-links ul li : hover :: after{
	width:100% ;
}
.text-box{
	width: 90%;
	color: white;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%,-50%);
	text-align: center;

}
.text-box h1{
	font-size: 60px;

}
.text-box p{
	margin: 10px 0 40px;
	font-size: 16px;
	color: white;
}
.hero-btn{
	display: inline-block;
	text-decoration:none;
	color: white;
	border: 1px solid white;
	padding: 12px 34px;
	background: transparent;
	position: relative;
	cursor: pointer;
}
.hero-btn:hover{
	border: 1px solid darkblue;
	background: darkblue;
	transition: 1s;
}
nav.fa{
	display: none;
}

@media(max-width: 700px){
	.text-box h1{
		font-size: 20px;
	}
	.nav-links ul li{
		display: block;
	}
	.nav-links {
		position: absolute;
		background: darkblue;
		height: 100vh;
		width: 200px;
		top: 0;
		right: -200px;
		text-align: left;
		z-index: 2;
		transition: 1s;
	}
	nav.fa{
		display: block;
		color: white;
		margin: 10px;
		font-size: 22px;
		cursor: pointer;
	}
	.nav-links ul{
		padding: 30px;
	}
}


	</style>

	<section class="header">
		
		<nav>
			<a href=""><img src="logoo.jpg"></a>
			<div class="nav-links" id="navLinks">
				<i class="fa fa-times" onclick="hideMenu()" ></i>

				<ul>
					<li><a href="">Home</a></li>
					<li><a href="About.html">About</a></li>
					<li><a href="Search.html">Book Flight</a></li>
					<li><a href="">Phoenix Club</a></li>
					<li><a href="login.html">Login</a></li>
					<li><a href="About.html">Contact Us</a></li>
				</ul>

			</div>
			<i class="fa fa-bars" onclick="showMenu()" ></i>


		</nav>

		<div class="text-box">
			
			<h1>Phoenix Airline</h1>
			<p>World Best Airline Services</p>
			<a href="login.html" class="hero-btn">Booking Now</a>
		</div>
	</section>
