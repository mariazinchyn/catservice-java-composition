
public class CatService {
	private String person;
	private Cat cat;
	public CatService(String person, Cat cat) {
		this.person = person;
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "CatService [person=" + person + ", cat=" + cat + "]";
	}
	
	

}
