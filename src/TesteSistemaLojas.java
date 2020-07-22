import java.sql.*;
import projetolpoooooo.ModuloConexao;


public class TesteSistemaLojas
{
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    /**
     *
     */
    public TesteSistemaLojas()
  {
   Janela janela = new Janela("Sistema de Lojas");
   conexao = ModuloConexao.conector();
      System.out.println("conexao");
  }
}
