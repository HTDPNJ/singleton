package com.hfut.test;

import com.hfut.SingleTon;

public class Test {
    public static void main(String[] args) {
        //懒汉式单例设计模式
        SingleTon singleTon=SingleTon.getInstance();
    }
}
