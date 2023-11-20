/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Back;

import Conexion.Conexion;
import static java.awt.event.PaintEvent.UPDATE;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Totto
 */
public class Sala1 {
    private int id;
    private String s1_dia_hora;
    private String disponibilidad;

    public Sala1() {
    }

    public Sala1(int id, String s1_dia_hora, String disponibilidad) {
        this.id = id;
        this.s1_dia_hora = s1_dia_hora;
        this.disponibilidad = disponibilidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getS1_dia_hora() {
        return s1_dia_hora;
    }

    public void setS1_dia_hora(String s1_dia_hora) {
        this.s1_dia_hora = s1_dia_hora;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Sala1{" + "id=" + id + ", s1_dia_hora=" + s1_dia_hora + ", disponibilidad=" + disponibilidad + '}';
    }


    
     public void guardarhorario(){
        try {
            
            String strSQL = "INSERT INTO sala1 VALUES ('" + id + "', '" + s1_dia_hora + "', '" + disponibilidad + "')";

            Conexion.conectar();
            Conexion.sentencia= Conexion.conn.prepareStatement(strSQL);
            Conexion.sentencia.execute(strSQL);
            System.out.println("Informacion Guardada.-");
            Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error en metodo utilizado");
        }
         
    }
  

       public void actualizarSala(){
   
       try {
           
           String strSQL = "update Sala1 set s1_dia_hora = '"+s1_dia_hora+"',disponibilidad = '"+disponibilidad+"' where id= '"+id+"'";
           Conexion.conectar();
           Conexion.sentencia= Conexion.conn.prepareStatement(strSQL);
           Conexion.sentencia.execute(strSQL);
           System.out.println("modificado.-");
           Conexion.desconectar();
       } catch (Exception e) {
           System.out.println("Fallo actualizar");
       }
   }

public void limpiarSala(){
   
       try {
           
           String strSQL = "update sala1 set disponibilidad = '"+disponibilidad+"'";
           Conexion.conectar();
           Conexion.sentencia= Conexion.conn.prepareStatement(strSQL);
           Conexion.sentencia.execute(strSQL);
           System.out.println("modificado.-");
           Conexion.desconectar();
       } catch (Exception e) {
           System.out.println("Fallo actualizar");
       }
   } 
       
}
