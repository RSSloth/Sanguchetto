package tallerweb.sangucheto.controladores;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import tallerweb.sangucheto.modelo.Ingrediente;
import tallerweb.sangucheto.modelo.IngredienteConStock;
import tallerweb.sangucheto.modelo.Stock;

@Controller
public class ControladorHome {

	@RequestMapping(path="Sanguchetto")
	public ModelAndView irAHome(){
		return new ModelAndView("home");
	}
	@RequestMapping(path="contacto")
	public ModelAndView irAContacto(){
		return new ModelAndView("contacto");
	}
	@RequestMapping ("/agregarIngrediente")
	public ModelAndView irAIngrediente(){
		ModelMap model = new ModelMap();
		Ingrediente miIngrediente = new Ingrediente();
		model.put("ingrediente", miIngrediente);
		return new ModelAndView("agregarIngrediente",model);
	}
	@RequestMapping ("/comprarStock")
	public ModelAndView comprarStock(){
		ModelMap model = new ModelMap();
		Stock miStock= Stock.getInstance();
		ArrayList<IngredienteConStock> misIngredientes=new ArrayList<IngredienteConStock>(); 
		misIngredientes=miStock.devolverIngredientes();
		model.put("stock", misIngredientes);
		return new ModelAndView("comprarStock",model);
	}
	@RequestMapping (path = "/agregado", method = RequestMethod.POST)
	public ModelAndView AgregarIngrediente(@ModelAttribute ("ingrediente") Ingrediente miIngrediente){
		ModelMap model = new ModelMap();
		/*model.put("nombre", miPersona.getNombre());
		model.put("apellido", miPersona.getApellido());
		model.put("mail", miPersona.getMail());*/
		Stock miStock= Stock.getInstance();
		miStock.agregarIngrediente(miIngrediente);
		model.put("lista", miStock.listarIngredientesDisponibles());
		
		return new ModelAndView ("stock",model);
}
	@RequestMapping(path="/verStock")
	public ModelAndView irAStock(){
		Stock miStock= Stock.getInstance();
		ModelMap model = new ModelMap();
		model.put("lista",miStock);
		return new ModelAndView("stock", model);
	}
}