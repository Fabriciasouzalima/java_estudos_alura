
public class TestaSomatoria {
	
	public static void main(String[] args) {
		int contador = 1;
		int total = 0;
		
		while(contador <=10) {
			
			//total = total + contador;
			total += contador;
			System.out.println(total);
			contador ++; 
			
		}
		System.out.println(total);
	}

}
