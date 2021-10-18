package Model;

import dao.ClienteDAO;

public class Cliente {
    
    private int codigo = 0;
    private String nome = null;
    private String cpf = null;
    private String fone = null;
    private String celular = null;
    private String email = null;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

       public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    public Cliente(String nome, String cpf, String fone, String celular, String email) {
    
        setNome(nome);
        setCpf(cpf);
        setFone(fone);
        setCelular(celular);
        setEmail(email);
        gravar();
    }    

    @Override
    public String toString() {
        String ret = null;
        ret = "Cliente.: [" + getNome() + "]\n" +
              "CPF.....: [" + getCpf() + "]\n" +
              "Telefone: [" + getFone() + "]\n" +
              "Celular.: [" + getCelular() + "]\n" +
              "Email...: [" + getEmail() + "]\n";
        return ret;
    }

 
    private void gravar(){
        ClienteDAO dao = new ClienteDAO();
        int codigo = dao.create(this);
        if (codigo > 0) setCodigo(codigo);
    }
    

    
}
