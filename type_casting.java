import java.util.Scanner;

class type_casting{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        float b = a;
        System.out.println("The value of a is :"+a);
        System.out.println("The value of a is :"+b);
    }
}

class wrapperclass{

    public static void main(String[] args) {
        Scanner scn =new Scanner (System.in);
        int a=10;
        Integer b=a;
        Integer c=10;
        int d=c;
        System.out.println("The  value of a is variable:" +a);
        System.out.println("The  value of a is wrapper class:" +b);
        System.out.println("The  value of a is wrapper class:" +c);
        System.out.println("The  value of a is variable:" +d);
    }
}

