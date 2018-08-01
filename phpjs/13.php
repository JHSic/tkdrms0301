<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
	</head>
	<body>
        <h1>javascript</h1>
        <script>
        function a(input){
            document.write(input + 1);
        }
        a(5);
        document.write("<br />")
        function b(input2){
            return input2 + 1;
        }
        document.write(b(6));
        </script>
        <h1>php</h1>
        <?php
        function a($input){
            echo($input + 1);
        }
        a(5);
        echo "<br />";
        function b($input){
            return $input + 1;
        }
        echo b(6);
        ?>
	</body>
</html>