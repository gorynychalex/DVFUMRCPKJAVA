package ru.dvfu.mrcpk.java10.poll.q11;

public class Main {
    public static void main(String[] args) {

        int x=5, y;

        for( ; x < 5; ){
            System.out.println(--x);
        }

        try {
            y = 5 / x;
        } catch (ArithmeticException e){
            System.out.println("ArithmenicException");
        } catch (NullPointerException e){
            System.out.println("NullPointerException");
        }

        System.out.println("finished x = " + x);
    }
}
