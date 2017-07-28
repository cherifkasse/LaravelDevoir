/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_de_donnees;

import application.AffichageResultat;
import application.BDD;
import application.Parametres;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author cherif
 */
public class Livre extends javax.swing.JFrame {

     ResultSet rs;
    BDD db;
    String rd,test=null,test1=null,test2=null;
    int r=0,nbre1=0;
    public Livre() {
        initComponents();
         db=new BDD(new Parametres().HOST_DB,new Parametres().USERNAME_DB,
                new Parametres().PASSWORD_DB,new Parametres().IPHOST,new Parametres().PORT);
         table();
    }

   public void table() {
            String a[]={"id","Id_Livre","Titre","Auteur","Langue","Nbre_Exemplaire","Categorie"};
            rs=db.select(a, "livre");
            tbl_livre.setModel(new AffichageResultat(rs));
            
        }
      
      void actualiser(){
          
          txt_idlivre.setText("");
         txt_titre.setText("");
         txt_auteur.setText("");
         txt_lang.setText("");
         txt_exemp.setText("");
         txt_cat.setText("");
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_livre = new javax.swing.JTable();
        ajouterLivre = new javax.swing.JButton();
        modifierLivre = new javax.swing.JButton();
        supprimerLivre = new javax.swing.JButton();
        actualiserLivre = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_idlivre = new javax.swing.JTextField();
        txt_titre = new javax.swing.JTextField();
        txt_auteur = new javax.swing.JTextField();
        BoutonRechLivre = new javax.swing.JButton();
        txt_rechercheLivre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cherchLivre = new javax.swing.JComboBox<>();
        txt_lang = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_exemp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_cat = new javax.swing.JTextField();
        Retour1 = new javax.swing.JButton();
        quiiter = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nbreLivr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("                         GESTION DES LIVRES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 0, 340, 45);

        tbl_livre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Id_livre", "Titre", "Auteur", "Langue", "Nbre_Exemplaire", "Catégorie"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_livre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_livreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_livre);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 50, 770, 90);

        ajouterLivre.setBackground(new java.awt.Color(66, 224, 240));
        ajouterLivre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ajouterLivre.setText("Ajouter");
        ajouterLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterLivreActionPerformed(evt);
            }
        });
        getContentPane().add(ajouterLivre);
        ajouterLivre.setBounds(150, 190, 120, 30);

        modifierLivre.setBackground(new java.awt.Color(66, 224, 240));
        modifierLivre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modifierLivre.setText("Modifier");
        modifierLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierLivreActionPerformed(evt);
            }
        });
        getContentPane().add(modifierLivre);
        modifierLivre.setBounds(270, 190, 120, 30);

        supprimerLivre.setBackground(new java.awt.Color(66, 224, 240));
        supprimerLivre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supprimerLivre.setText("Supprimer");
        supprimerLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerLivreActionPerformed(evt);
            }
        });
        getContentPane().add(supprimerLivre);
        supprimerLivre.setBounds(390, 190, 120, 30);

        actualiserLivre.setBackground(new java.awt.Color(66, 224, 240));
        actualiserLivre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        actualiserLivre.setText("Actualiser");
        actualiserLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualiserLivreActionPerformed(evt);
            }
        });
        getContentPane().add(actualiserLivre);
        actualiserLivre.setBounds(510, 190, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Id_Livre");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 310, 70, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Titre");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 350, 50, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Auteur");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 390, 90, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Langue");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 420, 110, 14);
        getContentPane().add(txt_idlivre);
        txt_idlivre.setBounds(120, 300, 210, 30);
        getContentPane().add(txt_titre);
        txt_titre.setBounds(120, 340, 210, 30);
        getContentPane().add(txt_auteur);
        txt_auteur.setBounds(120, 380, 210, 30);

        BoutonRechLivre.setBackground(new java.awt.Color(64, 218, 240));
        BoutonRechLivre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BoutonRechLivre.setText("Rchercher ");
        BoutonRechLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRechLivreActionPerformed(evt);
            }
        });
        getContentPane().add(BoutonRechLivre);
        BoutonRechLivre.setBounds(380, 390, 160, 40);
        getContentPane().add(txt_rechercheLivre);
        txt_rechercheLivre.setBounds(570, 390, 150, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Rechercher Par Catégorie :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 310, 160, 30);

        cherchLivre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Id_livre", "Auteur", "Categorie", "Langue", " " }));
        getContentPane().add(cherchLivre);
        cherchLivre.setBounds(550, 310, 180, 30);
        getContentPane().add(txt_lang);
        txt_lang.setBounds(120, 420, 210, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Nbre_Exemplaire");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 460, 120, 20);

        txt_exemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_exempActionPerformed(evt);
            }
        });
        getContentPane().add(txt_exemp);
        txt_exemp.setBounds(120, 460, 210, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Catégorie");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 510, 80, 20);

        txt_cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_catActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cat);
        txt_cat.setBounds(120, 510, 210, 30);

        Retour1.setBackground(new java.awt.Color(51, 0, 255));
        Retour1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Retour1.setText("Retour");
        Retour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Retour1ActionPerformed(evt);
            }
        });
        getContentPane().add(Retour1);
        Retour1.setBounds(30, 583, 100, 30);

        quiiter.setBackground(new java.awt.Color(51, 0, 255));
        quiiter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        quiiter.setText("Quitter");
        quiiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quiiterActionPerformed(evt);
            }
        });
        getContentPane().add(quiiter);
        quiiter.setBounds(640, 583, 100, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 280, 350, 280);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nbre Livres");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 480, 130, 20);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 10, 10);
        getContentPane().add(nbreLivr);
        nbreLivr.setBounds(570, 480, 60, 30);

        setSize(new java.awt.Dimension(812, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_livreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_livreMouseClicked
        txt_idlivre.setText(String.valueOf(tbl_livre.getValueAt(tbl_livre.getSelectedRow(),1)));
        txt_titre.setText(String.valueOf(tbl_livre.getValueAt(tbl_livre.getSelectedRow(),2)));
        txt_auteur.setText(String.valueOf(tbl_livre.getValueAt(tbl_livre.getSelectedRow(),3)));
        txt_lang.setText(String.valueOf(tbl_livre.getValueAt(tbl_livre.getSelectedRow(),4)));
        txt_exemp.setText(String.valueOf(tbl_livre.getValueAt(tbl_livre.getSelectedRow(),5)));
         txt_cat.setText(String.valueOf(tbl_livre.getValueAt(tbl_livre.getSelectedRow(),6)));

    }//GEN-LAST:event_tbl_livreMouseClicked

    private void ajouterLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterLivreActionPerformed
        if(txt_idlivre.getText().equals("")||txt_titre.getText().equals("")
            ||txt_auteur.getText().equals("")||txt_lang.getText().equals("")||txt_exemp.getText().equals("")||txt_cat.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez compléter toutes les informations");

        }else{
            String[] colon={"Id_Livre","Titre","Auteur","Langue","Nbre_Exemplaire","Categorie"};
            String[] inf={txt_idlivre.getText(),txt_titre.getText(),txt_auteur.getText(),
                txt_lang.getText(),txt_exemp.getText(),txt_cat.getText()};
            rs=db.selectCondition("livre","Id_Livre= '" + txt_idlivre.getText() 
              + " 'and Titre='" + txt_titre.getText()+ "'and Auteur='" + txt_auteur.getText()+ "'");
             try{
         while (rs.next()) {
             test=rs.getString("Id_Livre");
             test1=rs.getString("Titre");
             test2=rs.getString("Auteur");
             if (test!=null && test1!=null && test2!=null){
                 rd="UPDATE livre SET Nbre_Exemplaire = Nbre_Exemplaire  +"+txt_exemp.getText() + " WHERE Id_Livre = '"+txt_idlivre.getText()+"' and Titre= '"+txt_titre.getText() +"'"; 
                 System.out.println(db.executionUpdate(rd));
                 r++;
             }
             
            
         }
           if(r==0){
            System.out.println(db.insert1("livre", colon, inf));
             }
     }catch(SQLException ex){
         ex.printStackTrace();
         
     }
            
             
            r=0;
            actualiser();
            table();

    }//GEN-LAST:event_ajouterLivreActionPerformed
    }
    private void modifierLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierLivreActionPerformed
        if(txt_idlivre.getText().equals("")||txt_titre.getText().equals("")
            ||txt_auteur.getText().equals("")||txt_lang.getText().equals("")||txt_exemp.getText().equals("")
                ||txt_cat.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez compléter toutes les informations");

        }else{
           String[] colon={"Id_Livre","Titre","Auteur","Langue","Nbre_Exemplaire","Categorie"};
            String[] inf={txt_idlivre.getText(),txt_titre.getText(),txt_auteur.getText(),
                txt_lang.getText(),txt_exemp.getText(),txt_cat.getText()};
            String id=String.valueOf(tbl_livre.getValueAt(tbl_livre.getSelectedRow(),0));
            System.out.println(db.update("livre", colon, inf, "id='" + id + "'"));
            table();
            actualiser();
        }
    }//GEN-LAST:event_modifierLivreActionPerformed

    private void supprimerLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerLivreActionPerformed
        String id=String.valueOf(tbl_livre.getValueAt(tbl_livre.getSelectedRow(),0));
        if(JOptionPane.showConfirmDialog(this, "Etes-vous sùr de vouloir supprimer","Attention!!!",
            JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
        db.delete1("livre", "id=" + id);
        }else{
            return;
        }
        table();
    }//GEN-LAST:event_supprimerLivreActionPerformed

    private void actualiserLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualiserLivreActionPerformed
         rs=db.executionQuery("SELECT * FROM livre");
         try{
                  while (rs.next()) {
                     nbre1=rs.getInt("Nbre_Exemplaire")+nbre1; 
                     
                     nbreLivr.setText(""+nbre1);
                    
                  }
                   nbre1=0;
         }catch(SQLException ex){
         ex.printStackTrace();
     
    }
        actualiser();
        table();
    }//GEN-LAST:event_actualiserLivreActionPerformed

    private void BoutonRechLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRechLivreActionPerformed
        if(txt_rechercheLivre.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez entrer quelque chose");
        }else{
            if(cherchLivre.getSelectedItem().equals("Id")){
                rs=db.selectCondition("livre", "id LIKE '%" +txt_rechercheLivre.getText() +"%' ");
                tbl_livre.setModel(new AffichageResultat(rs));
            }else if(cherchLivre.getSelectedItem().equals("Id_livre")){
                rs=db.selectCondition("livre", "Id_Livre LIKE '%" +txt_rechercheLivre.getText() +"%' ");
                tbl_livre.setModel(new AffichageResultat(rs));
            }else if(cherchLivre.getSelectedItem().equals("Auteur")){
                rs=db.selectCondition("livre", "Auteur LIKE '%" +txt_rechercheLivre.getText() +"%' ");
                tbl_livre.setModel(new AffichageResultat(rs));
            }else if(cherchLivre.getSelectedItem().equals("Langue")){
                rs=db.selectCondition("livre", "Langue LIKE '%" +txt_rechercheLivre.getText() +"%' ");
                tbl_livre.setModel(new AffichageResultat(rs));
            }else if(cherchLivre.getSelectedItem().equals("Categorie")){
                rs=db.selectCondition("livre", "Categorie LIKE '%" +txt_rechercheLivre.getText() +"%' ");
                tbl_livre.setModel(new AffichageResultat(rs));
            }
        }
    }//GEN-LAST:event_BoutonRechLivreActionPerformed

    private void txt_exempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_exempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_exempActionPerformed

    private void txt_catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_catActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_catActionPerformed

    private void Retour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Retour1ActionPerformed
        Bienvenue b=new Bienvenue();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Retour1ActionPerformed

    private void quiiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quiiterActionPerformed
        this.dispose();
    }//GEN-LAST:event_quiiterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Livre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Livre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Livre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Livre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Livre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonRechLivre;
    private javax.swing.JButton Retour1;
    private javax.swing.JButton actualiserLivre;
    private javax.swing.JButton ajouterLivre;
    private javax.swing.JComboBox<String> cherchLivre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifierLivre;
    private javax.swing.JLabel nbreLivr;
    private javax.swing.JButton quiiter;
    private javax.swing.JButton supprimerLivre;
    private javax.swing.JTable tbl_livre;
    private javax.swing.JTextField txt_auteur;
    private javax.swing.JTextField txt_cat;
    private javax.swing.JTextField txt_exemp;
    private javax.swing.JTextField txt_idlivre;
    private javax.swing.JTextField txt_lang;
    private javax.swing.JTextField txt_rechercheLivre;
    private javax.swing.JTextField txt_titre;
    // End of variables declaration//GEN-END:variables
}

