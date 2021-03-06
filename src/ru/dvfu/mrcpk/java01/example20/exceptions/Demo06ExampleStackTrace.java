package ru.dvfu.mrcpk.java01.example20.exceptions;

public class Demo06ExampleStackTrace {
    public static void main(String[] args) {
        method1();
    }

    static void method1(){
        method2();
    }

    static void method2() {
        System.out.println("Method 3");
        method3();
    }

    static void method3() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();

        for(StackTraceElement st : ste){
            System.out.println("Line num = " + st.getLineNumber() + " " +st.getMethodName() + " " + st.getClassName());
        }
    }
}
