<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
	</head>
	<body>
        <?php
        $password = $_GET["password"];
        if($password == "1111"){
            echo "Hello";
        }
        else{
            echo "who are you?";
        }
        ?>
	</body>
</html>