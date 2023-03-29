import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int input_hour = sc.nextInt();
        int input_minute = sc.nextInt();


        int temp  = input_hour * 60 + input_minute; //시간을 분으로 바꿈
        temp = temp-45;
        if (temp < 0){ //만약 전날이라면 하루에 해당하는 분을 더해주기
            temp += 60 *24;
        }

        int output_hour = temp / 60;
        int output_minute = temp % 60;

        System.out.println(output_hour);
        System.out.println(output_minute);



    }
}