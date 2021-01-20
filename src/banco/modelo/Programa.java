package banco.modelo;

import javax.swing.JOptionPane;

import banco.excecao.ClienteNaoEncontradoException;
import banco.persistencia.IPersistenciaCliente;
import banco.persistencia.PersistenciaEmArquivoCliente;


public class Programa {
	
	public static void main(String[] args) throws ClienteNaoEncontradoException {
		
		IPersistenciaCliente pac = new PersistenciaEmArquivoCliente();
		
		// Criar clientes
		ICliente cliente1 = new ClientePessoaFisica("111");
		ICliente cliente2 = new ClientePessoaJuridica("456", "Empresa","02/03/96", "rwsc@discente.ifpe.edu.br");
		
		// Criar conta
		IConta conta1 = new ContaCorrente("123", "BB", "10/10/10");
		IConta conta2 = new ContaPoupanca("895", "BB", "10/10/10");
		
		// Associar conta ao cliente
		
		cliente1.adicionarContaCliente(conta1);
		cliente2.adicionarContaCliente(conta2);
		
		// Cadastro os clientes no arquivo
		pac.cadastrarCliente(cliente1);
		pac.cadastrarCliente(cliente2);
		
		
		
		// Checando os clientes cadastrados
		System.out.println(pac.localizarClientePorCPF("111"));;
	    System.out.println(pac.localizarClientePorCNPJ("456"));;
		
		
		
	/*	try {
			obj = pac.localizarClientePorCPF("000");
		} catch (ClienteNaoEncontradoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		ICliente obj2 = pac.localizarClientePorCNPJ("456"); */
		
		//System.out.println(obj);
		//System.out.println(obj2);
		//System.out.println(obj3);
		
		

	}
	
}