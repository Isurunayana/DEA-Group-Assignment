<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="stylesheet" href="RegNew.css">
</head>

<body>

    <style>

body {
    background-image: url(background.jpg);
    background-repeat: no-repeat;
    background-size: cover;
}

.div1 {
    height: 400px;
    width: 400px;
    border: 2px solid rgb(217, 214, 214);
    border-radius: 9px;
    margin-left: 500px;
    margin-top: 100px;
    background-color: rgb(17, 121, 121);
}

.tab {
    margin-left: auto;
    margin-right: auto;
    margin-top: 50px;
}

.td1 {
    padding-right: 15px;
}

.td2 {
    padding-right: 15px;
}

.input {
    background-color: rgb(231, 229, 229);
    border-radius: 5px;
    border: none;
}

.reg {
    background-color: chartreuse;
    border: 1px solid rgb(4, 154, 4);
    border-radius: 10px;
    height: 30px;
    margin-left: 150px;
}

.form {
    align-items: center;
}

.span {
    color: rgb(236, 0, 0);
    margin-left: 100px;
}

.a {
    text-decoration: none;
    font-weight: 600;
}
    </style>
    <div class="div1">
        <form action="" method="POST" class="form">
            <table class="tab">
                <tr>
                    <td class="td1">
                        <label>name</label><br>
                        <input type="text" name="" class="input"><br><br>

                        <label>email</label><br>
                        <input type="email" name="" class="input"><br><br>

                        <label>country</label><br>
                        <input type="text" name="" class="input"><br><br>

                        <label style="display:inline;">NIC</label><br>
                        <input type="text" name="" class="input"><br><br>
                    </td>
                    <td class="td2">
                        <label>user type</label>
                        <select name="">
                <option value="">Normal User</option>
                <option value="">Staff A</option>
                <option value="">Staff B</option>
                <option value="">Admin</option>
            </select><br><br>

                        <label>pin code</label><br>
                        <input type="text" name="" class="input"><br><br>

                        <label>password</label><br>
                        <input type="password" name="" class="input"><br><br>

                        <label>confirm password</label><br>
                        <input type="password" name="" class="input"><br>
                    </td>
                </tr>
            </table>
            <button type="submit" class="reg">Register</button>
        </form><br><br><br>
        <span class="span">Already registered  </span><a class="a" href="">Sign in</a>
    </div>
</body>

</html>