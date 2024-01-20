
/*
author: Jaydatt Patel
Threads (java.lang.Thread)

Thread can be created in two ways:
• extending Thread Classes.
• implementing the Runnable Interface (or)

Main difference between the 2 methods:  
• When the Thread class is extended, unique objects are created for each thread, and
further extensions of any other classes are not allowed. This is because Java does not
allow more than one class, leading to loss of inheritance benefits. 
• When Runnable is implemented, space is created for the instance or object, and this
is shared by the threads, allowing the extension of any class that isn't required.  

When multithreading used in a code that assigns a counter variable for every thread access,
we can observe that only one object or instance is created in the Runnable interface, which
is shredded amongst different threads. Therefore, the counter incrementation is done for
each and every point of access.  

In the Extend Class method, a new object is created for each thread accessed. Thereby the
counter resets and does not increment. This means that different memory is allocated for
each object. Due to this outcome, the runnable implementation approach is suggested over
the thread class extension. If a class is implementing the runnable interface, then your class
can extend another class. 

These provide several methods and constructors that assist in operation performance using
threads. Some of the constructors are
• Thread()
• Thread(Runnable obj or name)
• Thread(Runnable, String name)
• Thread(ThreadGroup group, Runnable target, String name)
• Thread(ThreadGroup group, Runnable target, String name, long stackSize)
Using these constructors, the thread class extends the Object class, which implements the
Runnable interface, creating the thread. 

There are many such methods involved in threading that are used to call a thread class
object. Examples of some of them are:

Commonly used methods of Thread class:
• public void run(): is used to perform action for a thread.
• public void start(): starts the execution of the thread.JVM calls the run() method on the thread.
• public void sleep(long miliseconds): Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
• public void join(): waits for a thread to die.
• public void join(long miliseconds): waits for a thread to die for the specified miliseconds.
• public int getPriority(): returns the priority of the thread.
• public int setPriority(int priority): changes the priority of the thread.
• public String getName(): returns the name of the thread.
• public void setName(String name): changes the name of the thread.
• public Thread currentThread(): returns the reference of currently executing thread.
• public int getId(): returns the id of the thread.
• public Thread.State getState(): returns the state of the thread.
• public boolean isAlive(): tests if the thread is alive.
• public void yield(): causes the currently executing thread object to temporarily pause and allow other threads to execute.
• public void suspend(): is used to suspend the thread(depricated).
• public void resume(): is used to resume the suspended thread(depricated).
• public void stop(): is used to stop the thread(depricated).
• public boolean isDaemon(): tests if the thread is a daemon thread.
• public void setDaemon(boolean b): marks the thread as daemon or user thread.
• public void interrupt(): interrupts the thread.
• public boolean isInterrupted(): tests if the thread has been interrupted.
• public static boolean interrupted(): tests if the current thread has been interrupted.

Inter-thread Communication : Java uses three methods, namely, wait(), notify(), and notifyAll(). All these methods belong to object class as final so that all classes have them. They must be used within a synchronized block only. 

• public final void wait() or wait(long): It tells the calling thread to give up the lock and go to sleep until some other thread enters the same monitor and calls notify().
• public final void notify(): It wakes up one single thread called wait() on the same object. It should be noted that calling notify() does not give up a lock on a resource.
• public final void notifyAll(): It wakes up all the threads called wait() on the same object.


                    wait()	               |vs|                sleep()
• The wait() method  releases the lock.	    ||  • The sleep() method doesn't release the lock.
• It is a method of Object class	        ||  • It is a method of Thread class
• It is the non-static method	            ||  • It is the static method
• It should be notified by                  ||  • After the specified amount of time,
    notify() or notifyAll() methods         ||	     sleep is completed.

 */

class C1 extends Thread
    {
      public void run(){
          for (int i = 0; i < 50; i++) 
              System.out.print( " + ");
          System.out.print("C1 Terminated.");
      }
    };

class C2 extends Thread
    {
		public void run(){
            for (int i = 0; i < 50; i++) 
                System.out.print( " - ");
            System.out.print("C2 Terminated.");
		}
    };

class C3 extends Thread
    {
		public void run(){
            for (int i = 0; i < 50; i++) 
                System.out.print(" x ");
            System.out.print("C3 Terminated.");
		}
    };
class Thread_using_extending_thread_class {

	public static void main(String args[])
	{
        C1 c1 = new C1();
        C2 c2 = new C2();
        C3 c3 = new C3();

        System.out.println("c1.isDaemon() : "+c1.isDaemon());    
        System.out.println("c2.isDaemon() : "+c2.isDaemon());
        System.out.println("c3.isDaemon() : "+c3.isDaemon());

        c1.setDaemon(true);    
        c2.setDaemon(false);
        c3.setDaemon(true);

		c1.start();
        c2.start();
        c3.start();

        while(c1.isAlive() || c2.isAlive() || c3.isAlive()){};

        System.out.println("\nAll Terminated.");
    
	}

}
