package Classes;

import javax.swing.JOptionPane;

public class Dados {
    
    private int maxusuarios=50;
    private Usuario Musuarios[] = new Usuario[maxusuarios];

    private int contusuario = 0;

    public Dados() {
        Usuario Musuario = new Usuario("fernando", "fernando", "admin", "admin", 1);
        Musuarios[contusuario] = Musuario;
        contusuario++;
    }
    
    public int NUsuario(){
        return contusuario;
    }
    
    
    public Usuario[] getUsuarios(){
        return Musuarios;
        
    }
    
    

    public boolean ValidarUsuario(String usuario, String senha) {
        boolean x = false;
        for (int i = 0; i < contusuario; i++) {
            if (Musuarios[i].getUsuario().equals(usuario) && Musuarios[i].getSenha().equals(senha)) {
                return true;
            }
        }
        return false;

    }
    
    public int LinhaUsuario(String usuario) {
        for (int i = 0; i < contusuario; i++) {
            if (Musuarios[i].getUsuario().equals(usuario)) {
                return i;
            }
        }
        return -1;

    }
    
    public String CadUsuario(Usuario MMusuario){
        if(contusuario==maxusuarios){
            return "Banco de Dados Cheio, impossivel realizar o Cadastro.";
            } 
        Musuarios[contusuario]=MMusuario;
        contusuario++;
        return "Cadastro Realizado Com Sucesso";
    }
    
    public String EditarUsuario(Usuario MMusuario, int posLinha){
        Musuarios[posLinha].setNome(MMusuario.getNome());
        Musuarios[posLinha].setUsuario(MMusuario.getUsuario());
        Musuarios[posLinha].setSenha(MMusuario.getSenha());
        Musuarios[posLinha].setPerfil(MMusuario.getPerfil());
        
        return "Cadastro Editado Com Sucesso";
    }
    
    public String DeletarUsuario(int posLinha){
        for(int i= posLinha; i<contusuario -1;i++){
          Musuarios[i]=Musuarios[i+1];  
        }
        contusuario--;
        return "Cadastro Deletado Com Sucesso";
    }
}