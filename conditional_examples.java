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

class LogicalOperationExample {
    public static void main(String[] args) {
        int age=25;
        boolean hasTicket=true;

        // and operator
        if (age >=18 && hasTicket) {
            System.out.println("you can enter a movie");        }
             
             //or Operator

          boolean isWeekend =true;
          boolean isHoliday =false;

             
          if (isWeekend ||  isHoliday) {
                System.out.println("you can relax");
          }

        // not operator

        boolean isRaining =false;

        if(!isRaining){
            System.out.println("you don't need an umbrella");
        }
    }
}