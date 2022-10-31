package kodlama.io.Kodlama.io.Devs.entitties.concretes;

public class ProgramLanguages {

	private int id;
	private String name;

	public ProgramLanguages() {

	}

	public ProgramLanguages(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
