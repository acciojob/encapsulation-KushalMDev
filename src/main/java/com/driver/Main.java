package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwobject = new RWOnly();
        // obj.name="Hello";
        //System.out.println(obj.name);
        // Main.java:5: error: cannot find symbol
        /*
         * RWOnly obj=new RWOnly();
         * ^
         * symbol: class RWOnly
         * location: class Main
         * Main.java:5: error: cannot find symbol
         * RWOnly obj=new RWOnly();
         * ^
         * symbol: class RWOnly
         * location: class Main
         * 2 errors
         */
        rwobject.setName("Kushal");
        System.out.println(rwobject.getName());
    }
}