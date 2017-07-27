
package application;
import java.net.Socket;
import java.sql.*;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author cherif
 */
public class AffichageResultat extends AbstractTableModel {
    private ResultSet rs;
    
    public AffichageResultat(ResultSet rs){
        this.rs=rs;
        fireTableDataChanged();
    }
    
    
    //
   public int getColumnCount(){
       try{
           if(rs==null){
               return 0;
           }else{
               return rs.getMetaData().getColumnCount();
           }
       }catch (SQLException e) {
           System.out.println("Erreur lors de décompte du nombre de colonnes");
            System.out.println(e.getMessage());
            return 0;
       }
   }
   
   
   //
   
     public int getRowCount(){
       try{
           if(rs==null){
               return 0;
           }else{
               rs.last();
               return rs.getRow();
           }
       }catch (SQLException e) {
           System.out.println("Erreur lors de décompte du nombre de lignes");
            System.out.println(e.getMessage());
            return 0;
       }
   }
     
     //
   
   public Object getValueAt(int indexLigne,int indexColonne){
       if(indexLigne < 0 || indexLigne > getRowCount() || indexColonne < 0 || indexColonne > getColumnCount()){
           return null;
       }
       try{
           if(rs==null){
               return null;
           }else{
              rs.absolute(indexLigne + 1);
               return rs.getObject(indexColonne + 1);
           }
       }catch (SQLException e) {
           System.out.println("Erreur lors de décompte du nombre de colonnes");
            System.out.println(e.getMessage());
            return null;
       }
   }
   
   
   //
 public String getColumnName(int indexColonne){
      try{
           
             return rs.getMetaData().getColumnName(indexColonne + 1);
            
       }catch (SQLException e) {
           System.out.println("Erreur lors de décompte du nombre de colonnes");
            System.out.println(e.getMessage());
          
       }
      return super.getColumnName(indexColonne);
 }
 
    
}
