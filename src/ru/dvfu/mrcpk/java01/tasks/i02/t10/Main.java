package ru.dvfu.mrcpk.java01.tasks.i02.t10;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Рассчитать общую массу всех планет Солнечной системы.
 * Вычислить среднее арифметическое масс планет.
 *
 * Затем - массу каждой планеты в процентном соотношении, если принять за 100% общую массу всех планет.
 *
 * Во сколько раз масса самой крупной планеты больше чем сумма масс всех остальных планет?
 *
 * Все результаты – показать на экране.
 * Рекомендуется использование типа BigDecimal.
 */

public class Main {

    // Earth radius, m (meters)
    public static double rEarth = 6.371E6;

    //gravitational constant, m^3 * kg^-1 * s^-2
    public static double G = 6.673E-11;

    //gravitational acceleration, m/s^2
    public static double g = 9.8;

    public static DecimalFormat decimalFormat = new DecimalFormat("0.###E0");


    public static void main(String[] args) {

        double mEarth = massPlanet(g,rEarth,G);
        System.out.println("Earth mass (double) = " + mEarth);

        BigDecimal mEarth1 = massPlanetBigDecimal(g,rEarth,G);
        System.out.println("Earth mass (BigDecimal) = " + decimalFormat.format(mEarth1));

        BigDecimal mJupiter = massPlanetBigDecimal(2.527*g,71.491E6,G);
        System.out.println("Jupiter mass (BigDecimal) = " + decimalFormat.format(mJupiter));

    }

    /** Масса одной планеты
     *
     * @return double, kg
     */
    public static double massPlanet(double ga, double r, double gc){
        return ga*r*r/gc;
    }

    public static BigDecimal massPlanetBigDecimal(double ga, double r, double gc){
        BigDecimal GA = BigDecimal.valueOf(ga);
        BigDecimal GC = BigDecimal.valueOf(gc);
        BigDecimal R = BigDecimal.valueOf(r);

        return GA.multiply(R.pow(2)).divide(GC, RoundingMode.HALF_UP);
    }

}
