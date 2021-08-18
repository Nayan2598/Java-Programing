import java.util.Scanner;
class DoSum{
    public static void main(String[] args) {
        int a=0,b=0,c;
        Scanner sc = new Scanner( System.in );
        System.out.print("Enter value for number 1 : ");
        a=sc.nextInt();
        System.out.print("Enter value for number 2 : ");
        b=sc.nextInt();
        c=a + b;
        System.out.println("sum of numbers 1 & 2 are : " +c);
    }
}

  