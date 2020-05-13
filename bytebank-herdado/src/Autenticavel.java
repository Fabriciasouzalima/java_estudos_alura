// contrato autenticavel
	// quem assina esse contrato, precisa implementar
		// metodo setSenha;
			// metodo autentica

public abstract interface Autenticavel {

	// não pode ter nada concreto = private int senha;

	public abstract void setSenha(int senha);

	// {this.senha = senha;}

	public abstract boolean autentica(int senha);

	// { if (this.senha == senha) { return true;} else {return false;}}

}
