
public class TesteGerente {
	public static void main(String[] args) {
		
		// Funcionario (mãe) ou Autenticavel ou Gerente (pois são classes genericas) gerente = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("123.456.789-12");
		g1.setSalario(2000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
				
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}
}
