
public class TestaConexao {
	
	public static void main(String[] args) {
		
		try( Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Erro na conexão");
		}
		
	//-------------------------------	
//		Conexao con = null; 
//		
//		try {
//			con = new Conexao();
//			con.leDados();
//			
//		}catch(IllegalStateException ex) {
//			System.out.println("Erro na conexão");
//			
//		}finally {
//			con.close();
//		}
	}

}
