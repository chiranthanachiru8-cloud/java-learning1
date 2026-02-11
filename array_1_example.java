class array1dprint{
    public static void main (String[] args) {
        int[] numbers = {10,20,30,40,50};

        for (int i=0; i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }
    }
}


class array1dprint1{
    public static void main (String[] args) {
        int[] numbers = {10,20,30,40,50};
        int max=0;

        for(int num : numbers) {
            if(num>num){
           max=num;
            }
            
        }
System.out.println("max:"+max);

    }
}

class array {
    public static void main(String[] args) {

        int num = -10;   

        if (num > 0) {
            System.out.println("The number is Positive");
        } 
        else if (num < 0) {
            System.out.println("The number is Negative");
        } 
        else {
            System.out.println("The number is Zero");
        }
    }
}

 class largest {
    public static void main(String[] args) {

        int a = 10;
        int b = 25;
        int c = 15;

        if (a > b && a > c) {
            System.out.println("Largest number is: " + a);
        } 
        else if (b > a && b > c) {
            System.out.println("Largest number is: " + b);
        } 
        else {
            System.out.println("Largest number is: " + c);
        }
    }
}


 class vowel{
    public static void main(String[] args) {

        char ch = 'w';  

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");
        }
    }
}

class apple{
    public static void  main(String[] args) {
 String a=new  String("apple");
 String b=new String("apple");
a=b;
 System.out.println("a ="+a);
}
}

class arraysd {
    public static void main(String[] args) {
        // delara and initialize the array

       int[][] numbers = {{10,20,30},{40,509,60} };
       System.out.println(numbers[0][0]);
    }
}