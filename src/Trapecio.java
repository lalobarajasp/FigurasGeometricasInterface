public class Trapecio implements FiguraGeometrica {
	//Definir variables como private permite la protección de los datos.
	private String name;
	private double baseMenor;
	private double baseMayor;
	private double ladoDerecho;
	private double ladoIzquierdo;
	private double altura;
	
	//-------------------------------------------------------------------------------
	//Constructor
	public Trapecio(String name, double baseMenor, double baseMayor, double ladoDerecho, double ladoIzquierdo,
			double altura) {
		super();
		this.name = name;
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.ladoDerecho = ladoDerecho;
		this.ladoIzquierdo = ladoIzquierdo;
		this.altura = altura;
	}//constructor Trapecio
	
	//-------------------------------------------------------------------------------
	//Métodos para el cálculo de Área y Perímetro
	public double calcularArea() {
		return (((getBaseMayor() + getBaseMenor()) * getAltura()) / 2);
	}//calcularArea
			
	public double calcularPerimetro() {
		return (getBaseMenor() + getBaseMayor() + getLadoDerecho() + getLadoIzquierdo());
	}//calcularPerimetro
	
	//-------------------------------------------------------------------------------
	//Getters and Setters
	public String getName() {
		return name;
	}//getName

	public void setName(String name) {
		this.name = name;
	}//setName

	public double getBaseMenor() {
		return baseMenor;
	}//getBaseMenor

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}//setBaseMenor

	public double getBaseMayor() {
		return baseMayor;
	}//getBaseMayor

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}//setBaseMayor

	public double getLadoDerecho() {
		return ladoDerecho;
	}//getLadoDerecho

	public void setLadoDerecho(double ladoDerecho) {
		this.ladoDerecho = ladoDerecho;
	}//setLadoDerecho

	public double getLadoIzquierdo() {
		return ladoIzquierdo;
	}//getLadoIzquierdo

	public void setLadoIzquierdo(double ladoIzquierdo) {
		this.ladoIzquierdo = ladoIzquierdo;
	}//setLadoIzquierdo

	public double getAltura() {
		return altura;
	}//getAltura

	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura

	//-------------------------------------------------------------------------------
	//toString Impresión individual por figura
	@Override
	public String toString() {
		return "Trapecio [name=" + name + ", baseMenor=" + baseMenor + ", baseMayor=" + baseMayor + ", ladoDerecho="
				+ ladoDerecho + ", ladoIzquierdo=" + ladoIzquierdo + ", altura=" + altura + "]";
	}//toString
	
	
}//class Trapecio
