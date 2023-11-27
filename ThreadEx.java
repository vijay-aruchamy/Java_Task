public class ThreadEx extends Thread {
   public  void run()//overriddden the run method present in thread
    {
        for(int i=0;i<2;i++)
        {
        System.out.println("Thread2");
        try
        {
        Thread.sleep(1500);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        }
    }
}

class Main1
{
public static void main(String[] args) {
    ThreadEx thread =new ThreadEx();

    thread.start();//to start the execution of a block of code.
    try{
        thread.join();//this line stops the execution of the main thread till the sub thread completes the process..
    }
    catch(Exception e)
    {
    e.printStackTrace();
    }
     for(int i=0;i<2;i++)
        {
        System.out.println("Thread1");
        try
        {
        Thread.sleep(1000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
}
}
}
