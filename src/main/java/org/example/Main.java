package org.example;

public class Main {
    public static void main(String[] args) {
        //1.继承Thread来实现多线程
        myThread mt =new myThread();
        mt.start();
        for (int i = 0; i < 6; i++) {
            System.out.println("主线程:输入" + i);
        }

    }
}