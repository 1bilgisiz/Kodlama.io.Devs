package kodlama.io.Kodlama.io.Devs.webApi;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgramLanguagesService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgramLanguageRepostory;
import kodlama.io.Kodlama.io.Devs.entitties.concretes.ProgramLanguages;

@RestController
@RequestMapping("/api/languages")
public class Controllers {

	private ProgramLanguagesService languagesService;

	@Autowired
	public Controllers(ProgramLanguagesService languagesService) {
		this.languagesService = languagesService;
	}

	@GetMapping("/getall")
	public List<ProgramLanguages> getAll(){
		return languagesService.getAll();

	}
	
	@GetMapping("/getadd")
	public void addPlanguage(@RequestParam ProgramLanguages languages) throws Exception {
		languagesService.addLanguage(languages);
	}
	
	@GetMapping("/getupdate")
	public void updatePlanguage(@RequestParam int languageId, @RequestParam String newName) throws Exception {
		languagesService.updateLanguage(languageId,newName);
	}
	
	
	@GetMapping("/getdelete")
	public void deletePlanguage(@RequestParam int languages) throws Exception {
		languagesService.deleteLanguage(languages);
	}
	

}