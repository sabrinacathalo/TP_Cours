package tp.thread;

public class StartExp1 {    
    public void run()  
    {    
        System.out.println("Thread is running...");    
    }    
    public static void main(String args[])  
    {    
        StartExp1 thread1=new StartExp1();
        thread1.run();    
    }    
}  