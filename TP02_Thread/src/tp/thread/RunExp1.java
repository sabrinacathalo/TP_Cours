package tp.thread;

public class RunExp1 implements Runnable  
{    
    public void run()  
    {    
        System.out.println("Thread is running...");    
    }    
    public static void main(String args[])  
    {    
        RunExp1 r1=new RunExp1();    
        Thread thread1 =new Thread(r1);    
        thread1.start();    
    }    
}  