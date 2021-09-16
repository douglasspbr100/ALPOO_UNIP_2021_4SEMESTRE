package Model;

public class Tecnico {
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
    
    
    
}
