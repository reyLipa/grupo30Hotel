
package AccesoDatos;

import Entidades.Huesped;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class HuespedData {
    private Connection conexion = null;
    public HuespedData(){
    conexion =Conexion.getConexion();
    }
    public void guardarHuesped(Huesped huesped){
        String sql="INSERT INTO huesped(tipoDocumento, numDocumento, apellido,"
                + " nombre, domicilio, celular, correo, estado, cancelacion)"
                + " VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=conexion.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS );
            ps.setString(1, huesped.getTipoDocumento());
            ps.setString(2, huesped.getNumDocumento());
            ps.setString(3, huesped.getApellido());
            ps.setString(4, huesped.getNombre());
            ps.setString(5, huesped.getDomicilio());
            ps.setInt(6, huesped.getCelular());
            ps.setString(7, huesped.getCorreo());
            ps.setBoolean(8, huesped.isEstado());
            ps.setBoolean(9, huesped.isEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
              huesped.setIdHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Huesped guardado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al aceder a la tabla huesped");
        }
    
    }
    public void eliminarHuesped(int id){
    try{
        String sql=" UPDATE huesped SET estado=0 WHERE idHuesped=?";
        PreparedStatement PS=conexion.prepareStatement(sql);
        PS.setInt(1, id);
        int fila= PS.executeUpdate();
        if(fila==1){
        JOptionPane.showMessageDialog(null, "husped eliminado");
        
        }
        PS.close();
    }catch(SQLException ex){
       JOptionPane.showMessageDialog(null, "Error al conectar la tabla Husped");
    }
    }
    public void modificarHuesped(Huesped huesped){
     String sql="UPDATE huesped SET tipoDocumento=?,apellido=?,"
             + "nombre=?,domicilio=?,celular=?,correo=? "
             + "WHERE numDocumento= ?";
     PreparedStatement ps =null;
        
     try {
            ps=conexion.prepareStatement(sql);
            //if (huesped.isEstado()==true) {
                
            ps.setString(1, huesped.getTipoDocumento());
           // ps.setString(2, huesped.getNumDocumento());
            ps.setString(2, huesped.getApellido());
            ps.setString(3, huesped.getNombre());
            ps.setString(4, huesped.getDomicilio());
            ps.setInt(5, huesped.getCelular());
            ps.setString(6, huesped.getCorreo());
            //ps.setInt(7, huesped.getIdHuesped());
            ps.setString(7, huesped.getNumDocumento());
            
            
            int exito= ps.executeUpdate();
            if (exito==1) {
                JOptionPane.showMessageDialog(null, "huesped modificado ");
             
         } else{
              JOptionPane.showMessageDialog(null, "huesped no encontrado");
            }
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se puede conectar a la tabla huesped");
        }
    }
    }
    
