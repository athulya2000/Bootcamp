import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        System.out.println(("menu:\n 1.Addition\n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Exit"));
        System.out.println("Please select option");
        Scanner s = new Scanner(System.in);
        int menu = s.nextInt();
        if (menu == 5) {
            System.out.println("You are exited");
        } else {
            System.out.println(("Enter a two number"));
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            switch (menu) {
                case 1:
                    int ans = n1 + n2;
                    System.out.println("Result" + ans);
                    break;
                case 2:
                    int sub = n1 - n2;
                    System.out.println("Result" + sub);
                    break;
                case 3:
                    int mul = n1 * n2;
                    System.out.println("Result" + mul);
                    break;
                case 4:
                    try {
                        int div = n1 / n2;
                        System.out.println("Result" + div);
                    } catch (ArithmeticException e) {
                        System.out.println("exception occure"+e.toString());
                    }
                    break;
                default:
                    System.out.println("Enter the valid number");

            }


        }
    }
}
