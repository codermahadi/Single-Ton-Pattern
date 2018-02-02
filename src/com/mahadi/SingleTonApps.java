package com.mahadi;

/**
 * Created by Mahadi on 2/2/2018.
 */
public class SingleTonApps {

    public static void main(String[] args) {

        SingleTon obj = SingleTon.getInstance();

        obj.display();
    }
}
