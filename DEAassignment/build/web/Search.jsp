<!DOCTYPE html>
<html>
<head>
	<title>search form</title>
   <style>
   *{
	 margin:0;
	 padding:0;
	 font-family:'poppins',sans-serif;
	 box-sizing:border-box;
	 
 }
	.hero{
	 width: 100%;
	 height:100vh;
	 background-image:url(Search.jpeg);
	 background-position:center;
	 background-size:cover;
	 display:flex;
	 align-items:center;
	 justify-content:center;
	 font-size:23px;
 }
	form{
		width:90%;
		max-width:600px;
	}
	
	.input-group{
		margin-bottom:30px;
		
	}
	
	
	
	.button{
		
	
				width:100px;
				height:30px;
				background:red;
				color:white;
				border:none;
				allign:center;
				}
		.sbutton{
				width:100px;
				height:30px;
				background:blue;
				color:white;
				border:none; 
				}
		
	nav{
    width: 100%;
    background:blanchedalmond;
    overflow: auto;
}
li {
  float: left;
}

li a {
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
  text-transform: none;
  text-shadow: #ddd;
}
</style>
	
	<nav>
            <ul>
                <li><a href="#home">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#bookflight">BookFlight</a></li>
                <li><a href="#phoenixclub">PhoenixClub</a></li>
            </ul>
        </nav>
	
	
	
</head>
<body>
<div class="hero">
<form>
	<table>
		<tr>
			<h2>
		<strong>Search for one way or return flight below:</strong>
	</h2>

			<td>
				<input type="radio" name="select" ><strong>One Way</strong>
				<input type="radio" name="select"><strong>Return</strong>
			</td>
		</tr>
		<tr>
			<td>
				</br><strong>From :</strong>
			</td>
			<td>
				</br><input type="text" name="">
			</td>
		</tr>
		<tr>
			<td>
				<strong>To :</strong>
			</td>
			<td>
				<input type="text" name="">
			</td>
		</tr>
		<tr>
			<td>
				<strong>Depart :</strong>
			</td>
			<td>
				<input type="date" placeholder="MM/DD/YY" name="">
			</td>
		</tr></br>
		<tr>
			<td>
				<strong>Return :</strong>
			</td>
			<td>
				<input type="date" placeholder="MM/DD/YY" name="">
			</td>
		</tr>
		
			
			</table>
		
			
	<form class="form-inline" action="/action_page.php">
  <label for="email"><strong>Adult:</strong></label>
  <input type="text" id="email"  name="email">
  <label for="pwd" ><strong>Children:</strong></label>
  <input type="password" id="pwd"  name="pswd">
  <label for="email"><strong>Infant:</strong></label>
  <input type="email" id="email"  name="email">
  <label for="pwd"><strong>Classe:</strong></label>
  <input type="password" id="pwd"  name="pswd">
  
 </br>
 </br><button type="button" class="button">Reset</button> <a href="selectflight.html"><button type="button" class="sbutton">Search</button></a>  
                
  




</form>
 <td>
				

</form>
</div>
</body>
</html>