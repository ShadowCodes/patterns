
public class TesteIncremental {
	public static void main(String[] args) {
		Incremental inc = Incremental.getInstance();
		
		Incremental inc2 = new Incremental();
		
		System.out.println(inc);
		
		System.out.println(inc2);
	}
}
