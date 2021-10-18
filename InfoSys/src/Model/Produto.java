package Model;

import dao.ProdutoDAO;

public class Produto {
    
    private int codigo = 0;
    private String descricao = null;
    private int estoque;
    private boolean ativo = false;
    private double valor = 0;
    private double custo = 0;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
      public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public Produto(String descricao, int estoque, double valor, double custo){
        setDescricao(descricao);
        setEstoque(estoque);
        setValor(valor);
        setCusto(custo);
        setAtivo(true);
        
    }

    @Override
    public String toString() {
         String ret = null;
         if(isAtivo()) ret = "[Ativo] -";
         else ret = "[Fora da Linha] -";
         ret = ret + "[Item: " + getDescricao() +
                     "] - [Estoque: " + getEstoque() +
                     "] - [Custo: " + getCusto() +
                     "] - [Preco de Venda: " + getValor() + "]";
         return ret;
    }

    private void gravar(){
        ProdutoDAO dao = new ProdutoDAO();
        int codigo = dao.create(this);
        if (codigo > 0) setCodigo(codigo);
    }
    
    
}
