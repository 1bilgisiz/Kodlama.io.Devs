package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.entitties.concretes.ProgramLanguages;

@Repository
public interface ProgramLanguageRepostory {
	
	List<ProgramLanguages> getAll();
	
    void updatePlanguage(int language,String newName);

    void addPlanguage(ProgramLanguages language) ;

    void deletePlanguage(int language);

}
