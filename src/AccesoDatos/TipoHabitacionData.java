
package AccesoDatos;

import Entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class TipoHabitacionData {
    private Connection conexion=null;
    public TipoHabitacionData(){
        conexion = Conexion.getConexion();

}
    public void cambiarPrecio(TipoHabitacion tipohabitacion){
        
        
        String sql= "UPDATE tipohabitacion SET tipoHabitacion=?,cantPersonasMax=?,cantCamas=?"
                + ",tipoCamas=?,precioNoche=? WHERE idTipoHab=?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, tipohabitacion.getTipohabitacion()+"");
            ps.setInt (2, tipohabitacion.getCantPersonasMax());
            ps.setInt(3, tipohabitacion.getCantCamas());
            ps.setString(4, tipohabitacion.getTipoCamas()+"");
            ps.setDouble(5,tipohabitacion.getPrecioNoche());
            ps.setInt(6, tipohabitacion.getIdTipoHab());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El tipo de habitación  no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tipo de habitación " + ex.getMessage());
        }
    }
        
        
//        String sql= "UPDATE tipohabitacion SET tipoHabitacion=?,cantPersonasMax=?,cantCamas=?"
//                + ",tipoCamas=?,precioNoche=? WHERE idTipoHab=?";
//        //System.out.println(this.tipohabitacion.getTipoHabitacion()+"");
//         try {
//            PreparedStatement ps = conexion.prepareStatement(sql);
//            ps.setString(1,  tipohabitacion.getTipohabitacion()+"");
//            ps.setInt (2, tipohabitacion.getCantPersonasMax());
//            ps.setInt(3,  tipohabitacion.getCantCamas());
//            ps.setString(4,  tipohabitacion.getTipoCamas()+"");
//            ps.setDouble(5, tipohabitacion.getPrecioNoche());
//            ps.setInt(6, tipohabitacion.getIdTipoHab());
//
//            int exito = ps.executeUpdate();
//            if (exito == 1) {
//                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
//            } else {
//                JOptionPane.showMessageDialog(null, "El tipo de habitación  no existe");
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la Tipo de habitación " + ex.getMessage());
//        }
    }
    

