package Multithreading;

// Thread class 1
class MutiTask_MultiThreads1 extends Thread {
    public void run() {
        System.out.println("Multiple task multiple thread 1");
    }
}

// Thread class 2
class MutiTask_MultiThreads2 extends Thread {
    public void run() {
        System.out.println("Multiple task multiple thread 2");
    }
}

// Thread class 3
class MutiTask_MultiThreads3 extends Thread {
    public void run() {
        System.out.println("Multiple task multiple thread 3");
    }
}

public class MutiTask_MultiThreads {
    public static void main(String[] args) { // Corrected the main method signature
        MutiTask_MultiThreads1 thread1 = new MutiTask_MultiThreads1();
        thread1.start(); // Starting thread 1

        MutiTask_MultiThreads2 thread2 = new MutiTask_MultiThreads2();
        thread2.start(); // Starting thread 2

        MutiTask_MultiThreads3 thread3 = new MutiTask_MultiThreads3();
        thread3.start(); // Starting thread 3
    }
}
