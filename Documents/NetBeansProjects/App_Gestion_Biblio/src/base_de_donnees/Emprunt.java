
package base_de_donnees;
import application.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author cherif
 */
public class Emprunt extends javax.swing.JFrame {

    ResultSet rs ,rs1,rs2;
    BDD db;
      String rd,rd1,rd2, test,test1,test3;
       
    int r=0,r1=0,nbre,nbre1=0;
    public Emprunt() {
        initComponents();
        db=new BDD(new Parametres().HOST_DB,new Parametres().USERNAME_DB,
                new Parametres().PASSWORD_DB,new Parametres().IPHOST,new Parametres().PORT);
        table();
        
    }
   
  public void table() {
            String a[]={"Id_emprunts","Id_lecteur","Id_livre","NomLecteur","Date_Emprunt","Date_RetourPrevu","Date_RetourEffective","Retard"};
            rs=db.select(a, "emprunts");
            tbl_emp.setModel(new AffichageResultat(rs));
            
        }
      
      void actualiser(){
          
          txt_idlect.setText("");
         txt_Idlivre.setText("");
         txt_namelect.setText("");
         txt_DateEmp.setText("");
         txt_DateRtr.setText("");
         txt_Date_RtrEff.setText("");
         txt_retard.setText("");
      }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_emp = new javax.swing.JTable();
        ajouterEmp = new javax.swing.JButton();
        modifierEmp = new javax.swing.JButton();
        supprimerEmp = new javax.swing.JButton();
        actualiserEmp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_idlect = new javax.swing.JTextField();
        txt_Idlivre = new javax.swing.JTextField();
        txt_DateEmp = new javax.swing.JTextField();
        BoutonRechEmp = new javax.swing.JButton();
        txt_rechercheEmp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cherchEmp = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txt_DateRtr = new javax.swing.JTextField();
        txt_retard = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_Date_RtrEff = new javax.swing.JTextField();
        Retour1 = new javax.swing.JButton();
        quiiter = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_namelect = new javax.swing.JTextField();
        rendre = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        nbreEmp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("                                      GESTION DES EMPRUNTS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 0, 469, 37);

        tbl_emp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_Emprunt", "Id_lecteur", "Id_livre", "Nom Lecteur", "Date_Emprunt", "Date_RetourPrevu", "Date_RetourEffective", "Retard"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_empMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_emp);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 50, 770, 90);

        ajouterEmp.setBackground(new java.awt.Color(48, 222, 240));
        ajouterEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ajouterEmp.setText("Ajouter");
        ajouterEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterEmpActionPerformed(evt);
            }
        });
        getContentPane().add(ajouterEmp);
        ajouterEmp.setBounds(70, 190, 120, 30);

        modifierEmp.setBackground(new java.awt.Color(48, 222, 240));
        modifierEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modifierEmp.setText("Modifier");
        modifierEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierEmpActionPerformed(evt);
            }
        });
        getContentPane().add(modifierEmp);
        modifierEmp.setBounds(190, 190, 120, 30);

        supprimerEmp.setBackground(new java.awt.Color(48, 222, 240));
        supprimerEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supprimerEmp.setText("Supprimer");
        supprimerEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerEmpActionPerformed(evt);
            }
        });
        getContentPane().add(supprimerEmp);
        supprimerEmp.setBounds(310, 190, 120, 30);

        actualiserEmp.setBackground(new java.awt.Color(48, 222, 240));
        actualiserEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        actualiserEmp.setText("Actualiser");
        actualiserEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualiserEmpActionPerformed(evt);
            }
        });
        getContentPane().add(actualiserEmp);
        actualiserEmp.setBounds(430, 190, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Id_Lecteur");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 290, 70, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Id_Livre");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 330, 50, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Date_Emprunt");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 410, 90, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Date_RetourPrevu");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 450, 110, 14);
        getContentPane().add(txt_idlect);
        txt_idlect.setBounds(120, 280, 210, 30);
        getContentPane().add(txt_Idlivre);
        txt_Idlivre.setBounds(120, 320, 210, 30);
        getContentPane().add(txt_DateEmp);
        txt_DateEmp.setBounds(120, 400, 210, 30);

        BoutonRechEmp.setBackground(new java.awt.Color(54, 211, 240));
        BoutonRechEmp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BoutonRechEmp.setText("Rchercher ");
        BoutonRechEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRechEmpActionPerformed(evt);
            }
        });
        getContentPane().add(BoutonRechEmp);
        BoutonRechEmp.setBounds(380, 390, 160, 40);
        getContentPane().add(txt_rechercheEmp);
        txt_rechercheEmp.setBounds(570, 390, 150, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Rechercher Par Catégorie :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 310, 160, 30);

        cherchEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id_Emprunt", "Id_lecteur", "Id_livre", " " }));
        getContentPane().add(cherchEmp);
        cherchEmp.setBounds(550, 310, 180, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText(" Retard");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 530, 70, 20);
        getContentPane().add(txt_DateRtr);
        txt_DateRtr.setBounds(120, 440, 210, 30);

        txt_retard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_retardActionPerformed(evt);
            }
        });
        getContentPane().add(txt_retard);
        txt_retard.setBounds(120, 520, 210, 30);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 470, 0, 0);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Date_RetourEffective");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 490, 120, 20);

        txt_Date_RtrEff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Date_RtrEffActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Date_RtrEff);
        txt_Date_RtrEff.setBounds(120, 480, 210, 30);

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

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("NomLecteur");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 370, 70, 14);

        txt_namelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namelectActionPerformed(evt);
            }
        });
        getContentPane().add(txt_namelect);
        txt_namelect.setBounds(120, 360, 210, 30);

        rendre.setBackground(new java.awt.Color(48, 222, 240));
        rendre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rendre.setText("Rendu");
        rendre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rendreActionPerformed(evt);
            }
        });
        getContentPane().add(rendre);
        rendre.setBounds(540, 190, 110, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 250, 350, 320);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Nbre d'emprunts");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(420, 480, 120, 20);
        getContentPane().add(nbreEmp);
        nbreEmp.setBounds(570, 480, 60, 30);

        setSize(new java.awt.Dimension(812, 659));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterEmpActionPerformed
        if(txt_idlect.getText().equals("")||txt_Idlivre.getText().equals("")
            ||txt_DateEmp.getText().equals("")||txt_DateRtr.getText().equals("")||txt_namelect.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez completer toutes les informations");

        }else{
            String[] colon={"Id_lecteur","Id_livre","NomLecteur","Date_Emprunt","Date_RetourPrevu","Date_RetourEffective","Retard"};
            String[] inf={txt_idlect.getText(),txt_Idlivre.getText(),txt_namelect.getText(),txt_DateEmp.getText(),
                txt_DateRtr.getText(),txt_Date_RtrEff.getText(),txt_retard.getText()};
             rs=db.selectCondition("livre","Id_Livre ='"+txt_Idlivre.getText()+"'");
             rs1=db.selectCondition("lecteur","Id_lecteur ='"+txt_idlect.getText()+"'");
           
             
                      // nbre=rs.getInt("Nbre_Exemplaire");
            
                  try{
                  while (rs.next()&& rs1.next()) {
                   test=rs.getString("Id_Livre");
                   nbre=rs.getInt("Nbre_Exemplaire");
                   if(test!=null && test!=null){
                       if(nbre<4){
                            if(nbre==0){
                     JOptionPane.showMessageDialog(this, "Il n y a pas d'exemplaire de ce livre.Emprunt impossible!!!"); 
                     r++;
                            }else{
                       JOptionPane.showMessageDialog(this, "Le nbre d'exemplaire de ce livre est inferieur à 4");
                         rd=db.executionUpdate("UPDATE livre SET Nbre_Exemplaire=Nbre_Exemplaire-1 "
                               + " WHERE Id_Livre= '"+txt_Idlivre.getText()+"'" );
                             
                    System.out.println(db.insert1("emprunts", colon, inf));
                    r++;}
                       }else{
                       rd=db.executionUpdate("UPDATE livre SET Nbre_Exemplaire=Nbre_Exemplaire-1 "
                               + " WHERE Id_Livre= '"+txt_Idlivre.getText()+"'" );
                             
                    System.out.println(db.insert1("emprunts", colon, inf));
                    r++;
                   }
                   
                   }
                   
                  }
                  if(r==0){
                      JOptionPane.showMessageDialog(this, "Le livre surlequel vous voulez faire un emprunt n'existe pas dans la bibliothèque \n\n                                  ou\n\nle lecteur n'existe pas .Veuillez verifiez les informations remplies"); 
                   }
                  }catch(SQLException ex){
         ex.printStackTrace();
         
   
    }//GEN-LAST:event_ajouterEmpActionPerformed
           r=0;
           table();
          actualiser();
                   
        }
        
    }  
    private void modifierEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierEmpActionPerformed
        if(txt_idlect.getText().equals("")||txt_Idlivre.getText().equals("")
            ||txt_DateEmp.getText().equals("")||txt_DateRtr.getText().equals("")|txt_namelect.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez compléter toutes les informations");

        }else{
            String[] colon={"Id_lecteur","Id_livre","NomLecteur","Date_Emprunt","Date_RetourPrevu","Date_RetourEffective","Retard"};
            String[] inf={txt_idlect.getText(),txt_Idlivre.getText(),txt_namelect.getText(),txt_DateEmp.getText(),
                txt_DateRtr.getText(),txt_Date_RtrEff.getText(),txt_retard.getText()};
            String id=String.valueOf(tbl_emp.getValueAt(tbl_emp.getSelectedRow(),0));
          
             
            System.out.println(db.update("emprunts", colon, inf, "Id_emprunts='" + id + "'"));
            table();
            actualiser();
        }
    }//GEN-LAST:event_modifierEmpActionPerformed

    private void supprimerEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerEmpActionPerformed
        String id=String.valueOf(tbl_emp.getValueAt(tbl_emp.getSelectedRow(),0));
        if(JOptionPane.showConfirmDialog(this, "Etes-vous sùr de vouloir supprimer","Attention!!!",
            JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
        db.delete1("emprunts", "Id_emprunts=" + id);
        }else{
            return;
        }
        table();
    }//GEN-LAST:event_supprimerEmpActionPerformed

    private void actualiserEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualiserEmpActionPerformed
        rs=db.executionQuery("SELECT * FROM emprunts");
         try{
                  while (rs.next()) {
                     nbre1++; 
                     
                     nbreEmp.setText(""+nbre1);
                    
                  }
                   nbre1=0;
         }catch(SQLException ex){
         ex.printStackTrace();
       
      
         
          
    }          
        actualiser();
        table();
    }//GEN-LAST:event_actualiserEmpActionPerformed

    private void BoutonRechEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRechEmpActionPerformed
        if(txt_rechercheEmp.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez entrer quelque chose");
        }else{
            if(cherchEmp.getSelectedItem().equals("Id_Emprunt")){
                rs=db.selectCondition("emprunts", "Id_emprunts LIKE '%" +txt_rechercheEmp.getText() +"%' ");
                tbl_emp.setModel(new AffichageResultat(rs));
            }else if(cherchEmp.getSelectedItem().equals("Id_livre")){
                rs=db.selectCondition("emprunts", "Id_livre LIKE '%" +txt_rechercheEmp.getText() +"%' ");
                tbl_emp.setModel(new AffichageResultat(rs));
            }else if(cherchEmp.getSelectedItem().equals("Id_lecteur")){
                rs=db.selectCondition("emprunts", "Id_lecteur LIKE '%" +txt_rechercheEmp.getText() +"%' ");
                 tbl_emp.setModel(new AffichageResultat(rs));
            }
        }
    }//GEN-LAST:event_BoutonRechEmpActionPerformed

    private void txt_retardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_retardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_retardActionPerformed

    private void tbl_empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_empMouseClicked
        txt_idlect.setText(String.valueOf(tbl_emp.getValueAt(tbl_emp.getSelectedRow(),1)));
     txt_Idlivre.setText(String.valueOf(tbl_emp.getValueAt(tbl_emp.getSelectedRow(),2)));
     txt_namelect.setText(String.valueOf(tbl_emp.getValueAt(tbl_emp.getSelectedRow(),3)));
      txt_DateEmp.setText(String.valueOf(tbl_emp.getValueAt(tbl_emp.getSelectedRow(),4)));
      txt_DateRtr.setText(String.valueOf(tbl_emp.getValueAt(tbl_emp.getSelectedRow(),5)));
      txt_Date_RtrEff.setText(String.valueOf(tbl_emp.getValueAt(tbl_emp.getSelectedRow(),6)));
     txt_retard.setText(String.valueOf(tbl_emp.getValueAt(tbl_emp.getSelectedRow(),7)));
      
      
    }//GEN-LAST:event_tbl_empMouseClicked

    private void txt_Date_RtrEffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Date_RtrEffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Date_RtrEffActionPerformed

    private void Retour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Retour1ActionPerformed
        Bienvenue b=new Bienvenue();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Retour1ActionPerformed

    private void quiiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quiiterActionPerformed
        this.dispose();
    }//GEN-LAST:event_quiiterActionPerformed

    private void txt_namelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namelectActionPerformed

    private void rendreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rendreActionPerformed
           if(txt_idlect.getText().equals("")||txt_Idlivre.getText().equals("")
            ||txt_DateEmp.getText().equals("")||txt_DateRtr.getText().equals("")||txt_namelect.getText().equals("")
                   ||txt_Date_RtrEff.getText().equals("")||txt_retard.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez compléter toutes les informations");

        }else{
            String[] colon={"Id_lecteur","Id_livre","NomLecteur","Date_Emprunt","Date_RetourPrevu","Date_RetourEffective","Retard"};
            String[] inf={txt_idlect.getText(),txt_Idlivre.getText(),txt_namelect.getText(),txt_DateEmp.getText(),
                txt_DateRtr.getText(),txt_Date_RtrEff.getText(),txt_retard.getText()};
            String id=String.valueOf(tbl_emp.getValueAt(tbl_emp.getSelectedRow(),0));
            rs2=db.selectCondition("lecteur","Id_lecteur ='"+txt_idlect.getText()+"'");
             rd2=db.executionUpdate("UPDATE livre SET Nbre_Exemplaire=Nbre_Exemplaire+1 WHERE Id_Livre= '"+txt_Idlivre.getText()+"'");
            System.out.println(db.update("emprunts", colon, inf, "Id_emprunts='" + id + "'"));
            table();
            actualiser();
        }
    }//GEN-LAST:event_rendreActionPerformed
   
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
            java.util.logging.Logger.getLogger(Emprunt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emprunt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emprunt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emprunt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emprunt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonRechEmp;
    private javax.swing.JButton Retour1;
    private javax.swing.JButton actualiserEmp;
    private javax.swing.JButton ajouterEmp;
    private javax.swing.JComboBox<String> cherchEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JButton modifierEmp;
    private javax.swing.JLabel nbreEmp;
    private javax.swing.JButton quiiter;
    private javax.swing.JButton rendre;
    private javax.swing.JButton supprimerEmp;
    private javax.swing.JTable tbl_emp;
    private javax.swing.JTextField txt_DateEmp;
    private javax.swing.JTextField txt_DateRtr;
    private javax.swing.JTextField txt_Date_RtrEff;
    private javax.swing.JTextField txt_Idlivre;
    private javax.swing.JTextField txt_idlect;
    private javax.swing.JTextField txt_namelect;
    private javax.swing.JTextField txt_rechercheEmp;
    private javax.swing.JTextField txt_retard;
    // End of variables declaration//GEN-END:variables
}
