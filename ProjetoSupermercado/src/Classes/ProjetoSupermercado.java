
package Classes;

import Formularios.frmLogin;


public class ProjetoSupermercado {

  
    public static void main(String[] args) {
         Dados msDados= new Dados();
        frmLogin Login = new frmLogin();
        Login.setDados(msDados);
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);
    }
    
}
