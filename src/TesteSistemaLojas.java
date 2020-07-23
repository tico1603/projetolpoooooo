import java.sql.Connection;
import javax.swing.JOptionPane;




public class TesteSistemaLojas
{
    
    
    
  public static void main(String[] Args)
  {
        try{
            Connection teste = new ModuloConexao().conectar();
            JOptionPane.showMessageDialog(null,"conectado com sucesso!");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"erro ao conectar!");
        }
      
        //Janela janela = new Janela("Sistema de Lojas");
   
   
  }
  
  
  
  
  
}
