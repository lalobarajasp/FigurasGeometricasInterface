public class Cuadrado implements FiguraGeometrica {
	//Definir variables como private permite la protecci�n de los datos.
	private String name;
	private double lado;
	
	//-------------------------------------------------------------------------------
	//Constructor
	public Cuadrado(String name, double lado) {
		super();
		this.name = name;
		this.lado = lado;
	}//constructor Cuadrado
	
	//-------------------------------------------------------------------------------
	//M�todos para el c�lculo de �rea y Per�metro
	public double calcularArea() {
		return (getLado() * getLado());
	}//calcularArea
	
	public double calcularPerimetro() {
		return (getLado() * 4);
	}//calcularPerimetro

	//-------------------------------------------------------------------------------
	//Getters and Setters
	public String getName() {
		return name;
	}//getName

	public void setName(String name) {
		this.name = name;
	}//setName

	public double getLado() {
		return lado;
	}//getLado
	
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado

	//-------------------------------------------------------------------------------
	//toString Impresi�n individual por figura.
	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado=" + lado + "]";
	}//toString


}//class Cuadrado
