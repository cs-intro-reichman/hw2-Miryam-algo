// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numTerms = Integer.parseInt(args[0]);
		double calc = 0.0;
		for (int i=0; i<numTerms; i++){
			double fraction = 1.0/((2*i)+1);
			if (i%2==0){
				calc += fraction;
			} else {
				calc -= fraction;
			}
		}
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated:     "+(calc*4));
	}
}
