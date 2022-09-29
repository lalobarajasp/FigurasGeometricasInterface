public class Cuadrado implements FiguraGeometrica {
	//Definir variables como private permite la protección de los datos.
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
	//Métodos para el cálculo de Área y Perímetro
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
	//toString Impresión individual por figura.
	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado=" + lado + "]";
	}//toString


}//class Cuadrado
