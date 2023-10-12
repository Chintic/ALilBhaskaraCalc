package Entities;

import static java.lang.Math.sqrt;

public class CalculoBhaskara
{
    public static double x1 = 5;
    public static double x2 = 5;
    public static double delta;    
    public static int twoTimesA;
    public static double sqrtDelta;
    public static double bPlusDelta;    
    public static double bMinusDelta;
    
    public static void calcularBhaskhara(int a, int b, int c)
    {
        delta = b * b - 4 * a * c;
        CalculoBhaskara.x1 = (-b + sqrt(delta)) / (2 * a);
        CalculoBhaskara.x2 = (-b - sqrt(delta)) / (2 * a);
        CalculoBhaskara.twoTimesA = 2 * a;
        CalculoBhaskara.sqrtDelta = sqrt(delta);
        CalculoBhaskara.bPlusDelta = -b + sqrt(delta);
        CalculoBhaskara.bMinusDelta = -b - sqrt(delta);
                
    }
}
