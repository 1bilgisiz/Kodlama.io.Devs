package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgramLanguageRepostory;
import kodlama.io.Kodlama.io.Devs.entitties.concretes.ProgramLanguages;


@Service
public class ProgramLanguagesManager implements ProgramLanguagesService {

	private ProgramLanguageRepostory languageRepostory;

	public ProgramLanguagesManager(ProgramLanguageRepostory languageRepostory) {
		this.languageRepostory = languageRepostory;
	}

	@Override
	public List<ProgramLanguages> getAll() {
		return languageRepostory.getAll();
	}

	@Override
	public ProgramLanguages getLanguageWithId(int id) {
		return null;
	}

	@Override
	public void updateLanguage(int languageId, String newName) {
		languageRepostory.updatePlanguage(languageId, newName);
	}

	@Override
	public void addLanguage(ProgramLanguages language) throws Exception {
		languageRepostory.addPlanguage(language);
	}

	@Override
	public void deleteLanguage(int language) {
		languageRepostory.deletePlanguage(language);
	}



}
