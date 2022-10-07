<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Log In</title>
    <!-- <link rel="stylesheet" href="style.css"> -->
    <style>
        body{
    background-image: url(image.jpg );
    background-repeat: no-repeat;
    background-size: cover;
}
.h1{
    text-align: center;
}

.div1{
    border-radius: 20px;
    background-color: rgb(155, 207, 232);
    text-align: center;
    height: 400px;
    width: 400px;
    margin-top: 100px;
    /* border: 3px solid rgb(26, 26, 26); */
    margin-left: auto;
    margin-right: auto;
}

.input{
    border-radius: 5px;
    border: none;
    background-color: rgb(230, 230, 225);
}

.a{
    text-decoration: none;
    text-align: center;
}
    </style>
</head>

<body>
    <div class="div1">
        <h1 class="h1">Login</h1>
        <form action="" method="POST">

            <label>UsernName</label><br>
            <input type="text" name="a" class="input"><br><br>

            <label>Email</label><br>
            <input type="email" name="b" class="input"><br><br>

            <label>UserType</label><br>
            <select class="input" name="c">
                <option>Normal User</option>
                <option>Admin</option>
                <option>Staff A</option>
                <option>Staff B</option>s
            </select><br><br>

            <label>Password</label><br>
            <input type="password" name="d" class="input"><br><br>

            <input type="submit">   
        </form> <br>
        <a href="" class="a">Create an account</a>
    </div>
</body>

</html>