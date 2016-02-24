

//Singleton unifica o acesso das inst�ncias, ou seja, elas pertencem somente a um endere�o de mem�ria
//�Garantir que uma classe tenha somente uma inst�ncia e fornece um ponto global de acesso para a mesma.�
public class Incremental {
	private static int count = 0;
	private int numero;
	private static Incremental incremental = null;

	public Incremental() {}

	public String toString() {
		return "Incremental " + numero;
	} 
	
	public static Incremental getInstance() {
		if (incremental == null) {
			incremental = new Incremental();
		}
		return incremental;
	}
}


