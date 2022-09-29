public class Rectangulo implements FiguraGeometrica {
	//Definir variables como private permite la protección de los datos.
	private String name;
	private double base;
	private double altura;
	
	//-------------------------------------------------------------------------------
	//Constructor
	public Rectangulo(String name, double base, double altura) {
		super();
		this.name = name;
		this.base = base;
		this.altura = altura;
	}//constructor Rectangulo

	//-------------------------------------------------------------------------------
	//Métodos para el cálculo de Área y Perímetro
	public double calcularArea() {
		return (getBase() * getAltura());
	}//calcularArea
	
	public double calcularPerimetro() {
		return ((getBase() * 2) + (getAltura() * 2));
	}//calcularPerimetro
	
	//-------------------------------------------------------------------------------
	//Getters and Setters
	public String getName() {
		return name;
	}//getName

	public void setName(String name) {
		this.name = name;
	}//setName

	public double getBase() {
		return base;
	}//getBase

	public void setBase(double base) {
		this.base = base;
	}//setBase

	public double getAltura() {
		return altura;
	}//getAltura

	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura

	//-------------------------------------------------------------------------------
	//toString Impresión individual por figura.
	@Override
	public String toString() {
		return "Rectangulo [name=" + name + ", base=" + base + ", altura=" + altura + "]";
	}//toString

	
}// class Rectangulo
