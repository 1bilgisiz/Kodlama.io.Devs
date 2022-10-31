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

}
