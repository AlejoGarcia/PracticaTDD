
public class ArrayList {
	
	Nodo inicio, fin;
	
	public ArrayList(){
		inicio = null;
		fin = null;
	}
	
	public void put(String clave, String valor){
		if(inicio == null){
			inicio = new Nodo(clave,valor,null);
			fin = inicio;
		} else{
			fin.setSiguiente(new Nodo(clave,valor,null));
			fin = fin.getSiguiente();
		}
	}
	
	public String get(String clave){
		Nodo aux = inicio;
		while((aux.getClave()!=clave)&&(aux != null)){
			aux = aux.getSiguiente();
		}
		return aux.getValor();
	}
}
