import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int test_point = sc.nextInt();


        if (test_point >= 90) {
            System.out.println("A");
        } else if (test_point >= 80) {
            System.out.println("B");
        }else if (test_point >= 70) {
            System.out.println("C");
        }else if (test_point >= 60) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }


    }
}