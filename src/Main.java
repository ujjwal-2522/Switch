import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
//        String fruit=in.next();

//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "apple" -> System.out.println("red fruit");
//            case "orange" -> System.out.println("round fruit");
//            default -> System.out.println("please enter a valid number");
//        }


//        int day =in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thusday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//        }



        int day =in.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
        }
        //  CAN ALSO BE WEITTEN AS LIKE THIS

//        int day =in.nextInt();
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("weekend");
//        }
    }
}