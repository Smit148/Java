class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Runnable Child Thread: "+i);
        }
    }
}

class implementingRunnable 
{
    public static void main(String[] args) 
    {
        MyRunnable obj = new MyRunnable();

        Thread t1 = new Thread(obj);

        t1.start();

        for(int i=1;i<=5;i++)
        {
            System.out.println("Main Thread: "+i);
        }
    }    
}