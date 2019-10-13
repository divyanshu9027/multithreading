public class Main extends Thread {
    public void run() {
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        Main deepu=new Main();
        deepu.start();
    }



}
