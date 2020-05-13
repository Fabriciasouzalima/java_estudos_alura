
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaPaulo = new Conta();
		
		contaPaulo.saldo = 200;
		contaPaulo.deposita(50);
		
		boolean conseguiuRetirar = contaPaulo.saca(30);
		System.out.println(conseguiuRetirar);
		System.out.println(contaPaulo.saldo);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		if(contaMarcela.transfere(300, contaPaulo)) {
			System.out.println("Transferência com sucesso");
		};
		System.out.println(contaMarcela.saldo);
		
		System.out.println(contaPaulo.saldo);
	}
}
