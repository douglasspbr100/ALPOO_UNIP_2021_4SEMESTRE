package Model;

import dao.TecnicoDAO;

public class Tecnico {
    
    private int codigo = 0;
    private String nome = null;
    private double salario = 0;
    private double valordahora = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValordahora() {
        return valordahora;
    }

    public void setValordahora(double valordahora) {
        this.valordahora = valordahora;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Tecnico(String nome, double salario, double valordahora) {
        setNome(nome);
        setSalario(salario);
        setValordahora(valordahora);
        
    }

    @Override
    public String toString() {
        String ret = null;
        ret = ret + "[Nome: " + getNome() +
                     "] - [Salário: " + getSalario() +
                     "] - [Valor da Hora: " + getValordahora() + "]";
        return ret;
    }
    
    
    private void gravar(){
        TecnicoDAO dao = new TecnicoDAO();
        int codigo = dao.create(this);
        if (codigo > 0) setCodigo(codigo);
    }

   
   
}
