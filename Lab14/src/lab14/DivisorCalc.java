/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;

/* Bob Rhett - Tuesday, March 31, 2015
 *   Demonstrate recursive programming
 *   by calculating greatest common denominator for two integers.
 */
public class DivisorCalc {
    public static int gcd(int num1, int num2) {
        int result = 0;
        if (num2 <= num1 && num1 % num2 == 0) {
            result = num2;
        }   else if (num1 < num2) {
                result = gcd(num2, num1);
            }   else {
                    result = gcd(num2, num1 % num2);
                }
        return result;
    }
}
