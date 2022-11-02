package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgramLanguagesService;
import kodlama.io.Kodlama.io.Devs.entitties.concretes.ProgramLanguages;

@RestController
@RequestMapping("/api/languages")
public class ProgramsControllers {
	
	private ProgramLanguagesService languagesService;

	@Autowired
	public ProgramsControllers(ProgramLanguagesService languagesService) {
		this.languagesService = languagesService;
	}
	
	@GetMapping("/getall")
	public List<ProgramLanguages> getAll(){
		return languagesService.getAll();
		
	}
	
	
	
	
}
