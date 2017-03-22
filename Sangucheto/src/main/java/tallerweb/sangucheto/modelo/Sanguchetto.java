package tallerweb.sangucheto.modelo;

import java.util.LinkedList;
import java.util.List;

public class Sanguchetto {

	private static Sanguchetto instance = new Sanguchetto();
	private List<Ingrediente> ingredientes = new LinkedList<Ingrediente>();
	
	private Sanguchetto(){}
	
	public static Sanguchetto getInstance(){
		return instance;
	}
	
	/**
	 * Elimina todos los ingredientes del sanguchetto.<br>
	 */
	public void vaciar(){
		this.ingredientes.removeAll(ingredientes);
	}
	
	/**
	 * Agrega un ingrediente al carrito.<br>
	 * @param ingrediente
	 */
	public void agregarIngrediente(Ingrediente ingrediente){
		this.ingredientes.add(ingrediente);
	}
	
	/**
	 * Lista todos los ingredientes que forman parte del sanguchetto.<br>
	 * @return
	 */
	public List<Ingrediente> verIngredientes(){
		// Implementar
		//Ingrediente tipoIngrediente=new Ingrediente();
		//tipoIngrediente.setTipo(TipoIngrediente.INGREDIENTE);
		List <Ingrediente> soloIngredientes= new LinkedList<Ingrediente>();
		for (Ingrediente ingredienteASumar : this.ingredientes) {
			if(ingredienteASumar.getTipo()==TipoIngrediente.INGREDIENTE){
				soloIngredientes.add(ingredienteASumar);
			}
			
		}
		return soloIngredientes;
	}
	
	/**
     * Lista todos los condimentos que forman parte del sanguchetto.<br>
     * @return
     */
    public List<Ingrediente> verCondimentos(){
    	List <Ingrediente> soloIngredientes= new LinkedList<Ingrediente>();
		for (Ingrediente ingredienteASumar : this.ingredientes) {
			if(ingredienteASumar.getTipo()==TipoIngrediente.CONDIMENTO){
				soloIngredientes.add(ingredienteASumar);
			}
			
		}
		return soloIngredientes;
    }
	
	/**
	 * Devuelve el precio total del sanguchetto.<br>
	 * @return
	 */
	public Double getPrecio(){
		// Implementar
		Double precio=0.0;
		for (Ingrediente ingredienteDelPedido : ingredientes) {
			precio=precio+ingredienteDelPedido.getPrecio();
			
		}
		
		return precio;
	}
	public void imprimirDetalle(){
		System.out.println("INGREDIENTE");
		for (Ingrediente ingrediente : this.verIngredientes()) {
			System.out.println(ingrediente.getNombre()+" "+ingrediente.getPrecio());
			
		}
		System.out.println("CONDIMENTOS");
		for (Ingrediente ingrediente : this.verCondimentos()) {
			System.out.println(ingrediente.getNombre()+" "+ingrediente.getPrecio());
		}
	}
}
