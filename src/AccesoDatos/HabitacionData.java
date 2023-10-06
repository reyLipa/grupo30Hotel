/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author URSULA
 */
public class HabitacionData {
//    private Connection conexion=null;
//
//    public HabitacionData() {
//        conexion=Conexion.getConexion();
//    }
//    
////////    public void guardarHabitacion(){
////////    String sql="INSERT INTO `habitacion`(INSERT INTO `habitacion`(`idTipoHab`, `numHabitacion`, `descripcion`, `estado`)VALUES (?,?,?)";
////////        try {
////////            PreparedStatement ps=conexion.prepareStatement(sql);
////////            ps.setInt(1, habitacion.getIdTipoHabitacion().getIdTipoHabitacion());
////////            ps.setInt(2, habitacion.getCodigo());
////////            ps.setBoolean(3, habitacion.isEstado());
////////            ps.executeUpdate();
////////            ResultSet rs = ps.getGeneratedKeys();
////////            if (rs.next()) {
////////                
////////                habitacion.setIdHabitacion(rs.getInt(1));
////////                JOptionPane.showMessageDialog(null, "Habitacion Guardada");
////////            }
////////            ps.close();
////////        } catch (SQLException ex) {
////////        }
//        }
}
