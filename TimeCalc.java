public class TimeCalc {
    public static void main(String[] args) {
        int originalHours = Integer.parseInt(""+args[0].charAt(0)+args[0].charAt(1));
        int originalMinutes = Integer.parseInt(""+args[0].charAt(3)+args[0].charAt(4));
        int minutesAdd = Integer.parseInt(args[1]);
        int totalMinutes = (originalHours * 60) + originalMinutes + minutesAdd;
        int totalHours = totalMinutes / 60;
        int newHour = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours*60);
        if (newHour<10){
            System.out.print ("0"+newHour+":");
        } else {
            System.out.print (newHour+":");}
        if (newMinutes<10){
            System.out.println("0"+newMinutes);
        } else {    
            System.out.println(newMinutes);
        }            
    }
}