@extends('/contactsCss')
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=divice-width", initial-scale=1>
    <title></title>
</head>
<body>
<ul>
  <li><a href="Bienvenue">Bienvenue</a></li>
  <li><a href="test1">Test1</a></li>
  <li><a href="test2">Test2</a></li>
  
</ul>
   <h1><center>Bienvenue sur la page de Contacts</center></h1>
   <form  method="POST" action="/store">
     <fieldset>
     	<legend>Incrivez vous</legend>
     	<label for="Nom">Nom complet:</label>
     	<input type="text" name="Nom" id="Nom"><br><br>
     		<label for="Tel">Tel:</label>
     	<input type="text" name=" Tel" id="Tel"><br><br>
     		<label for="email">Email:</label>
     	<input type="text" name="email" id="email"><br><br>
     		<label for="MotdePasse">Mot de Passe:</label>
     	<input type="password" name="MotdePasse" id="MotdePasse"><br><br>
        <label for="bio">bio:</label>
        <textarea name="bio" id="bio" rows="4" cols="50">
        </textarea><br><br>
       
        <input type="hidden" name="_token" value="{{ csrf_token() }}">
     	<input type="submit" name="valider" value="valider" ><br><br>

     </fieldset>
     
   </form>
    
</body>
</html>