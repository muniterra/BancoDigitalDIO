
public interface IConta {

	void depositar(double valor);
	
	void imprimirExtrato();
	
	void sacar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
}
