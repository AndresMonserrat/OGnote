package BasesDatos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import ModPersona.Usuario;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLConectar {

    static Connection SQLConexion;
    static Statement statement;
    static String ID;

    private static ArrayList<Usuario> Usuarios = new ArrayList<>();

    public static String getID() {
        return ID;
    }

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
            
            agregar();
            
            
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

    public static void agregar() throws SQLException {
        String consulta = "SELECT ID, email FROM registro";
        ResultSet resultSet = statement.executeQuery(consulta);
        while (resultSet.next()) {
            // Obtener datos de las columnas
            String email = resultSet.getString("email");
            int ID = Integer.parseInt(resultSet.getString("ID"));

            System.out.println(ID);

            Usuario user = new Usuario();
            user.setID(ID, email);
            Usuarios.add(user);
            //cuando quieras veificar si el correo ya esta inscrito y no dejar crear cuenta
            
        }
        resultSet.close();
    }

    public static boolean verificar(String correo) throws SQLException {
        String consulta = "SELECT ID, email FROM registro";
        ResultSet resultSet = statement.executeQuery(consulta);
        while (resultSet.next()) {
            // Obtener datos de las columnas
            String email = resultSet.getString("email");
            ID = resultSet.getString("ID");
            System.out.println(ID);
            //cuando quieras veificar si el correo ya esta inscrito y no dejar crear cuenta
            if (email.equals(correo)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verificar(String correo, String contra) {
        try {
            String consulta = "SELECT ID, email, password FROM registro";
            ResultSet resultSet = statement.executeQuery(consulta);
            while (resultSet.next()) {
                // Obtener datos de las columnas
                String email = resultSet.getString("email");
                String pass = resultSet.getString("password");
                ID = resultSet.getString("ID");
                System.out.println(ID);

                //para que te deje entrar a la app
                if (email.equals(correo) && pass.equals(contra)) {
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
            //Logicca carpetausuario = new Logicca();

            int filasAfectadas = statement.executeUpdate("INSERT INTO registro (nombre, password, email) VALUES ('" + nombre + "', '" + contra + "', '" + correo + "')");
            if (filasAfectadas > 0) {
                System.out.println("Persona agregada exitosamente.");
                //se debe crear el usuario de tipo persona.
                try {
                    int ID = 0;
                    String consulta = "SELECT ID FROM registro WHERE email =\"" + correo + "\"";
                    ResultSet resultSet = statement.executeQuery(consulta);
                    if (resultSet.next()) {
                        ID = resultSet.getInt(1);
                    }
                    Usuario user = new Usuario();
                    user.setID(ID, correo);
                    Usuarios.add(user);

                    resultSet.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

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
    
//    public static void main(String[] args) throws SQLException {
//        SQL_Conectar();
//        
//        
//        System.out.println(Usuarios);
//        //boolean agrego = agregar("gringo","0631","samuel@gmail.com");
//    
//    }
}
