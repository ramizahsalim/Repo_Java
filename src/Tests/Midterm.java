package Tests;
/**
 * Question 1:
 * Create a method to return an array after remove a specific value from a given int array.
 * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
 * Returned array: {32, 14, 98, 56, 148, 78}
 *
 * Input array:     {1, 2, 4, 3, 1, 6, 1}    Remove: 11
 * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
 *
 */
/**
 * Question 2:
 * Create a method to return missing smallest positive integer (greater than 0) from given array.
 * Example:
 * 	For array : {1, 3, 5, 4, 2, 7}
 * 	Method should return : 6
 *
 * 	For array : {-1, -3, 4, 2}
 * 	Method should return : 1
 *
 * 	For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
 * 	Method should return : 4
 */

import java.util.Arrays;

/**
 * Question 3:
 * Scenario: Traffic ticketing system
 * Write a method, that will print (not return) the points charged against the license for over speeding.
 *    1. Speed Limit = 70
 *    2. Every 5 miles over the speed limit will add 1 point
 *    3. If user gets 12 points for a speed then license is suspended
 *
 *  Example:
 *      user speed = 78 ; 1 points
 *      user speed = 88 ; 3 points
 *      user speed = 178 ; 21 points (License suspended).
 *      user speed = 70 ; Thank you for driving within the speed limit.
 *
 *      88 -> 3
 *      70
 *      70-75 : 1
 *      75-80 : 1
 *      80-85 : 1
 *      85-88
 *
 */
public class Midterm {
    public static void main(String[] args) {

        System.out.println("Question 1: ");
        int[] originalArray = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int remove = 24;
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        if (Arrays.toString(originalArray).contains(Integer.toString(remove))) {
            String newArray = Arrays.toString(originalArray).replace(Integer.toString(remove), "");
            System.out.println("New Array: " + newArray);
        } else {
            System.out.println("This array does not contain " + remove);
        }


        System.out.println("Question 2: ");
        int[] setofNumbers = {0,5,-1,1,2,5,3,7,1,2};
        System.out.println("Given integers: "+ Arrays.toString(setofNumbers));
        int arraySize= setofNumbers.length;
        int missing = findMissing(setofNumbers,arraySize);
        System.out.println("The smallest positive missing number is " + missing);

        System.out.println("Question 3: ");
        double userSpeed = 85;
calculatePoints(userSpeed);
        }

        public static void calculatePoints(double yourSpeed) {
            double speedLimit = 70;
            double mileGap = 5;
            double points = 0;
            if (yourSpeed <= speedLimit) {
                System.out.println("Thank you for driving within the speed limit");
            } else {
                points = Math.floor((yourSpeed - speedLimit) / mileGap);
            }
            if (points >= 12) {
                System.out.println("Your Speed = " + yourSpeed + "; " + points + "points (License Suspended).");
            } else {
                System.out.println("Your speed = " + yourSpeed + "; " + points + "points");
            }
        }

        static int separate(int array[], int size){
        int j= 0, i;
        for (i=0; i<size; i++){
            if (array[i] <=0){
                int count;
                count=array[i];
                array[j]=count;
                j++;
            }
        } return j;
        }

        static int findMissingPositive(int array[],int size){
        int i;
        for (i=0; i<size; i++){
            int x = Math.abs(array[i]);
            if (x-1 < size && array[x-1]>0)
                array[x-1]=-array[x-1];
        }
        for (i=0; i < size; i++)
            if (array[i]>0)
                return i+1;
            return size + 1;
        }

        static int findMissing(int array[],int size){
        int separate = separate(array,size);
        int array2[] = new int[size-separate];
        int j = 0;
                for (int i=separate; i < size; i++){
                    array2[j] = array[i];
                    j++;
                } return findMissingPositive(array2,j);

        }


    }
