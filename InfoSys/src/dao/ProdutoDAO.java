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
       String sql = "INSERT INTO Produto (Estoque,Custo,Valor) Values (?,?,?,?,?)";
       try{
           pst = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
           pst.setString(1,p.getDescricao());
           pst.setBoolean(2,p.isAtivo());
           pst.setInt(3,p.getEstoque());
           pst.setDouble(4,p.getCusto());
           pst.setDouble(5,p.getValor());
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

    @Override
    public Produto findByCodigo(int id) {
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement pst = null;
       ResultSet rs = null;
       Produto p = null;
       String sql = "SELECT * FROM Clientes Where Codigo = ?";
       try{
           pst = con.prepareStatement(sql);
           pst.setInt(1,id);
           rs = pst.executeQuery();
           while (rs.next()) {
               int codigo = rs.getInt("Codigo");
               String nome = rs.getString("Nome");
               boolean ativo = rs.getBoolean("Ativo");
               int estoque = rs.getInt("Estoque");
               double custo = rs.getDouble("Custo");
               double valor = rs.getDouble("Valor");
               p = new Produto(codigo,nome,ativo,estoque,custo,valor);
       }
       } catch (SQLException ex){
           throw new RuntimeException("Erro no SELECT.");
       } finally {
           ConnectionFactory.closeConnection(con, pst, rs);
       }
       
       return p;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Produto obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produto> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

