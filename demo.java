import java.util.Scanner;
class demo{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1=5;
        int num2=6;
        if(num1>num2)
        {
            System.out.println(num1+" is greater than "+num2);
        }
        else {
        
          System.out.println(num1+" is not greater than "+num2);
        }
     
     }
}

class Ifexample {
    public static void main(String[] args) {
        int age = 18;

        if(age >=18){
            System.out.println("you are an adult");
        }
    }
}

class Ifelseexample {
    public static void main(String[] args) {
        int number =7;

        if ( number % 2 ==0) {
            System.out.println(number +"is even");
        } else {
            System.out.println(number +"is odd");

        }
    }
}

class Gradeexample {
    public static void main(String[] args) {
        int marks =85;
         if(marks>=90){
            System.out.println("Grade:A");
           } else if(marks >=80){
            System.out.println("Grade:B");
            }else if(marks >=70){
            System.out.println("Grade:C");
             }else if(marks >=60){
            System.out.println("Grade:D");
            }else {
                System.out.println("Grade F");


            
         }
    }
}