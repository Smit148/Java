class SetNameThread extends Thread
{
    public void run()
    {System.out.println("Inside Run() method: "+Thread.currentThread().getName());}
}

class SetNAmeMethod
{
    public static void main(String[] args) 
    {
        System.out.println("Before Changing name in main() method: " +Thread.currentThread().getName());
        
        Thread.currentThread().setName("Avengeer");

        System.out.println("After Changing name in main() method: "+ Thread.currentThread().getName());

        // Create first Thread object
        SetNameThread t1= new SetNameThread();
        t1.setName("Steve");

        // Create Second Thread object
        SetNameThread t2 = new SetNameThread();
        t2.setName("Tony");

        // Start the treads
        t1.start();
        t2.start();

        // Print the threas names (after setname)
        System.out.println("Thread t1 name: "+ t1.getName());
        System.out.println("Thread t2 name: "+ t2.getName());
    }
}
