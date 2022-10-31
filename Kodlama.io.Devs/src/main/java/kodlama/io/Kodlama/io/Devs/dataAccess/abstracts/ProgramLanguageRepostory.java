package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.entitties.concretes.ProgramLanguages;

@Repository
public interface ProgramLanguageRepostory {
	
	List<ProgramLanguages> getAll();
	
    void add(ProgramLanguages  programLanguages);
    void delete(int id, String name);
    void update(int id, String name);
    ProgramLanguages bring(int id);
	

}
