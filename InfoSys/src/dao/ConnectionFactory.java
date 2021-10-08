package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private static final String URL ="C:\\Users\\dougl\\OneDrive\\Documentos\\GitHub\\ALPOO_UNIP_2021_4SEMESTRE\\InfoSys\\db.db";
    
    public static Connection getConnection(){
        try{
            
         return DriverManager.getConnection(URL);
        }catch (SQLException e){
            throw new RuntimeException("Erro de Conexão");
        }
    }
    
    public static void closeConnection(Connection con){
        try{
           if (con != null) con.close();
        }  catch (SQLException e){
            throw new RuntimeException("Erro no fechamento da conexão");
        }
    }

    public static void closeConnection(Connection con, PreparedStatement pst){
      try{
        if (pst != null) pst.close();
        closeConnection(con);
      } catch (SQLException e){
        throw new RuntimeException("Erro no fechamento do statement");
      }
    }

    public static void closeConnection(Connection com, PreparedStatement pst, ResultSet rs){
      try{
        if (rs != null) rs.close();
        closeConnection(com,pst);
      } catch (SQLException e){
        throw new RuntimeException("Erro no fechamento do result set");  
      }
    }
}