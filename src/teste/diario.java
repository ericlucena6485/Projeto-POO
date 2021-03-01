package teste;

public class diario extends login {
	private String local_viagem;
	private String voo;
	private int dia;
	private int mes;
	private int ano;
	private String feedback;

	public void setLocal_viagem(String local_viagem) {
		this.local_viagem = local_viagem;
	}

	
	public String getLocal_viagem() {
		return local_viagem;
	}

	public void setVoo(String voo) {
		this.voo = voo;
	}

	public String getVoo() {
		return voo;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getDia() {
		return dia;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getMes() {
		return mes;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}
	
	public void gerarRelatorio() {
		System.out.println("Você viajou para :"+getLocal_viagem());
		System.out.println("Você pegou o voo:"+getVoo());
		System.out.println("Viajou na data:"+ getDia() + "/" + getMes() + "/" + getAno());
		System.out.println("Você avaliou a sua viajem como:" + getFeedback());
		
		
		
	}

}
