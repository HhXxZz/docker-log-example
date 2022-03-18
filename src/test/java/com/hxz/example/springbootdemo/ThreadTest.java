package com.hxz.example.springbootdemo;

public class ThreadTest {

    public static void main(String[] args) {

        Thread thread = new Thread(){
            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName()+"run");
            }
        };

        thread.run();
        thread.start();

    }
}
