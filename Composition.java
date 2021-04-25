
public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat(1,"Elza","Brown",12);
		CatService cs = new CatService("Teodosia", cat);
		
		System.out.println(cs);

	}

}
