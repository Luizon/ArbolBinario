public class Index {
	public static void main(String[] args) {
		ArbolBinario<String> arbol = new ArbolBinario<String>();
		
		arbol.insertar(4, "Naranja");
		arbol.insertar(8, "Manzana");
		arbol.insertar(1, "Uva");
		arbol.insertar(9, "Sandía");
		arbol.insertar(7, "Pera");
		
		System.out.println("Derecha");
		arbol.recorridoInfijo(arbol.getRaiz().getDerecha());
		
		System.out.println("\n\nRaiz");
		arbol.recorridoInfijo(arbol.getRaiz());
		
		System.out.println("\n\nIzquierda");
		arbol.recorridoInfijo(arbol.getRaiz().getIzquierda());
	}
}
