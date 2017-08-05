@extends('/navbar1')

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
  <li><a href="contacts">Contacts</a></li>
  <li><a href="test2">Test2</a></li>
  
</ul>
<div class="container">
  <div class="row">
    <div class="col-md-10 col-md-offset-1">
      <div class="panel panel-default">
         
        <table class="table">
          <caption>Affichage des informations</caption>
 	     <tr>
 	      <td>ID</td>
 		   <td>Nom Complet</td>
 		   <td>Telephone</td>
 		   <td>Email</td>
 		   <td>Mot de passe</td>
 		   <td>Biographie</td>
 		    
 	    </tr>
        <?php 
           foreach ($laravels as $laravel ) {  
           ?>
       
        <tr>
          <td><?php echo $laravel->id ?></td>
          <td><?php echo $laravel->Nom ?></td>
          <td><?php echo $laravel->Tel ?></td>
          <td><?php echo $laravel->Email ?></td>
          <td><?php echo $laravel->MotDePasse ?></td>
          <td><?php echo $laravel->bio ?></td>
          
          
        </tr>

        <?php } ?>
     
    
         
       
       </table>

      </div> 
    </div>   
  </div>     
</div>  
 
</body>
</html>