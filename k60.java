
class MultiThreadingOne extends Thread{
    public void run(){
    
          System.out.println("Thread "+Thread.currentThread().getName());
      }
      
    }

public class k60 {
    public static void main(String[] args){
        for(int i=0;i<50;i++){
            MultiThreadingOne mt1=new MultiThreadingOne();
            mt1.start();
           }
    }
}
