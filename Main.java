
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		conta.deposito(150);
		conta.setLimite(50);
		conta.saque(100);
		conta.extrato();
		
		
		Conta conta1 = new Conta();
		conta1.deposito(100);
		conta1.setLimite(50);
		conta1.saque(100);
		conta1.extrato();
		
		Conta conta2 = new Conta();
		conta2.deposito(100);
		conta2.setLimite(50);
		conta2.saque(150);
		conta2.extrato();
		
		Conta conta3 = new Conta();
		conta3.deposito(100);
		conta3.setLimite(50);
		conta3.saque(180);
		conta3.extrato();
	}
	

}
