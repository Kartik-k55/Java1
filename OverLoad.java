class OverLoadDemo{
    void test(){
        System.out.println("No parameters");
    }
   void test(int a){
       System.out.println("a:"+a);
   }
   void test(int a , int b){
       System.out.println("a and b: "+a+" "+b);
   }
}
public class OverLoad {
    public static void main(String[] args){
        OverLoadDemo ob=new OverLoadDemo();
        ob.test();
        ob.test(10);
        ob.test(10,20);
    }
 }
