class WorkerThread implements Runnable {
    private int num;

    public WorkerThread(final String anydata) {
        this.num = num;

    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(6 + "X" + i + "= " +i*6 );
        }
    }
}

public class demo {
    public static void main(final String[] args) {
       
        WorkerThread obj1 = new WorkerThread("creating thread through runnable");
        final Thread t1 = new Thread(obj1);
        t1.start();
        t1.setName("first thread");
        System.out.println("ending");
    }
        
}