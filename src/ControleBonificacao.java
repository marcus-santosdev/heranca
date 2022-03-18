
public class ControleBonificacao {
	
	private double soma;
	
	//vantagem do polimorfismo
	//o metodo de bonificacao a ser chamado vai depender do tipo do objeto
	//por exemplo: ao instanciar um objeto do tipo gerente e realizar o seu registro, o metodo de bonificacao utilizado sera do tipo Gerente
	//desse modo evitamos de ter que criar um metodo especifico para cada tipo de objeto
	
	public void registra(Funcionario funcionario) {
		this.soma += funcionario.getBonificacao();
		//soma = soma + bonificação
	}
		
	public double getSoma() {
		return soma;
	}
}
