package ru.dvfu.mrcpk.java10.poll.q12;

import java.util.HashMap;
import java.util.Map;

/**
 * Какой ожидается вывод в результате выполнения метода foo(boolean a, boolean b):
 *
 * Если a = true и b = true результат: "A && B"
 * Если a = true и b = false результат: "notB"
 * Если a = false и b = true результат: "ELSE"
 * Если a = false и b = false результат: "ELSE"
 */

public class Main {
    public static void main(String[] args) {
        foo(false,false);

        Map<String, String> map = new HashMap<>();
    }

    public static void foo( boolean a, boolean b)
    {
        if( a )
        {
            System.out.println("A");
        }
        else if(a && b)
        {
            System.out.println( "A && B");
        }
        else
        {
            if ( !b )
            {
                System.out.println( "notB") ;
            }
            else
            {
                System.out.println( "ELSE" ) ;
            }
        }
    }
}
