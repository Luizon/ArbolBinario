public class NodoArbolBinario<T> {
	private NodoArbolBinario<T> padre,
		derecha,
		izquierda;
	private int llave;
	private T contenido;
	
	public NodoArbolBinario(int llave, T contenido) {
		this.llave = llave;
		derecha = izquierda = padre = null;
		this.contenido = contenido;
	}
	
	public void setContenido(T contenido) {
		this.contenido = contenido;
	}
	
	public void setPadre(NodoArbolBinario<T> padre) {
		this.padre = padre;
	}
	
	public void setDerecha(NodoArbolBinario<T> derecha) {
		this.derecha = derecha;
	}
	
	public void setIzquierda(NodoArbolBinario<T> izquierda) {
		this.izquierda = izquierda;
	}
	
	public T getContenido() {
		return contenido;
	}
	
	public int getLlave() {
		return llave;
	}
	
	public NodoArbolBinario<T> getPadre() {
		return padre;
	}
	
	public NodoArbolBinario<T> getDerecha() {
		return derecha;
	}
	
	public NodoArbolBinario<T> getIzquierda() {
		return izquierda;
	}
}
