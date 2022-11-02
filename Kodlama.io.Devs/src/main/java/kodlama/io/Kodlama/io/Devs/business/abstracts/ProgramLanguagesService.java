package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entitties.concretes.ProgramLanguages;

public interface ProgramLanguagesService {

	List<ProgramLanguages> getAll();
	 ProgramLanguages getLanguageWithId(int id);

	    void updateLanguage(int languageId, String newName);

	    void addLanguage(ProgramLanguages language) throws Exception;

	    void deleteLanguage(int language);
}
