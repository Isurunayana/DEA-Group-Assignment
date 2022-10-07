<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
<style>
  nav{
    width: 100%;
    background:blanchedalmond;
    overflow: auto;
}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color:rgb(63, 104, 216);
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

li a:hover {
  background-color:white;
}
body{
    text-align: center;
    background-color: lightcyan;
    margin: 0%;
    padding: 0%;
    background-image: url(selectflight.jpg);
   background-size: cover;
}
h2{
  text-align: left;
}
table, th, td {
  width: 1200px ;
  border: 2px solid;
  text-align: left;
  border-collapse: collapse;
  padding:1% 2% 1% 2%;
  font-size: large;
  font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
  font-style: oblique;
  margin: auto;
  background-color: none;
}
  header th{
    width: 30px;
  }
  .button {
    border-style: outset;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
  }
  
  .button1 {background-color: Red;} 
  .button2 {background-color: Blue;} 
</style>
</head>
<body>
    <nav>
        <ul>
            <li><a href="#home">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#bookflight">BookFlight</a></li>
            <li><a href="#phoenixclub">PhoenixClub</a></li>
        </ul>
    </nav>
    <h2>Select your pereferred data and faare combination below and click"Next" to continue.</h2>

<h2>*Select a date for your outbound journey.</h2>
<table>
    <tr>
      <div class="header"><th>Date</th> </div>
        <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <th>Time</th>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <th>Fares Rate</th>  
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <th>Select</th>
    <td><center><input type="radio"</td>
    <td><center><input type="radio"</td>
    <td><center><input type="radio"</td>
    <td><center><input type="radio"</td>
    <td><center><input type="radio"</td>
    <td><center><input type="radio"</td>
  </tr>
</table>
<h2>*Select a date for your return journey.</h2>
<table>
    <tr>
      <th>Date</th>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <th>Time</th>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <th>Fares Rate</th>  
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <th>Select</th>
      <td><center><input type="radio"</td>
      <td><center><input type="radio"</td>
      <td><center><input type="radio"</td>
      <td><center><input type="radio"</td>
      <td><center><input type="radio"</td>
      <td><center><input type="radio"</td>
    </tr>
  </table>
  <br></br>
<center>
<button class="button button1"><b>New Search</button>
<a href="FlightPrice.html"><button class="button button2"><b>Next</button></a>
</body>
</html>