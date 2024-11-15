
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws Exception{
        
        // System.out.printf("나이를 입력하세요:");
        // Scanner in = new Scanner(System.in);
        // System.out.printf("%d\n", in.nextInt());
        
        // System.out.printf("이름을 입력하세요");
        // Scanner in1 = new Scanner(System.in);
        // System.out.printf("&s\n",in1.nextLine());
       
       Scanner s = new Scanner(System.in);
       System.out.print("나이를 입력하세요: ");
       int age = s.nextInt();
       s.nextLine();

       System.out.print("이름을 입력하세요: ");
       String name = s.nextLine();
       
       System.out.printf("당신의 나이는 %d살이고 이름은 '%s'입니다.\n",age, name);
    
    }
    
}