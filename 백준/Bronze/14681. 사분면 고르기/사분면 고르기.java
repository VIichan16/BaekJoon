import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.close();
        if(num1 >0){
            if(num2 > 0){
                System.out.println("1");
            } else if (num2 < 0) {
                System.out.println("4");

            }
        } else if (num1 < 0) {
            if (num2 > 0){
                System.out.println("2");
            } else if (num2 < 0) {
                System.out.println("3");

            }

        }

    }
}