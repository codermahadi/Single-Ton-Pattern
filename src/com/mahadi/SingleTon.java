package com.mahadi;

/**
 * Created by Mahadi on 2/2/2018.
 */

public class SingleTon {

    private static SingleTon obj = null;

    private SingleTon(){

    }

    public static SingleTon getInstance(){

        if (obj == null){
            obj = new SingleTon();
        }

        return obj;
    }

    public void display(){
        System.out.println("SingleTon Pattern Example");
    }
}
