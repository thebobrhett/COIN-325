/****************
Bob Rhett - Tuesday, February 24, 2015
  Class to define an Integer Counter.
  Initial release
****************/
package Lab09;

import java.util.Scanner;

public class IntegerCount {
    final private int minInt = 0;
    final private int maxInt = 100;
    private int[][] intCount = new int[(maxInt - minInt) + 1][2];

    /****************
    / Constructor to set up a the integer counter.
    ****************/
    public IntegerCount() {
        for (int i = minInt; i < maxInt + 1; i++) {    //reinitialize the arrray
            intCount[i][0] = i;
            intCount[i][1] = 0;
        }
    }
    
    public void putIntegers(String mList) {
        String[] strList = mList.split(" ");    //parse the string into integers
        int[] intList = new int[strList.length];
        for (int i = 0; i < strList.length; i++) {
            intList[i] = Integer.parseInt(strList[i]);
        }

        boolean found = false;
        int nextFound = 0;
 
        for (int i = 0; i < intList.length; i++) {
            for (int j = 0; j < intCount.length; j++) {
                if (intList[i] == intCount[j][0]) {    //if the number matches
                    intCount[j][1]++;                  //count it
                    j = maxInt;
                }
            }
        }
    }
    
    public String getIntegers() {
        String result = "";
        int minOccurrences = 0;
        for (int i = 0; i < intCount.length; i++) {
            if (intCount[i][1] > minOccurrences) {
                result += intCount[i][0] + ": " + intCount[i][1] + "\n";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IntegerCount iCnt = new IntegerCount();

        System.out.println("Enter a series of integers separated by spaces:");
        String strList = scan.nextLine();
        
        iCnt.putIntegers(strList);
        System.out.println(iCnt.getIntegers());

    }
}
