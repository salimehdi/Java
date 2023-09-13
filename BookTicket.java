// Example that shows multiple threads
// can execute the same method but in
// synchronized way.
import java.util.*;
class TicketBooking
{

	// if multiple threads(trains) trying to access
	// this synchronized method on the same Object
	// but only one thread will be able
	// to execute it at a time.
	Scanner sc=new Scanner(System.in);
	synchronized public void bookTicket()
	{
			int fare;
			
			try
			{
				System.out.println("Enter fair of ticket");
				fare=sc.nextInt();
				System.out.println("Wait your ticket booking is in process");
				for(int i=0;i<8;i++)
				{
					System.out.print("..\t");
					Thread.sleep(500);
				}
			}
			catch (Exception e)
			{
				System.out.println(e);
			}

			System.out.println("\nYour Ticket has been confirmed Successfully..");
		
	}
}

class Passenger extends Thread
{
	// Reference variable of type Line.
	TicketBooking ticket;

	Passenger(TicketBooking ticket)
	{
		this.ticket = ticket;
	}

	
	public void run()
	{
		ticket.bookTicket();
	}
}

class BookTicket
{
	public static void main(String[] args)
	{
		TicketBooking obj = new TicketBooking();

		// we are creating two threads which share
		// same Object.
		Passenger p1 = new Passenger(obj);
		Passenger p2 = new Passenger(obj);

		// both passengers will try to book ticket at same time .
		p1.start();
		p2.start();
	}
}

