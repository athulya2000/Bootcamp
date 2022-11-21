import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        System.out.println(("menu:1.Addition\n 2.Subtraction \n 3.Multiplication \n 4.Division"));
        System.out.println(("Enter a two number"));
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        System.out.println("Please select number");
        int menu=s.nextInt();
        switch(menu){
            case 1:
                int ans=n1+n2;
                System.out.println(ans);

        }





    }
}
