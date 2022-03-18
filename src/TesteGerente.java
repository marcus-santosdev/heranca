
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("Luiz Teixeira");
		gerente.setCpf("000.000.000-00");
		gerente.setSalario(5000.00);
		gerente.setSenha(1234);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		boolean autenticacao = gerente.autentica(1234);
		System.out.println(autenticacao);
		
		
		System.out.println(gerente.getBonificacao());

	}

}
