public class testFiguras {

	public static void main(String[] args) {
		//Se declaran las figuras geometricas con sus parametros según cada clase
		Triangulo t1 = new Triangulo("Triangulo 1", 20.0, 10.0, 15.0);
		Cuadrado c1 = new Cuadrado("Cuadrado 1", 127);
		Rectangulo r1 = new Rectangulo("Rectangulo 1", 22.0, 27.0);
		Rombo rb1 = new Rombo("Rombo 1", 15.0, 20.0, 10.0);
		Romboide rbd1 = new Romboide ("Romboide 1", 40.0, 22.0);
		Trapecio tp1 = new Trapecio ("Trapecio 1", 12.0, 18.0, 14.0, 14.0, 15.0);
		
		//-------------------------------------------------------------------------------
		//Se hace uso del método FiguraGeometrica
		testFiguras.imprimirCalculo((FiguraGeometrica) t1);
		testFiguras.imprimirCalculo((FiguraGeometrica) c1);
		testFiguras.imprimirCalculo((FiguraGeometrica) r1);
		testFiguras.imprimirCalculo((FiguraGeometrica) rb1);
		testFiguras.imprimirCalculo((FiguraGeometrica) rbd1);
		testFiguras.imprimirCalculo((FiguraGeometrica) tp1);
		
	}//main
	
	//-------------------------------------------------------------------------------
	//Impresión de datos
	public static void imprimirCalculo(FiguraGeometrica t) {
		System.out.println(t);
		System.out.println("+=======================================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea()+
				"\n" + "[El perimetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+=======================================================");
	}//imprimirCalculo

	
}//class testFiguras
