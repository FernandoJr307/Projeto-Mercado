
package Classes;


public class Usuario {
    private String usuario;
    private String nome;
    private String senha;
    private String confsenha;
    private int perfil;

    public Usuario(String usuario, String nome, String senha, String confsenha, int perfil) {
        this.usuario = usuario;
        this.nome = nome;
        this.senha = senha;
        this.confsenha = confsenha;
        this.perfil = perfil;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfsenha() {
        return confsenha;
    }

    public void setConfsenha(String confsenha) {
        this.confsenha = confsenha;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
    
    
    
}
