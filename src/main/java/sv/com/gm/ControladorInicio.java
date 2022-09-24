/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sv.com.gm.domain.Persona;
//import sv.com.gm.domain.Persona;

/**
 *
 * @author sergioperez
 */
@Controller
@Slf4j
public class ControladorInicio {
    
    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping("/")
    public String inicio(Model model){
        String saludar = "Hola mundo con thymeleaf 3";
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Flores");
        persona.setEmail("juan.flores@com");
        persona.setTelefono("77777777");
        
        Persona persona1 = new Persona();
        persona1.setNombre("Karla");
        persona1.setApellido("Flores");
        persona1.setEmail("karla.flores@com");
        persona1.setTelefono("77778877");
        
        log.info("Ejectando el controlador Spring MVC");
        //model.addAttribute("Mensaje", saludar);
        model.addAttribute("saludar", saludar);
        model.addAttribute("saludo", saludo);
        model.addAttribute("persona", persona);
        return "index";
    }
    
}
