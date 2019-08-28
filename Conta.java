
public class Conta {
	
	private String nome;
	private double saldoCorrente;
	private double limite;
	private StringBuilder transacoes = new StringBuilder();

	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldoCorrente() {
		return saldoCorrente;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void deposito(double valor){
		if (valor <= 0){
			System.out.println("Não é possível depositar valores menores ou igual a zero.");
		}
		else {
			transacoes.append("\nSaldo anterior: " + saldoCorrente);
			transacoes.append("\nValor do deposito: " + valor + "\n");
			saldoCorrente += valor;
			transacoes.append("Saldo atualizado: " + saldoCorrente + "\n");
		}
	}
	public void saque(double valor){
		
		if (saldoCorrente >= valor){
			transacoes.append("Valor saque: " + valor + "\n");
			saldoCorrente -= valor;
			transacoes.append("Saldo atualizado: " + saldoCorrente + "\n");
		}
		
		else if ((saldoCorrente < valor) && (saldoCorrente + limite >= valor)){
			transacoes.append("Valor saque: " + valor + "\n");
			
			saldoCorrente = (saldoCorrente + limite) - valor;
			limite = limite - saldoCorrente ;
			System.out.println("Valor ultilizado do limite: " + limite + "\n");
			transacoes.append("\nLimite ultilizado: " + limite + "\nSaldo atualizado: " + saldoCorrente + "\n");
		}
		
		else {
			System.out.println("Valor para saque é maior que valor permitido\n" + "Valor disponível: " + (saldoCorrente + limite) + "\n");
			transacoes.append("\nSaldo: " + saldoCorrente);
		}
	}
	public void extrato(){
		System.out.println("Transações de conta: " + transacoes + "\n");
	}
	
	
	
}
