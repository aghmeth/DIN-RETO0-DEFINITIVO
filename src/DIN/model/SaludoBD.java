/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIN.model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ale
 */
public class SaludoBD {
    private Statement stmt = null;
    private ResultSet rs = null;
    private Connection con = null;
    
    //mediante este constructor se comprueba la conexion con la base de datos
    public SaludoBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }catch (ClassNotFoundException e) {
            System.out.println("ERROR CLASS NOT FOUND");
        }catch (InstantiationException e) {
             System.out.println("ERROR IN THE INSTANTIATION");
        }catch (IllegalAccessException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }
    
    //con este constructor nos conectamos a la base de datos
    public Connection Connect() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/saludito?" + "user=root&password=abcd*1234=false");
        }catch (SQLException se) {
            System.out.println("ERROR: Connect.");
            System.out.println("SQLException: " + se.getMessage());
            System.out.println("SQLState: " + se.getSQLState());
            System.out.println("ERROR: " + se.getErrorCode());
            return null;
        }
    }
    
    //con el siguiente constructor nos desconectamos de la base de datos
    public void Disconnect() {
        try {
            if(rs != null || stmt != null || con != null) {
                rs.close();
                stmt.close();
                con.close();
            }
        }catch (SQLException se) {
            System.out.println("ERROR: Disconnect");
            System.out.println("SQLState: " + se.getSQLState());
            System.out.println("SQLException: " + se.getMessage());
            System.out.println("ERROR: " + se.getErrorCode());
        }
    }
    
    //ahora haremos el metodo getGreeting para obtener el saludo
    //@Override
    public String getGreeting() {
        String saludo = null;
        try {
            con = Connect();
            stmt = con.createStatement();
            
            if (stmt.execute("SELECT * FROM saludo")) {
                rs = stmt.getResultSet();
                
                while (rs.next()) {
                    saludo = rs.getString("SALUDO");
                }
            }
            
            Disconnect();
            
        }catch (SQLException se) {
            System.out.println("ERROR: Consult customer data");
            System.out.println("SQLState: " + se.getSQLState());
            System.out.println("SQLException: " + se.getMessage());
            System.out.println("ERROR: " + se.getErrorCode());
        }
        return saludo;
    }
}
