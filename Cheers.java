// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0];
                int crowedAmount = Integer.parseInt(args[1]);
                name = name.toUpperCase();
                String anLetters = "AEFHILMNORSX";
                for (int i = 0; i<name.length(); i++){
                    char currentCh = name.charAt(i);
                    if (anLetters.indexOf(currentCh)== -1){
                            System.out.println("Give me a "+ name.charAt(i)+": "+ name.charAt(i)+"!");
                    }else{
                            System.out.println("Give me an "+ name.charAt(i)+": "+ name.charAt(i)+"!");
                    }
                }
                System.out.println("What does that spell?");
                for (int i=1; i<=crowedAmount; i++){
                    System.out.println(name+"!!!");
                }
            }
    }
    