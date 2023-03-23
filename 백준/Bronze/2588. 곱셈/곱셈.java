import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        int num1 = sc.nextInt();


        int num2 = sc.nextInt();


        sc.close();

        int num_1 = (num1 * (num2%10));
        int num_2 = num1 * (num2%100 / 10);
        int num_3 = num1 * (num2/100);


        int num_4 = num1 * num2;


        System.out.println(num_1);
        System.out.println(num_2);
        System.out.println(num_3);
        System.out.println(num_4);




    }
}