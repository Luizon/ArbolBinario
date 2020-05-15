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
		
		System.out.println("\nMétodos get funcionando");
		
		Object nodos [] = new Object[] {
			arbol.getByContent("Uva"),
			arbol.getByContent("Pera"),
			arbol.getByContent("Naranja"),
			arbol.getByContent("Sandía"),
			arbol.getByContent("Platano"),
			arbol.getByContent("Manzana"),
			arbol.getByContent("Sandia"),
		};
		for(Object nodo: nodos) {
			nodo = nodo == null ? "nulo" : nodo;
			System.out.println("	Por contenido: " + nodo);
		}
		
		nodos = new Object[] {
			arbol.getByIndex(1),
			arbol.getByIndex(4),
			arbol.getByIndex(2),
			arbol.getByIndex(9),
			arbol.getByIndex(7),
			arbol.getByIndex(8),
		};
		System.out.println();
		for(Object nodo: nodos) {
			nodo = nodo == null ? "nulo" : nodo;
			System.out.println("	Por índice: " + nodo);
		}
	}
}
