
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Gerente();
		
		funcionario.setNome("Marcus Santos");
		funcionario.setCpf("111.111.111-11");
		funcionario.setSalario(2000.00);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());

	}

}
