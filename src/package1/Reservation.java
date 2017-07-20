package package1;    //This java file is inside package named package1 inside src folder.

public class Reservation    //class to Reserve the seat.
{
	static int availableSeats=20;   //int variable to store the value of available seats.
	
	//synchronized method to reserve seats.
	public synchronized void reserveSeat(int requestedSeats)
	{
		//Printing Statements and information about seats.
		System.out.println(Thread.currentThread().getName()+" entered");
		System.out.println("Available seats : " + availableSeats + " Requested seats : " + requestedSeats);
		
		//Checking that seats are available or not as per the requirement of user.
		//if seats are available
		if(availableSeats >= requestedSeats)
		{
			System.out.println("Seat Available. Reserve now :-)");
			//try-catch block to sleep the Thread.
			try
			{
				Thread.sleep(100);   // LINE E
			}
			catch (InterruptedException e)
			{
			    System.out.println("Thread interrupted");
			}
			//Printing details.
			System.out.println(requestedSeats + " seats reserved by "+Thread.currentThread().getName() + "." + "Wish you a Happy Journey:-)");
		    availableSeats = availableSeats - requestedSeats;    //Reducing number of seats which are booked.
		    System.out.println(availableSeats+" seats are still available");    //Printing available seats.
		}
		//if seats are not available.
		else
		{
			System.out.println("We are sorry but the requested seats not available :-("+ "."+"Requested seats should be equal to available seats, Please try again");   //Printing Statement.
		}
		
		//printing Statements.
		System.out.println(Thread.currentThread().getName() + " leaving.");   
		System.out.println("----------------------------------------------");
	}
}    //End of class.