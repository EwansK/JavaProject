/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Back;

import Conexion.Conexion;

/**
 *
 * @author Totto
 */
public class Sala2 {
    
    private int id;
    private String s2_dia_hora;
    private String disponibilidad;

    public Sala2() {
    }

    public Sala2(int id, String s2_dia_hora, String disponibilidad) {
        this.id = id;
        this.s2_dia_hora = s2_dia_hora;
        this.disponibilidad = disponibilidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getS2_dia_hora() {
        return s2_dia_hora;
    }

    public void setS2_dia_hora(String s2_dia_hora) {
        this.s2_dia_hora = s2_dia_hora;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Sala2{" + "id=" + id + ", s2_dia_hora=" + s2_dia_hora + ", disponibilidad=" + disponibilidad + '}';
    }
    
    
public void guardarhorario(){
        try {
            
            String strSQL = "INSERT INTO sala2 VALUES ('" + id + "', '" + s2_dia_hora + "', '" + disponibilidad + "')";

            Conexion.conectar();
            Conexion.sentencia= Conexion.conn.prepareStatement(strSQL);
            Conexion.sentencia.execute(strSQL);
            System.out.println("Informacion Guardada.-");
            Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error en metodo utilizado");
        }
         
    }
  

       public void actualizarSala2(){
   
       try {
           
           String strSQL = "update Sala2 set s2_dia_hora = '"+s2_dia_hora+"',disponibilidad = '"+disponibilidad+"' where id= '"+id+"'";
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
           
           String strSQL = "update sala2 set disponibilidad = '"+disponibilidad+"'";
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
