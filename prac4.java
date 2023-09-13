// import java.util.*;
class prac4 {
public static void main(String[] args) {
       sync s = new sync();
       s.start();
   }
}

//Sync of block

class sync extends Thread {
    public void run (){
        waiting w = new waiting();
        synchronized(w){
            try {
                w.met();
                w.wait();
            } catch (Exception e) {}
        }
    }
}


class waiting {
    synchronized public void met (){
        try {
            for (int i = 0; i < 20; i++) {
                System.out.print(".");
                Thread.sleep(100);
            }
        } catch (Exception e) {}
        this.notify();
    } 
}

//Sync of method