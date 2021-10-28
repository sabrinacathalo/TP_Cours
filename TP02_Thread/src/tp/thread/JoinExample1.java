package tp.thread;

public class JoinExample1 extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<=4; i++)  
        {    
            try 
            {    
                Thread.sleep(500);    
            }catch(Exception e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {   
        JoinExample1 thread1 = new JoinExample1();    
        JoinExample1 thread2 = new JoinExample1();    
        JoinExample1 thread3 = new JoinExample1();    
        thread1.start();   
       try 
        {    
        thread1.join();    
        }catch(Exception e){System.out.println(e);}    
        thread2.start();   
        thread3.start();    
    }    
}  