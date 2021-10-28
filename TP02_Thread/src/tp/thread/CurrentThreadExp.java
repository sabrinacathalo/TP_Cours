package tp.thread;

public class CurrentThreadExp extends Thread  
{    
    public void run()  
    {    
        System.out.println(Thread.currentThread().getName());    
    }    
    public static void main(String args[])  
    {    
        CurrentThreadExp thread1=new CurrentThreadExp();    
        CurrentThreadExp thread2=new CurrentThreadExp();    
        thread1.start();    
        thread2.start();    
    }    
}  