package com.company;

public class thread extends Thread{

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Thread" + Thread.currentThread().getName());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Thread" + Thread.currentThread().getName());
            }
        }).start();
    }

}
