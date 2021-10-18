package dao;

import Model.Tecnico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TecnicoDAO implements dao.Persistencia<Tecnico>{
    
    public static TecnicoDAO dao = null;
    
    public TecnicoDAO(){
        
    }
    
    public static TecnicoDAO getInstance(){
        if (dao == null) dao = new TecnicoDAO();
        return dao;
    }

    @Override
    public int create(Tecnico t) {
       int id =0;
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement pst = null;
       ResultSet rs = null;
       String sql = "INSERT INTO Clientes (Nome,Salario,Valor Da Hora) Values (?,?,?)";
       try{
           pst = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
           pst.setString(1,t.getNome());
           pst.setDouble(2,t.getSalario());
           pst.setDouble(3,t.getValordahora());
           pst.execute();
           if (rs.next()) {
               id = rs.getInt(1);
       }
       } catch (SQLException ex){
           id = 0;
       } finally {
           ConnectionFactory.closeConnection(con, pst, rs);
       }
       
       return id;
    }
}
    
