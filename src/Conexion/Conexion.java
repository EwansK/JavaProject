package Conexion;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;


/**
 *
 * @author Ewans Ewoldt - Victor Gonzalez
 */
public class Conexion {
 
    public static String bd= "bd_evaluacion3";
    public static String login="root";
    public static String pass="";
  
    
    public static String url= "jdbc:mysql://localhost:3306/bd_evaluacion3";
    public static Connection conn;
    public static Statement sentencia;
    
    public static boolean buscarUsuario;
    
    
    
    public static void conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, pass);
            if(conn !=null){
                System.out.println("Conexion establecida "+bd);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Hubo un problema");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public static void desconectar() throws SQLException{
    conn.close();
    }
}
