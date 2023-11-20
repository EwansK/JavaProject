package Back;

import Conexion.Conexion;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Totto
 */
public class Usuario {
    
    private String rut;
    private String nombre;
    private String contrasena;

    public Usuario() {
    }

    public Usuario(String rut, String nombreUsuario, String contrasena) {
        this.rut = rut;
        this.nombre = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuario{" + "rut=" + rut + ", nombreUsuario=" + nombre + ", contrasena=" + contrasena + '}';
    }
   
    
    public void imprimir(){
        System.out.println(toString());
    }

    public void guardarUsuario(){
        try {
            
            String strSQL = "INSERT INTO usuario VALUES ('" + rut + "', '" + nombre + "', '" + contrasena + "')";

            //String strSQL = "insert into 'usuario' values ('"+rut+"','"+nombre+"',"+contrasena+")";
            Conexion.conectar();
            Conexion.sentencia= Conexion.conn.prepareStatement(strSQL);
            Conexion.sentencia.execute(strSQL);
            System.out.println("Informacion Guardada.-");
            Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error en metodo utilizado");
        }
        
    }
    

    public void cargarRutUsuario(){
    
        try {
            Conexion.buscarUsuario=false;
            String strSQL= "select * from usuario where rut = '"+rut+"'";
            Conexion.conectar();
            Conexion.sentencia= Conexion.conn.prepareStatement(strSQL);
            ResultSet objRes = Conexion.sentencia.executeQuery(strSQL);
            if(objRes.next()){
            Conexion.buscarUsuario=true;
            rut = objRes.getString(1);
            nombre = objRes.getString(2);
            contrasena = objRes.getString(3);
            }
            Conexion.desconectar();
                    
        } catch (Exception e) {
            System.out.println("Error el buscar Usuario");
        }
    
    }
    
    
   public void actualizar(){
   
       try {
           
           String strSQL = "update usuario set nombre = '"+nombre+"',contrasena = '"+contrasena+"' where rut= '"+rut+"'";
           Conexion.conectar();
           Conexion.sentencia= Conexion.conn.prepareStatement(strSQL);
           Conexion.sentencia.execute(strSQL);
           System.out.println("Usuario modificado.-");
           Conexion.desconectar();
       } catch (Exception e) {
           System.out.println("Fallo actualizar");
       }
   }
           
   
   public void eliminarUsuario(){
   try {
           String strSQL = "delete from usuario where rut = '"+rut+"'";
           Conexion.conectar();
           Conexion.sentencia= Conexion.conn.prepareStatement(strSQL);
           Conexion.sentencia.execute(strSQL);
           System.out.println("Usuario Eliminado.-");
           Conexion.desconectar();
       } catch (Exception e) {
           System.out.println("Fallo Eliminacion");
       }
   
       
   }
   
public void consultarUsuario(String usuario,String contrasena){
Conexion.conectar();
String usuarioCorrecto = null;
String passCorrecto = null;

try {

        Conexion.conectar();
        PreparedStatement pst = Conexion.conn.prepareStatement("SELECT nombre, contrasena FROM usuarios");
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            usuarioCorrecto = rs.getString(1);
            passCorrecto = rs.getString(2);
        }

        if (usuario.equals(usuarioCorrecto) && contrasena.equals(passCorrecto)) {
            JOptionPane.showMessageDialog(null, "Login correcto Bienvenido " + usuario);
        } else if (!usuario.equals(usuarioCorrecto) || contrasena.equals(passCorrecto)) {

            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error " + e);
    }

}
 
}
