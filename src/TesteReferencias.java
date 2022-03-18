  
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Willfred");
		gerente.setSalario(5000.00);
		
		EditorVideo edt = new EditorVideo();
		edt.setSalario(2000.00);
		
		Designer d = new Designer();
		d.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(edt);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
	}

}
