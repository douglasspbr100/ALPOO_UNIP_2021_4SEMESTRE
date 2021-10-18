package dao;

import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProdutoDAO implements dao.Persistencia<Produto>{
    
    public static ProdutoDAO dao = null;
    
    public ProdutoDAO(){
        
    }
    
    public static ProdutoDAO getInstance(){
        if (dao == null) dao = new ProdutoDAO();
        return dao;
    }

    @Override
    public int create(Produto p) {
       int id =0;
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement pst = null;
       ResultSet rs = null;
       String sql = "INSERT INTO Produto (Estoque,Custo,Valor) Values (?,?,?)";
       try{
           pst = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
           pst.setInt(1,p.getEstoque());
           pst.setDouble(2,p.getCusto());
           pst.setDouble(3,p.getValor());
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
    

