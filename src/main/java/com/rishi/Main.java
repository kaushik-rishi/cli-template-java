package com.rishi;

import com.rishi.app.App;

public class Main {
    public static void main(String[] args) {
        App a = new App();
        a.setVal(10);
        System.out.println(a.getVal());
        a.setVal(69);
        System.out.println(a.getVal());
    }
}
