package package1;    //This java file is inside package named package1 inside src folder.

public class Person implements Runnable   //class declaration which implements Runnable interface.
{
	Reservation reserveTickets;   //Creating reference of Reservation class.
	int requestedSeats;     //int variable to store the requested number of seats.
	
	//Constructor.
	public Person(Reservation reserve, int requestedSeats) 
	{	
		//Initializing class variables by parameters passed in the constructor.
		reserveTickets=reserve;
		this.requestedSeats=requestedSeats;
	}

	@Override
	//overriding run method of Runnable interface. 
	public void run()
	{
		//Calling method of Reservation class using its object to book number of seats.
	    reserveTickets.reserveSeat(requestedSeats);
	}


}   //End of class.