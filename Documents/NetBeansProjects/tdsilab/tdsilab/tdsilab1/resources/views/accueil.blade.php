@extends('/base')
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=divice-width", initial-scale=1>
    <title></title>
</head>
<body>
    
    <?php echo $prenom.' '.$nom; ?>
     <p><bold>Bienvenue sur notre page d'accueil pour aller plus loin cliquez sur les liens suivants:</bold></p>
     <nav>
     	<a href="test1"><input type="submit" name="test1" value="test1"></a>
     	<a href="test2"><input type="submit" name="test2" value="test2"></a>
     	<a href="contacts"><input type="submit" name="Contacts" value="Contacts"></a>
     </nav>
     <img src="/public/images/Cover.jpg">
</body>
</html>