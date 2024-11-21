// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		System.out.println(1 +" "+ 4 +" "+ 2 +" "+ 1);
		for (int i=2; i<=seed; i++){
			int printNum = i;
			while (printNum != 1){
				if (printNum%2 == 0){
					System.out.print(printNum+" ");
					printNum = (printNum/2);
				}else {
					System.out.print(printNum+" ");
					printNum = (printNum*3) + 1;
				}
			} System.out.println(1);
		}
	}
}