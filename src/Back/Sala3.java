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
public class Sala3 {
    private int id;
    private String s3_dia_hora;
    private String disponibilidad;

    public Sala3() {
    }

    public Sala3(int id, String s3_dia_hora, String disponibilidad) {
        this.id = id;
        this.s3_dia_hora = s3_dia_hora;
        this.disponibilidad = disponibilidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getS3_dia_hora() {
        return s3_dia_hora;
    }

    public void setS3_dia_hora(String s3_dia_hora) {
        this.s3_dia_hora = s3_dia_hora;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Sala3{" + "id=" + id + ", s3_dia_hora=" + s3_dia_hora + ", disponibilidad=" + disponibilidad + '}';
    }

    

    
    public void guardarhorario(){
        try {
            
            String strSQL = "INSERT INTO sala3 VALUES ('" + id + "', '" + s3_dia_hora + "', '" + disponibilidad + "')";

            Conexion.conectar();
            Conexion.sentencia= Conexion.conn.prepareStatement(strSQL);
            Conexion.sentencia.execute(strSQL);
            System.out.println("Informacion Guardada.-");
            Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error en metodo utilizado");
        }
         
    }
  

       public void actualizarSala3(){
   
       try {
           
           String strSQL = "update Sala3 set s3_dia_hora = '"+s3_dia_hora+"',disponibilidad = '"+disponibilidad+"' where id= '"+id+"'";
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
           
           String strSQL = "update sala3 set disponibilidad = '"+disponibilidad+"'";
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
