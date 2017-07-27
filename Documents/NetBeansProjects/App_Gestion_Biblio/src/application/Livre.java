

package application;

import java.io.*;
public class Livre implements Serializable{
    private int id;
    private String Id_Livre;
    private String Titre;
    private String Auteur;
    private String Langue;
    private int Nbre_Exemplaire;
    private String Categorie;
     public Livre(int id,String Id_Livre,String Titre, String Auteur, String Langue,int Nbre_Exemplaire,String Categorie) {
         this.id=id;
         this.Id_Livre=Id_Livre;
        this.Titre = Titre;
        this.Auteur = Auteur;
        this.Langue = Langue;
        this.Nbre_Exemplaire=Nbre_Exemplaire;
        this.Categorie = Categorie;
        
    }
       public String getId_Livre() {
        return this.Id_Livre;
    }
    
    public void setId_Livre(String Id_Livre){
        this.Id_Livre= Id_Livre;
    }
        public String getTitre() {
        return this.Titre;
    }
    
    public void setTitre(String Titre){
        this.Titre= Titre;
    }
         public String getAuteur() {
        return this.Auteur;
    }
    
    public void setAuteur(String Auteur){
        this.Auteur= Auteur;
    }
          public String getLangue() {
        return this.Langue;
    }
    
    public void setLangue(String Langue){
        this.Langue= Langue;
    }
           public int getNbre_Exemplaire() {
        return this.Nbre_Exemplaire;
    }
    
    public void setNbre_Exemplaire(int Nbre_Exemplaire){
        this.Nbre_Exemplaire= Nbre_Exemplaire;
    }
     
           public String getCategorie() {
        return this.Categorie;
    }
    
    public void setCategorie(String Categorie){
        this.Categorie= Categorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     
}
