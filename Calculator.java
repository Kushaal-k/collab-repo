import java.util.Scanner;

public class Calculator{
    public static int add(int a, int b)
    {
        return a+b;
    }
    
    public static int subtract(int a,int b)
    {
        return a-b;
    }
 
    public static int mul(int a , int b){
        return a*b;
    }

    public static float divide(int a, int b){
        if(b==0){
            return 0;
        }
        return a/b;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(add(num1,num2)); 
      
        System.out.println(mul(num1,num2));

        System.out.println(divide(num1,num2));

    }
}
