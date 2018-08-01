<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
	</head>
	<body>
        <h1>javascript</h1>
        <ul>
        <script>
        list = new Array("1", "2", "3", "4", "5", "6");
        i = 0;
        while(i < list.length){
            document.write("<li>" +list[i]+ "</li>");
            i = i + 1;
        }
        </script>
        </ul>
        <h1>php</h1>
        <?php
        $list = array("6", "5", "4", "3", "2", "1");
        $i = 0;
        while($i < count($list)){
        echo "<li>".$list[$i]."</li>";
        $i = $i + 1;
        }
        ?>
	</body>
</html>