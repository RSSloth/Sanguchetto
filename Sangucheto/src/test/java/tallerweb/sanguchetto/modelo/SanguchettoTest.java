package tallerweb.sanguchetto.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

import tallerweb.sangucheto.modelo.Ingrediente;
import tallerweb.sangucheto.modelo.Sanguchetto;
import tallerweb.sangucheto.modelo.TipoIngrediente;

public class SanguchettoTest {

    @Test
    public void testVaciar() {
    	
    	Ingrediente ingredientePrueba= new Ingrediente();       
    	ingredientePrueba.setNombre("tomate");
    	ingredientePrueba.setPrecio(11.0);
    	ingredientePrueba.setTipo(TipoIngrediente.INGREDIENTE);
       
    	Sanguchetto miSanguchetto = Sanguchetto.getInstance();
    	miSanguchetto.vaciar();
    	miSanguchetto.agregarIngrediente(ingredientePrueba);
    	miSanguchetto.agregarIngrediente(ingredientePrueba);
    	miSanguchetto.agregarIngrediente(ingredientePrueba);
    	System.out.println(miSanguchetto.getPrecio());
    	miSanguchetto.vaciar();
    	System.out.println(miSanguchetto.getPrecio());
    	assertEquals(0.0, miSanguchetto.getPrecio(),0);
       
       
    }

    @Test
    public void testAgregarIngrediente() {
    	  Ingrediente ingredientePrueba= new Ingrediente();       
          ingredientePrueba.setNombre("tomate");
          ingredientePrueba.setPrecio(11.0);
          ingredientePrueba.setTipo(TipoIngrediente.INGREDIENTE);
          Sanguchetto miSanguchetto = Sanguchetto.getInstance();
          miSanguchetto.vaciar();
          miSanguchetto.agregarIngrediente(ingredientePrueba);
          miSanguchetto.agregarIngrediente(ingredientePrueba);
          miSanguchetto.agregarIngrediente(ingredientePrueba);
          Ingrediente ingredientePrueba2= new Ingrediente();
          ingredientePrueba2.setNombre("mayonesa");
          ingredientePrueba2.setPrecio(5.0);
          ingredientePrueba2.setTipo(TipoIngrediente.CONDIMENTO);
          miSanguchetto.agregarIngrediente(ingredientePrueba2);
          miSanguchetto.imprimirDetalle();
          assertEquals(38.0, miSanguchetto.getPrecio(),0);
          
    }

    @Test
    public void testVerIngredientes() {
        // Implementar
    	Ingrediente ingredientePrueba= new Ingrediente();       
        ingredientePrueba.setNombre("tomate");
        ingredientePrueba.setPrecio(11.0);
        ingredientePrueba.setTipo(TipoIngrediente.INGREDIENTE);
        Sanguchetto miSanguchetto = Sanguchetto.getInstance();
        miSanguchetto.vaciar();
        miSanguchetto.agregarIngrediente(ingredientePrueba);
        miSanguchetto.agregarIngrediente(ingredientePrueba);
        miSanguchetto.agregarIngrediente(ingredientePrueba);
        Ingrediente ingredientePrueba2= new Ingrediente();
        ingredientePrueba2.setNombre("mayonesa");
        ingredientePrueba2.setPrecio(5.0);
        ingredientePrueba2.setTipo(TipoIngrediente.CONDIMENTO);
        miSanguchetto.agregarIngrediente(ingredientePrueba2);
        assertEquals(3, miSanguchetto.verIngredientes().size());
        
    }

    @Test
    public void testVerCondimentos() {
        // Implementar
    	Ingrediente ingredientePrueba= new Ingrediente();       
        ingredientePrueba.setNombre("tomate");
        ingredientePrueba.setPrecio(11.0);
        ingredientePrueba.setTipo(TipoIngrediente.INGREDIENTE);
        Sanguchetto miSanguchetto = Sanguchetto.getInstance();
        miSanguchetto.vaciar();
        miSanguchetto.agregarIngrediente(ingredientePrueba);
        miSanguchetto.agregarIngrediente(ingredientePrueba);
        miSanguchetto.agregarIngrediente(ingredientePrueba);
        Ingrediente ingredientePrueba2= new Ingrediente();
        ingredientePrueba2.setNombre("mayonesa");
        ingredientePrueba2.setPrecio(5.0);
        ingredientePrueba2.setTipo(TipoIngrediente.CONDIMENTO);
        miSanguchetto.agregarIngrediente(ingredientePrueba2);
        assertEquals(1, miSanguchetto.verCondimentos().size());
        
    }

    @Test
    public void testGetPrecio() {
        // Implementar
    	Ingrediente ingredientePrueba= new Ingrediente();       
        ingredientePrueba.setNombre("tomate");
        ingredientePrueba.setPrecio(11.0);
        ingredientePrueba.setTipo(TipoIngrediente.INGREDIENTE);
        Sanguchetto miSanguchetto = Sanguchetto.getInstance();
        miSanguchetto.vaciar();
        miSanguchetto.agregarIngrediente(ingredientePrueba);
        miSanguchetto.agregarIngrediente(ingredientePrueba);
        miSanguchetto.agregarIngrediente(ingredientePrueba);
        Ingrediente ingredientePrueba2= new Ingrediente();
        ingredientePrueba2.setNombre("mayonesa");
        ingredientePrueba2.setPrecio(5.0);
        ingredientePrueba2.setTipo(TipoIngrediente.CONDIMENTO);
        miSanguchetto.agregarIngrediente(ingredientePrueba2);
        assertEquals(38, miSanguchetto.getPrecio(),0);
        
    }
}
