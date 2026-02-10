
class example1{
    void hello(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        example1 obj=new example1();
        obj.hello();
    }

}

class example2{
    void add( int a,int b) {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        example2 obj=new example2();
        obj.add(10,20);
    }

}




class example5{
   static void staticMethod() {
     System.out.println("I am static");
   } 
 void instanceMethod() {
    System.out.println("I am Instance");
   }
 public static void main(String[] args) {
     staticMethod();

     example5 obj=new example5();
     obj.instanceMethod();
   }
 }

