
package base_de_donnees;
import application.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author cherif
 */
public class Lecteur extends javax.swing.JFrame {

    ResultSet rs;
    BDD db;
   int nbre1=0;
    public Lecteur() {
         db=new BDD(new Parametres().HOST_DB,new Parametres().USERNAME_DB,
                new Parametres().PASSWORD_DB,new Parametres().IPHOST,new Parametres().PORT); 
         
            initComponents();
            table();

    }
      public void table() {
            String a[]={"Id_Lecteur","Nom","Prenom","Addresse_email","Telephone","Addresse","DateInscrit"};
            rs=db.select(a, "lecteur");
            tblLect.setModel(new AffichageResultat(rs));
            
        }
      
      void actualiser(){
          
          nomLect.setText("");
          prenomLect.setText("");
          mailLect.setText("");
          telLect.setText("");
          adresseLect.setText("");
          dateLect.setText("");
      }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ajouter = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        actualiser = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nomLect = new javax.swing.JTextField();
        prenomLect = new javax.swing.JTextField();
        mailLect = new javax.swing.JTextField();
        telLect = new javax.swing.JTextField();
        adresseLect = new javax.swing.JTextField();
        recherche = new javax.swing.JButton();
        txt_recherche = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        com1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLect = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        dateLect = new javax.swing.JTextField();
        Retour1 = new javax.swing.JButton();
        quiiter = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        nbreLivre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText(" GESTION DES  LECTEURS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 0, 220, 39);

        ajouter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ajouter.setText("Ajouter");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });
        getContentPane().add(ajouter);
        ajouter.setBounds(150, 190, 120, 30);

        modifier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modifier.setText("Modifier");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });
        getContentPane().add(modifier);
        modifier.setBounds(270, 190, 120, 30);

        supprimer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supprimer.setText("Supprimer");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });
        getContentPane().add(supprimer);
        supprimer.setBounds(390, 190, 120, 30);

        actualiser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        actualiser.setText("Actualiser");
        actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualiserActionPerformed(evt);
            }
        });
        getContentPane().add(actualiser);
        actualiser.setBounds(510, 190, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Nom");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 310, 25, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Prenom");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 350, 50, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Mail");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 390, 34, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Telephone");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 430, 60, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Addresse");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 470, 70, 14);
        getContentPane().add(nomLect);
        nomLect.setBounds(110, 300, 210, 30);
        getContentPane().add(prenomLect);
        prenomLect.setBounds(110, 340, 210, 30);
        getContentPane().add(mailLect);
        mailLect.setBounds(110, 380, 210, 30);
        getContentPane().add(telLect);
        telLect.setBounds(110, 420, 210, 30);
        getContentPane().add(adresseLect);
        adresseLect.setBounds(110, 460, 210, 30);

        recherche.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        recherche.setText("Rchercher ");
        recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheActionPerformed(evt);
            }
        });
        getContentPane().add(recherche);
        recherche.setBounds(380, 390, 160, 40);
        getContentPane().add(txt_recherche);
        txt_recherche.setBounds(570, 390, 150, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Rechercher Par Catégorie :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 310, 160, 30);

        com1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id_Lecteur", "Nom", "Prenom" }));
        getContentPane().add(com1);
        com1.setBounds(550, 310, 180, 30);

        tblLect.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_Lecteur", "Nom", "Prenom", "Mail", "Telephone", "Addresse", "Date_Inscription"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblLect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLectMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLect);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 730, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Date Inscription");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 520, 100, 20);

        dateLect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateLectActionPerformed(evt);
            }
        });
        getContentPane().add(dateLect);
        dateLect.setBounds(110, 510, 210, 30);

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
        jPanel1.setBounds(0, 270, 330, 280);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Nbre d'abonnés");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 470, 150, 30);

        nbreLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbreLivreActionPerformed(evt);
            }
        });
        getContentPane().add(nbreLivre);
        nbreLivre.setBounds(570, 470, 70, 30);

        setSize(new java.awt.Dimension(784, 666));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        if(nomLect.getText().equals("")||prenomLect.getText().equals("")
                ||mailLect.getText().equals("")||telLect.getText().equals("")||adresseLect.getText().equals("")||dateLect.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez compléter toutes les informations");
            
        }else{
            String[] colon={"Nom","Prenom","Addresse_email","Telephone","Addresse","DateInscrit"};
            String[] inf={nomLect.getText(),prenomLect.getText(),mailLect.getText(),
            telLect.getText(),adresseLect.getText(),dateLect.getText()};
            System.out.println(db.insert1("lecteur", colon, inf));
            table();
            actualiser();
        }
    }//GEN-LAST:event_ajouterActionPerformed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        if(nomLect.getText().equals("")||prenomLect.getText().equals("")
                ||mailLect.getText().equals("")||telLect.getText().equals("")
                ||adresseLect.getText().equals("")||dateLect.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez compléter toutes les informations");
            
        }else{
            String[] colon={"Nom","Prenom","Addresse_email","Telephone","Addresse","DateInscrit"};
            String[] inf={nomLect.getText(),prenomLect.getText(),mailLect.getText(),
            telLect.getText(),adresseLect.getText(),dateLect.getText()};
            String id=String.valueOf(tblLect.getValueAt(tblLect.getSelectedRow(),0));
            System.out.println(db.update("lecteur", colon, inf, "Id_Lecteur='" + id + "'"));
             table();
            actualiser();
        }
    }//GEN-LAST:event_modifierActionPerformed

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
     String id=String.valueOf(tblLect.getValueAt(tblLect.getSelectedRow(),0));
     if(JOptionPane.showConfirmDialog(this, "Etes-vous sùr de vouloir supprimer","Attention!!!",
             JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
             db.delete1("emprunts", "Id_lecteur=" + id);
             db.delete1("lecteur", "Id_Lecteur=" + id);
     }else{
         return;
     }
     table();
    }//GEN-LAST:event_supprimerActionPerformed

    private void actualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualiserActionPerformed
         rs=db.executionQuery("SELECT * FROM lecteur");
         try{
                  while (rs.next()) {
                     nbre1++; 
                     
                     nbreLivre.setText(""+nbre1);
                    
                  }
                   nbre1=0;
         }catch(SQLException ex){
         ex.printStackTrace();
     
    } 
        actualiser();
       table();
    }//GEN-LAST:event_actualiserActionPerformed

    private void rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheActionPerformed
       if(txt_recherche.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Veuillez entrer quelque chose");
       }else{
           if(com1.getSelectedItem().equals("Id_Lecteur")){
               rs=db.selectCondition("lecteur", "Id_Lecteur LIKE '%" +txt_recherche.getText() +"%' ");
               tblLect.setModel(new AffichageResultat(rs));
           }else if(com1.getSelectedItem().equals("Nom")){
              rs=db.selectCondition("lecteur", "Nom LIKE '%" +txt_recherche.getText() +"%' "); 
              tblLect.setModel(new AffichageResultat(rs));
           }else if(com1.getSelectedItem().equals("Prenom")){
              rs=db.selectCondition("lecteur", "Prenom LIKE '%" +txt_recherche.getText() +"%' "); 
              tblLect.setModel(new AffichageResultat(rs));
           }
       }
    }//GEN-LAST:event_rechercheActionPerformed

    private void tblLectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLectMouseClicked
     
      nomLect.setText(String.valueOf(tblLect.getValueAt(tblLect.getSelectedRow(),1)));
      prenomLect.setText(String.valueOf(tblLect.getValueAt(tblLect.getSelectedRow(),2)));
      mailLect.setText(String.valueOf(tblLect.getValueAt(tblLect.getSelectedRow(),3)));
      telLect.setText(String.valueOf(tblLect.getValueAt(tblLect.getSelectedRow(),4)));
      adresseLect.setText(String.valueOf(tblLect.getValueAt(tblLect.getSelectedRow(),5)));
      dateLect.setText(String.valueOf(tblLect.getValueAt(tblLect.getSelectedRow(),6)));
    }//GEN-LAST:event_tblLectMouseClicked

    private void dateLectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateLectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateLectActionPerformed

    private void Retour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Retour1ActionPerformed
         Bienvenue b=new Bienvenue();
         b.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_Retour1ActionPerformed

    private void quiiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quiiterActionPerformed
        this.dispose();
    }//GEN-LAST:event_quiiterActionPerformed

    private void nbreLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbreLivreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbreLivreActionPerformed

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
            java.util.logging.Logger.getLogger(Lecteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lecteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lecteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lecteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lecteur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retour1;
    private javax.swing.JButton actualiser;
    private javax.swing.JTextField adresseLect;
    private javax.swing.JButton ajouter;
    private javax.swing.JComboBox<String> com1;
    private javax.swing.JTextField dateLect;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mailLect;
    private javax.swing.JButton modifier;
    private javax.swing.JTextField nbreLivre;
    private javax.swing.JTextField nomLect;
    private javax.swing.JTextField prenomLect;
    private javax.swing.JButton quiiter;
    private javax.swing.JButton recherche;
    private javax.swing.JButton supprimer;
    private javax.swing.JTable tblLect;
    private javax.swing.JTextField telLect;
    private javax.swing.JTextField txt_recherche;
    // End of variables declaration//GEN-END:variables
}
