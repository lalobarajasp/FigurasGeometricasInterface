public class Rombo implements FiguraGeometrica {
	//Definir variables como private permite la protección de los datos.
	private String name;
	private double lado;
	private double diagonalMenor;
	private double diagonalMayor;
	
	//-------------------------------------------------------------------------------
	//Constructor
	public Rombo(String name, double lado, double diagonalMenor, double diagonalMayor) {
		super();
		this.name = name;
		this.lado = lado;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
	}//constructor Rombo
	
	//-------------------------------------------------------------------------------
	//Métodos para el cálculo de Área y Perímetro
	public double calcularArea() {
		return ((getDiagonalMayor() * getDiagonalMenor()) / 2);
	}//calcularArea
	
	public double calcularPerimetro() {
		return (getLado() * 2);
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

	public double getDiagonalMenor() {
		return diagonalMenor;
	}//getDiagonalMenor

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}//setDiagonalMenor

	public double getDiagonalMayor() {
		return diagonalMayor;
	}//getDiagonalMayor

	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}//setDiagonalMayor

	//-------------------------------------------------------------------------------
	//toString Impresión individual por figura
	@Override
	public String toString() {
		return "Rombo [name=" + name + ", lado=" + lado + ", diagonalMenor=" + diagonalMenor + ", diagonalMayor="
				+ diagonalMayor + "]";
	}//toString
	
	
}//class Rombo
