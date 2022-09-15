package Classe_objeto;

public class Paciente {
	
	// Crie uma classe paciente e apresente os atributos e métodos referentes esta classe //
	
	private String nomePaciente;
	private String sexo;
	private int peso;
	private double altura;
	
	public Paciente(String nomePaciente,String sexo,int peso,double altura) {
		
		this.nomePaciente = nomePaciente; 
		this.sexo = sexo; 
		this.peso = peso; 
		this.altura = altura; 
	}
	
	//declaração dos demais métodos da classe 

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void imprimirInfo() {
		System.out.println(nomePaciente+" é do sexo "+sexo+
				" possui o peso de "+peso+" e sua altura é de: "+altura);
		
	}
	
	

}
