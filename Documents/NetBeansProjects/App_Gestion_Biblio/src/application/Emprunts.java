
package application;
import java.io.*;
  
public class Emprunts implements Serializable{
     private String Id_Emprunt;
    private String Id_Lecteur;
    private String Id_Livre;
    private String Date_Emprunt;
    private String Date_RetourPrevu;
     private String Date_RetourEffective;
    private int Retard;
   

    public Emprunts(String Id_Emprunt, String Id_Lecteur, String Id_Livre, String Date_Emprunt, String Date_RetourPrevu,String Date_RetourEffective, int Retard) {
        this.Id_Emprunt = Id_Emprunt;
        this.Id_Lecteur = Id_Lecteur;
        this.Id_Livre = Id_Livre;
        this.Date_Emprunt = Date_Emprunt;
        this.Date_RetourPrevu = Date_RetourPrevu;
         this.Date_RetourEffective = Date_RetourEffective;
        this.Retard = Retard;
        
    }

    public String getId_Emprunt() {
        return Id_Emprunt;
    }

    public void setId_Emprunt(String Id_Emprunt) {
        this.Id_Emprunt = Id_Emprunt;
    }

    public String getId_Lecteur() {
        return Id_Lecteur;
    }

    public void setId_Lecteur(String Id_Lecteur) {
        this.Id_Lecteur = Id_Lecteur;
    }

    public String getId_Livre() {
        return Id_Livre;
    }

    public void setId_Livre(String Id_Livre) {
        this.Id_Livre = Id_Livre;
    }

    public String getDate_Emprunt() {
        return Date_Emprunt;
    }

    public void setDate_Emprunt(String Date_Emprunt) {
        this.Date_Emprunt = Date_Emprunt;
    }

    public String getDate_RetourPrevu() {
        return Date_RetourPrevu;
    }

    public void setDate_RetourPrevu(String Date_Retour) {
        this.Date_RetourPrevu = Date_Retour;
    }

    public String getDate_RetourEffective() {
        return Date_RetourEffective;
    }

    public void setDate_RetourEffective(String Date_RetourEffective) {
        this.Date_RetourEffective = Date_RetourEffective;
    }
    

    public int getRetard() {
        return Retard;
    }

    public void setRetard(int Retard) {
        this.Retard = Retard;
    }

   
    
}
