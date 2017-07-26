package hello;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import hello.AlumneRepository;

@RestController
public class MainController {
	
	@Autowired
	private AlumneRepository alumneRepository;


	@RequestMapping(path="/world")
	public String login () {
		
	return "hello world";
	}
	
	@RequestMapping(path="/alumne")
	public String add (@RequestParam Long id,@RequestParam String nom) {
		
		
		Alumne a = new Alumne();
		
		a.setIda(id);
		a.setNom(nom);		
			
		alumneRepository.save(a);
		
		return "alumne afegit";				
		}
		@RequestMapping(path="/list")
		public Iterable<Alumne> list () {	
			return alumneRepository.findAll();		
		}
}
		
