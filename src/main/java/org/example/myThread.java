package org.example;
public class myThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("子线程输出："+i);
        }
    }
}
