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
//        for (int i = 0; i < maxInts; i++) {    //reinitialize the arrray
//            intCount[i][0] = 0;
//            intCount[i][1] = 0;
//        }
    }
    
    public void putIntegers(String mList) {
        String[] strList = mList.split(" ");    //parse the string into integers
        int[] intList = new int[strList.length];
        for (int i = 0; i < strList.length; i++) {
            intList[i] = Integer.parseInt(strList[i]);
        }

        boolean found = false;
        boolean zeroFound = false;
        int nextFound = 0;
        int zeroLocation = 0;
 
        for (int i = 0; i < intList.length; i++) {
            for (int j = 0; j < intCount.length; j++) {
                if (intList[i] == intCount[j][0]) {    //if the number matches
                    if (intList[i] == 0) {             //if zero is found
                        if (zeroFound == false) {      //if it's the 1st time
                            intCount[nextFound][1]++;  //reserve a location for zero
                            zeroLocation = nextFound;
                            nextFound++;
                            zeroFound = true;
                            found = true;
                        }
                        else {
                            intCount[zeroLocation][1]++; //it it's not the first
                            found = true;                //time zero is found
                        }                                //add one to the location
                        j = intCount.length;
                    }
                    else {
                        intCount[j][1]++;    //if a non-zero integer is found
                        found = true;
                    }
                }
            }
            if (found == false) {
                if (intList[i] >= minInt && intList[i] <= maxInt) {
                    intCount[nextFound][0] = intList[i];  //create a new location
                    intCount[nextFound][1]++;             //for a new non-zero integer
                    nextFound++;
                }
            }
            else found = false;
        }
    }
    
    public String getIntegers() {
        String result = "";
        int minOccurrences = 0;    //set this depending on how you want to report the output
        for (int i = 0; i < intCount.length; i++) {
            if (intCount[i][1] > minOccurrences) {
                result += intCount[i][0] + ": " + intCount[i][1] + "\n";
            }
        }

        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IntegerCount iCnt = new IntegerCount();

        System.out.println("Enter a series of integers separated by spaces:");
        String strList = scan.nextLine();
        
        iCnt.putIntegers(strList);
        System.out.println(iCnt.getIntegers());

    }
}
