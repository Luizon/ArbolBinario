public class ArbolBinario <T>{
	private NodoArbolBinario<T> raiz;
	
	public ArbolBinario() {
		raiz = null;
	}
	
	public void insertar(int llave, T contenido) {
		NodoArbolBinario<T> nuevoNodo = new NodoArbolBinario<T>(llave, contenido);
		
		if(raiz == null)
			raiz = nuevoNodo;
		else {
			NodoArbolBinario<T> auxiliar = raiz;
			while(auxiliar!=null) {
				nuevoNodo.setPadre(auxiliar);
				if(nuevoNodo.getLlave() >= auxiliar.getLlave()) {
					auxiliar = auxiliar.getDerecha();
				}
				else {
					auxiliar = auxiliar.getIzquierda();
				}
			}
			
			if(nuevoNodo.getLlave() < nuevoNodo.getPadre().getLlave()) {
				nuevoNodo.getPadre().setIzquierda(nuevoNodo);
			}
			else {
				nuevoNodo.getPadre().setDerecha(nuevoNodo);
			}
		}
	}
	
	public NodoArbolBinario<T> getRaiz() {
		return raiz;
	}
	
	public void setRaiz(NodoArbolBinario<T> raiz) {
		this.raiz = raiz;
	}

	// infijo = inorden
	public void recorridoInfijo(NodoArbolBinario<T> nodo) {
		recorridoInfijo(nodo, obtenerLlaveDelUltimoNodoDeUnSubarbol(-1, nodo));
	}
	
	public void recorridoInfijo(NodoArbolBinario<T> nodo, int llaveDelUltimoNodo) {
		if(nodo != null) {
			recorridoInfijo(nodo.getIzquierda(), llaveDelUltimoNodo);
			if(nodo.getLlave() == llaveDelUltimoNodo)
				System.out.print("└─");
			else
				System.out.print("├─");
			for(int i = 1 ; i < profundidadDeUnNodo(nodo) ; i++)
				System.out.print("──");
			System.out.println(" Llave: " + nodo.getLlave() + ", valor: " + nodo.getContenido());
			recorridoInfijo(nodo.getDerecha(), llaveDelUltimoNodo);
		}
	}
	
	private int obtenerLlaveDelUltimoNodoDeUnSubarbol(int llave, NodoArbolBinario<T> nodo) {
		if(nodo != null) {
			llave = nodo.getLlave();
			llave = obtenerLlaveDelUltimoNodoDeUnSubarbol(llave, nodo.getDerecha());
		}
		return llave;
	}

	private int profundidadDeUnNodo(NodoArbolBinario<T> nodo) {
		int altura = 0;
		while(nodo!=null) {
			altura++;
			nodo = nodo.getPadre();
		}
		return altura;
	}
}