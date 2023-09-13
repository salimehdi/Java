// main working class (simple)  ///
class bookTickets {
    static int count = 3 ;
    synchronized static public void book (){
         if (count > 0){      
            try {
            System.out.println("Your Booking Has Been Started...");
            for (int i = 0; i < 20; i++) {
                Thread.sleep(40);
                System.out.print(".");
            }
            System.out.println();
            System.out.println("Your Ticket Has Been Booked!");
            count --; 
            Thread.sleep(1000);
        } catch (Exception e) {}
    }
    else {
        System.out.println("Sorry for in convinience all the seats are occupied !");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            
        }
        
        }
    }
}
// thread with sync
class passengers extends Thread {
    bookTickets t ;
    passengers(bookTickets tickectOfPassengers){
        this.t = tickectOfPassengers ;
    }
    public void run () {
              t.book();
    }
}
// prac3
class prac3 {
public static void main(String[] args) {
    bookTickets t = new bookTickets();
    passengers p1 = new passengers(t);
    passengers p2 = new passengers(t);
    passengers p3 = new passengers(t);
    passengers p4 = new passengers(t);
    passengers p5 = new passengers(t);
    p1.start();
    p2.start();
    p3.start();
    p4.start();
    p5.start();
}
}