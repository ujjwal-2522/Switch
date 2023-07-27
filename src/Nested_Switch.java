import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int empID=in.nextInt();
        String department=in.next();
        switch (empID) {
            case 1 -> System.out.println("");
            case 2 -> System.out.println("");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("welcome");
                    case "finance" -> System.out.println("good");
                }
            }
            default -> System.out.println("enter a valid number");
        }
    }
}
