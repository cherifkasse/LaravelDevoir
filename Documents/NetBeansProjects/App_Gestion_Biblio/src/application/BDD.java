
package application;
import java.net.Socket;
import java.sql.*;

/**
 *
 * @author cherif
 */
public class BDD {
      Connection connection;
         Statement statement;
         String SQL;
         String url;
         String username;
         String password;
         Socket lecteur;
         String Host;
         int port;
         public BDD(String url, String username, String password, String Host, int port){
        	 this.url=url;
        	 this.username=username;
        	 this.password=password;
        	 this.Host=Host;
        	 this.port=port;
        	 
         }
         public Connection connBdd(){
        	 try {
					Class.forName("com.mysql.jdbc.Driver");
					connection=DriverManager.getConnection(url,username,password);
				
				} catch (Exception e) {
				
					e.printStackTrace();
				}
        	 return connection;
         }
         public Connection closeConnBdd(){
        	 try {
				connection.close();
					
				
				} catch (Exception e) {
				
					System.err.println(e);
				
           }
        	 return connection;
         }
         //execution des requetes
         public ResultSet executionQuery(String sql){
             connBdd();
             ResultSet resultSet=null;
             try {
                statement=connection.createStatement();
                resultSet=statement.executeQuery(sql);
                System.out.println(sql);
                
             }catch(SQLException ex){
                 System.err.println(ex); 
             }
             return resultSet;
         }
         public String executionUpdate(String sql ){
              connBdd();
             String result="";
             try {
                statement=connection.createStatement();
                 statement.executeUpdate(sql);
                 result = sql;
                
             }catch(SQLException ex){
                 result=ex.toString(); 
             }
             return result;
             
         }
         //Affichage des tables
         public ResultSet selectAll(String table){
             connBdd();
             SQL="SELECT*FROM "+ table;
             System.out.println(SQL);
             return this.executionQuery(SQL);
         }
          public ResultSet selectCondition(String utilisateurs,String etat){
             connBdd();
             SQL="SELECT*FROM " + utilisateurs + " WHERE "+ etat;
             System.out.println(SQL);
             return this.executionQuery(SQL);
         }
         
         
//         public ResultSet selectLecteur(String lecteur){
//             connBdd();
//             SQL="SELECT*FROM "+lecteur;
//             System.out.println(SQL);
//             return this.executionQuery(SQL);
//         }
//         public ResultSet selectEmprunt(String emprunts){
//             connBdd();
//             SQL="SELECT*FROM "+ emprunts;
//             System.out.println(SQL);
//             return this.executionQuery(SQL);
//         }
//         //affichage avec condition de la table livre(Id_LIvre)
//         public ResultSet selectCondLivre1(String livre,String Id_livre){
//             connBdd();
//             SQL="SELECT*FROM "+ livre+" WHERE Id_Livre= "+ Id_livre;
//             return this.executionQuery(SQL);
//         }
//          public ResultSet selectCondLivre2(String livre,String Titre){
//             connBdd();
//             SQL="SELECT*FROM "+ livre+" WHERE Titre= "+ Titre;
//             return this.executionQuery(SQL);
//         }
//           public ResultSet selectCondLivre3(String livre,String Auteur){
//             connBdd();
//             SQL="SELECT*FROM "+ livre+" WHERE Auteur= "+ Auteur;
//             return this.executionQuery(SQL);
//         }
//            public ResultSet selectCondLivre4(String livre,String Categorie){
//             connBdd();
//             SQL="SELECT*FROM "+ livre+" WHERE Catégorie= "+ Categorie;
//             return this.executionQuery(SQL);
//         }
//           public ResultSet selectCondLecteur1(String lecteur,String Id_lecteur){
//             connBdd();
//             SQL="SELECT*FROM "+ lecteur+" WHERE Id_Lecteur= "+ Id_lecteur;
//             return this.executionQuery(SQL);
//         }
//           public ResultSet selectCondLecteur2(String lecteur,String Nom){
//             connBdd();
//             SQL="SELECT*FROM "+ lecteur+" WHERE Nom= "+ Nom;
//             return this.executionQuery(SQL);
//         }
//           public ResultSet selectCondLecteur3(String lecteur,String Prenom){
//             connBdd();
//             SQL="SELECT*FROM "+ lecteur+" WHERE Prenom= "+ Prenom;
//             return this.executionQuery(SQL);
//         }
//          public ResultSet selectCondEmprunts1(String emprunts,String Id_emprunt){
//             connBdd();
//             SQL="SELECT*FROM "+ emprunts+" WHERE Id_Emprunt= "+ Id_emprunt;
//             return this.executionQuery(SQL);
//         }
//         public ResultSet selectCondEmprunts2(String emprunts,String Id_livre){
//             connBdd();
//             SQL="SELECT*FROM "+ emprunts+" WHERE Id_Livre= "+ Id_livre;
//             return this.executionQuery(SQL);
//         } 
//          public ResultSet selectCondEmprunts3(String emprunts,String Id_lecteur){
//             connBdd();
//             SQL="SELECT*FROM "+ emprunts+" WHERE Id_Lecteur= "+ Id_lecteur;
//             return this.executionQuery(SQL);
//         }
//          
//          
        //Affichage d'une colonne
         public ResultSet select(String[] nomColonne,String table){
             connBdd();
             SQL="SELECT ";
             for(int i=0;i<= nomColonne.length - 1;i++){
                 SQL += nomColonne[i];
                 if(i<nomColonne.length - 1){
                     SQL +=" ,";
                 }
             }
             SQL += " FROM "+ table;
              return this.executionQuery(SQL);
         }
         
            public ResultSet select2(String[] nomColonne,String table,String etat){
             connBdd();
             SQL="SELECT ";
             for(int i=0;i<= nomColonne.length - 1;i++){
                 SQL += nomColonne[i];
                 if(i<nomColonne.length - 1){
                     SQL +=" ,";
                 }
             }
             SQL += " FROM "+ table + " WHERE " + etat;
              return this.executionQuery(SQL);
         }
         
         
         
         
         //Insertion
          public String insert(String table,String[] contenuColonne){
             connBdd();
             SQL="INSERT INTO "+ table +" VALUES (";
             for(int i=0;i<= contenuColonne.length - 1;i++){
                 SQL +="'"+ contenuColonne[i] + "'";
                 if(i<contenuColonne.length - 1){
                     SQL +=",";
                 }
             }
             SQL += ")";
              return this.executionUpdate(SQL);
         }
                  public String insert1(String table,String[] nomColonne,String[] contenuColonne){
             connBdd();
             SQL="INSERT INTO "+ table +" (";
             for(int i=0;i<= nomColonne.length -1;i++){
                 SQL += nomColonne[i];
                 if(i<nomColonne.length - 1){
                     SQL +=" , ";
                 }
             }
             SQL += ") VALUES (";
             for(int i=0;i<= contenuColonne.length - 1;i++){
                 SQL +="'" + contenuColonne[i] + "'";
                 if(i<contenuColonne.length - 1){
                     SQL +=" , ";
                 }
             }
             SQL +=" )";
              return this.executionUpdate(SQL);
         }
                  
       //Changement des données
       
       public String update(String table,String[] nomColonne,String[] contenuColonne,String Id){
             connBdd();
             SQL="UPDATE "+ table +" SET ";
             for(int i=0;i<= nomColonne.length - 1;i++){
                 SQL += nomColonne[i] + "='" +contenuColonne[i] + "'";
                 if(i<nomColonne.length - 1){
                     SQL +=",";
                 }
             }
             SQL +=" WHERE " +Id;
              return this.executionUpdate(SQL);
         }
        
       
       
       
       //suppression 
       public String delete0(String table){
           connBdd();
           SQL="DELETE FROM " + table;
           return this.executionUpdate(SQL);
       }
         //suppression  avec condition
        public String delete1(String table,String id){
           connBdd();
           SQL="DELETE FROM " + table + " WHERE " + id;
           return this.executionUpdate(SQL);
       }
        
      
      /*  public String rechercheId(String table1,String table2,String id1,String id2){
           connBdd();
           SQL="SELECT l."+id1 + "FROM " + table1 + " l" +
                   table2 + " e " + " WHERE l."+id1 +" = " + "e."+id2;
           return this.executionUpdate(SQL);
       }*/
        
        
       
}
