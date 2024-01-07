
/*
author: Jaydatt Patel
Threads (java.lang.Thread)

Thread can be created in two ways:
• implementing the Runnable Interface (or)
• extending Thread Classes.

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
s
 */

class A implements Runnable {
    public void run(){
            System.out.println("Running......Thread_using_implimenting_runnable_interface");
    }
}

class Thread_using_implimenting_runnable_interface  {

    public static void main(String[] args) {
        A obj = new A();
        Thread thread = new Thread(obj);
        thread.start();
    }
    
}
