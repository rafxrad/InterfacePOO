package banco.modelo;

public class Programa {
	
	public static void exibirEstado(IConta conta1, IConta conta2, IConta conta3, IConta conta4) {
		System.out.println("******************");
		System.out.println(conta1.toString());
		System.out.println(conta2.toString());
		System.out.println(conta3.toString());
		System.out.println(conta4.toString());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IConta conta1 = new ContaCorrente("123", "AA", "24-12-2020");

		IConta conta2 = new ContaPoupanca("321", "BB", "31/12/2020");
		
		IConta conta3 = new ContaInvestimento("432", "CC", "29/12/2020");
		
		IConta conta4 = new ContaSalario("787", "DD", "23/11/2019");
		
		
		
		
		// depositando money nas contas //
		
		conta1.depositar(100f);
		conta2.depositar(100f);
		conta3.depositar(100f);
		conta4.depositar(100f);
		
		
		exibirEstado(conta1, conta2, conta3, conta4);
		
		
		// transferindo money das contas //
		
		conta1.transferencia(conta2, 50f);
		conta3.transferencia(conta4, 25f);
		
		
		exibirEstado(conta1, conta2, conta3, conta4);
		
	
	
		// sacando money das contas //
	
		conta1.sacar(10f);
		conta2.sacar(20f);
		conta3.sacar(30f);
		conta4.sacar(40f);
		
		
		exibirEstado(conta1, conta2, conta3, conta4);
		
		
	}
	
}