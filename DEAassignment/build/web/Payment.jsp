<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: white;
  
}

li {
  float: left;
}

li a {
  display: block;
  color:black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  text-transform: none;
  text-shadow: #ddd;
  font-family: 'Times New Roman', Times, serif;
}
li a:hover {
  background-color:white;
}
table,th,td{
            width: 1200px ;
            border: 2px solid;
            text-align: left;
            border-collapse: collapse;
            padding:1% 2% 1% 2%;
            font-size: large;
            font-family:Cambria, Cochin, Georgia, Times, 'Times New Roman', serif ;
            font-style: oblique;
            margin: auto;
            background-color: white;
        }
        .total{
            text-align: right;
            font-size: x-large;
            color:red;
        }
        h4{
            color: black;
            font-size: larger;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            font-style: normal;
            text-align: start;
        }
        a {
  text-decoration: none;
  display: inline-block;
  padding: 10px 20px;
  font-size: x-large;
  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
  text-align: center;
  font-style: oblique;
}

    a:hover {
  background-color: #ddd;
  color: black;
}

.back {
  background-color:rgba(255, 47, 47, 0.459);
  color: black;
  font-size: large;
}
body{
    text-align: center;
    background-color: lightblue;
    margin: 0%;
    padding: 0%;
    background-image: url(Home.jpeg);
    background-repeat: no-repeat;
    background-size: cover;
}
button{
    text-decoration: none;
  display: inline-block;
  padding: 10px 20px;
  font-size: medium;
  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
  text-align: center;
  font-style: oblique;
  background-color: aliceblue;
 
}

        
        
    </style>
</head>
<body>
    <ul>
        <li><a href="#home">Home</a></li>
        <li><a href="#about">About</a></li>
        <li><a href="#bookflight">BookFlight</a></li>
        <li><a href="#phoenixclub">PhoenixClub</a></li>
    </ul>
<h4>Please reviwe your itinerary below to ensure the details are correct before conferming your purchaases</h4>
<table>
    <tr>
        <th colspan="2">Name to appear on the ticket</th>
    </tr>
    <tr>
        <td></td>
        <td></td>
    </tr>
</table>
<h4>Payments details</h4>
<table>
    <tr>
        <th>Card Number</th>
        <th>Name</th>
        <th>Type</th>
        <th>Expair Date</th>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
</table>
<h4>Fare cost breakdown</h4>
<div class="total">
<table>
    <tr>
        <th colspan="0">TOTAL:</th>
    </tr>
</table>
</div>
<br>
<a href="#" class="back">&laquo; Back</a>
<button type="submit" value="submit">Purchases</button>
</body>
</html>

