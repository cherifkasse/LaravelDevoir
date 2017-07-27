
package application;
import java.io.*;
public class Lecteur implements Serializable {
     private String Id_Lecteur;
    private String Nom;
    private String Prenom;
    private String Addresse_email;
    private int Telephone;
    private String Addresse;

    public Lecteur(String Id_Lecteur, String Nom, String Prenom, String Addresse_email, int Telephone, String Addresse) {
        this.Id_Lecteur = Id_Lecteur;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Addresse_email = Addresse_email;
        this.Telephone = Telephone;
        this.Addresse = Addresse;
    }

    public String getId_Lecteur() {
        return Id_Lecteur;
    }

    public void setId_Lecteur(String Id_Lecteur) {
        this.Id_Lecteur = Id_Lecteur;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getAddresse_email() {
        return Addresse_email;
    }

    public void setAddresse_email(String Addresse_email) {
        this.Addresse_email = Addresse_email;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int Telephone) {
        this.Telephone = Telephone;
    }

    public String getAddresse() {
        return Addresse;
    }

    public void setAddresse(String Addresse) {
        this.Addresse = Addresse;
    }
    
}
