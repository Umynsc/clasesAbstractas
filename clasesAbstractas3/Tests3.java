package clasesAbstractas3;
public class Tests3 {
	public static void main(String[] args) {
		Electronico q = new Electronico("teclado",45,2000,10,"nexo","");
		System.out.println(q.toString());
		System.out.println();
		
		Alimento w =new Alimento("Yerba",000124,1250,05,2024,"alacena",false);
		System.out.println(w.toString());
		
		System.out.println();
		Ropa r = new Ropa("remera",00121410,540.0,"4");
		System.out.println(r.toString());
	}
}
