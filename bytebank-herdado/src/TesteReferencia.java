
public class TesteReferencia {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Jose");
		g1.setSalario(1000.0);

 		EditorDeVideo ed = new EditorDeVideo();
 		ed.setNome("Ed");
 		ed.setSalario(1000.00);
		

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
		controle.registra(ed);
		
		System.out.println(controle.getSoma());
	
		
		
		
	}
}
