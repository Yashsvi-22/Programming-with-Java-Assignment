class Buffer {

    int data;
    boolean available = false;

    synchronized void produce(int value) {

        while (available) {
            try {
                wait();
            } catch (Exception e) {}
        }

        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify();
    }

    synchronized void consume() {

        while (!available) {
            try {
                wait();
            } catch (Exception e) {}
        }

        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

class Producer extends Thread {

    Buffer buffer;

    Producer(Buffer b) {
        buffer = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
        }
    }
}

class Consumer extends Thread {

    Buffer buffer;

    Consumer(Buffer b) {
        buffer = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Buffer b = new Buffer();
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);
        p.start();
        c.start();
    }
}
