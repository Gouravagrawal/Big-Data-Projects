<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/jquery.autocomplete.css" />
    <script type="text/javascript"
            src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
    <script src="js/jquery.autocomplete.js"></script>  
    <style>
        input {
            font-size: 120%;
        }
    </style>
</head>
<body>
    <h3>Tweets</h3>
    <input type="text" id="hashTags" name="hashTags"/>
     
    <script>
        $("#hashTags").autocomplete("getdata.jsp");
    </script>
</body>
</html>