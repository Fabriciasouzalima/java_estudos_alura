//Gerente é um funcionários, herda a classe Funcionario
// e assina o contrato Autenticavel

public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticavelUtil autenticador; 

	public Gerente() {
		this.autenticador = new AutenticavelUtil();
	}

	public double getBonificacao() {
		return super.getSalario();

	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		 return this.autenticador.autentica(senha); 

	}

}
