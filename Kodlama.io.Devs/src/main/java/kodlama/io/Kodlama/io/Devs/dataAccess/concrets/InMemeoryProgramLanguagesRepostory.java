package kodlama.io.Kodlama.io.Devs.dataAccess.concrets;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgramLanguageRepostory;
import kodlama.io.Kodlama.io.Devs.entitties.concretes.ProgramLanguages;
@Repository
public class InMemeoryProgramLanguagesRepostory implements ProgramLanguageRepostory {

	List<ProgramLanguages> languages;

	public InMemeoryProgramLanguagesRepostory() {
		languages = new ArrayList<ProgramLanguages>();
		languages.add(new ProgramLanguages(1, "Java"));
		languages.add(new ProgramLanguages(2, "C#"));
		languages.add(new ProgramLanguages(3, "Python"));
		languages.add(new ProgramLanguages(4, "PHP"));
	}

	@Override
	public ProgramLanguages bring(int id) {

		return null;
	}

	@Override
	public List<ProgramLanguages> getAll() {

		return languages;
	}

	@Override
	public void add(ProgramLanguages programLanguages) {
	
		
	}

	@Override
	public void delete(int id, String name) {

	}

	@Override
	public void update(int id, String name) {

	}

}
