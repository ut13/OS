public class MyThread2 implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 4; i++)
        {
            System.out.println("child ");
        }
    }
}

class Main2
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThread2 t1 = new MyThread2();
        Thread t = new Thread(t1);      
        t.start();
        for (int i = 0; i < 4; i++)
        {
            System.out.println("Parent");
            Thread.sleep(3000);
        }
    }
}