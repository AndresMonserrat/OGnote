package BasesDatos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Logica.Logicca;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLConectar {

    static Connection SQLConexion;
    static Statement statement;

    public static void SQL_Conectar() {

        //Ruta URL Base de Datos
        String host = "localhost";
        String puerto = "3306";
        String nameDB = "ognote";

        //Acceder
        String usuario = "root";
        String pass = "";

        //Driver
        String driver = "com.mysql.cj.jdbc.Driver";

        //Contruir URL
        String databaseURL = "jdbc:mysql://" + host + ":" + puerto + "/" + nameDB + "?useSSl=false";

        try {
            Class.forName(driver);
            SQLConexion = DriverManager.getConnection(databaseURL, usuario, pass);
            statement = SQLConexion.createStatement();
            System.out.println("Base de datos conectada");
        } catch (Exception ex) {
            System.out.println("base de datos no conectada");
        }
    }

    public static Connection getConectarDB() {
        return SQLConexion;
    }

    public static void SQL_Desconectar() {
        try {
            statement.close();
            SQLConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLConectar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean verificar(String correo, String contra) {
        try {
            String consulta = "SELECT email, password FROM registro";
            ResultSet resultSet = statement.executeQuery(consulta);
            while (resultSet.next()) {
                // Obtener datos de las columnas
                String email = resultSet.getString("email");
                String pass = resultSet.getString("password");

                //cuando quieras veificar si el correo ya esta inscrito y no dejar crear cuenta
                if (contra.isEmpty() && email.equals(correo)) {
                    return true;
                }
                //para que te deje entrar a la app
                if (!contra.isEmpty() && email.equals(correo) && pass.equals(contra)) {
                    resultSet.close();
                    return true;
                }
            }
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean agregar(String nombre, String correo, String contra) {
        try {
            Logicca carpetausuario = new Logicca();
            String consulta = "INSERT INTO registro (nombre, password, email) VALUES ('" + nombre + "', '" + contra + "', '" + correo + "')";

            int filasAfectadas = statement.executeUpdate(consulta);
            if (filasAfectadas > 0) {
                System.out.println("Persona agregada exitosamente.");
                //se debe crear el usuario de tipo persona.
               

                
                return true;
            } else {
                System.out.println("No se pudo agregar la persona.");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    /*
    public static void main(String[] args) throws SQLException {
        SQL_Conectar();
        boolean esta = verificar("camilo@hotmail.com", "");
        //boolean agrego = agregar("gringo","0631","samuel@gmail.com");
    }
     */
}
