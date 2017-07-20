package package1;       //This java file is inside package named package1 inside src folder.

public class SeatReservation    //Class declaration containing main function.
{

	public static void main(String[] args)    //main function declaration. and because it is static, program execution starts from main function.
	{
		//Creating object of Reservation class.
		Reservation reserve = new Reservation();
		
		//Creating three objects of Person class representing Three Persons and passing Reservation object and number of seats in the constructor.
		Person firstPerson = new Person(reserve,10);
		Person secondPerson = new Person(reserve,8);
		Person thirdPerson = new Person(reserve,4);
		
		//creating Three threads and passing Runnable implemented class objects and name of Thread in Constructor.
		Thread firstThread = new Thread(firstPerson,"Ashutosh");
		Thread secondThread = new Thread(secondPerson,"Nischay");
		Thread thirdThread = new Thread(thirdPerson,"Prasoon");
		
		//Starting all three Threads.
		firstThread.start();
		secondThread.start();
		thirdThread.start();
	}  //End of main function.

}   //End of class.

//COMPARISION BETWEEN CODE WHEN SYNCHRONIZED IS USED AND WHEN IT IS NOT USED-------
	/*
	 * Here, we are using synchronized block in run method.
	 * The use of that block here is to avoid use of same content of code by two threads at a time.
	 * For example, If we have two threads both are of class Customer.
	 * And if we start executing both threads, We don't know that at which point of time, which thread will be running.
	 * If let's say, You have 1000 Rs. balance in your Account.
	 * You have made two threads ThreadA and ThreadB. 
	 * ThreadA is passed to withdraw 600 Rs and ThreadB is passed to withdraw 500 Rs.
	 * If we execute the program without synchronized block , Then at that time, both threads will be in Runnable State for the function run() 
	 * in Customer class. And condition will be satisfied that (600 < 1000) and (500 < 1000). So both will be executed.
	 * And total withdrawn money will be 1100. But we had only 1000 Rs. in our balance.
	 * This problem occurred because both threads are working on same source code at the same time.
	 * We can encounter this problem by making restriction that at a time, only one thread is allowed to work on that source code.
	 * When the work of that thread completes, then only second thread is allowed to work.
	 * This restriction is called synchronization.
	 * We can use synchronized keyword with variables, methods and we even can make synchronized blocks like above.
	 * We will not be able to say that which Thread will execute first on synchronized block,
	 * But we can say that at a time, Only one thread will be working on that block. 
	 */