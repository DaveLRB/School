package com.mindera.school;

public class Arrays {
    /**
     * Create a function (getNegativeNumbers) that takes an array of integers and returns the number of elements in the
     * array that are negative numbers.
     * criar counter; for array; if array[i]<0; counter++
     */
    public int getNegativeNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Create a function (getNumberOfTimes) that takes an array of integers and an integer and returns the number of
     * times that number appears in the array.
     */
    public int getNumberOfTimes(int[] array, int number) {

        int sameNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                sameNumber++;
            }

        }
        return sameNumber;
    }

    /**
     * Create a function (getBooleanArray) that takes an array of integers and returns an array of booleans.
     * If the number is positive it will be replaced by true.
     * If it is negative or zero by false.
     */
    public boolean[] getBooleanArray(int[] array) {

        boolean[] positive = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {

            positive[i] = array[i] > 0;

            /*if (array[i] > 0) {

                positive[i] = true;
            } else
                positive[i] = false;*/
        }
        return positive;
    }

    /**
     * Create a function (getLargestNumber) that takes an array of integers and returns the position of the largest
     * number.
     */
    public int getLargestNumber(int[] array) {

        int position = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] > array[position]) {
                position = i;
            }
        return position;
    }

    /**
     * Create a function (getOddEvenArray) that takes an array of integers and replaces the odd numbers with -1 and the
     * even numbers with 1.
     */
    public int[] getOddEvenArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 1;
            } else {
                array[i] = -1;
            }
        }
        return array;
    }

    /**
     * Create a function (sumAllElements) that takes an array of integers and returns the sum of all values
     */
    public int sumAllElements(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * Create a function (removeElement) that takes an array of integers and a number and removes it from the array;
     */
    public int[] removeElement(int[] array, int number) {

        int samenumberIndex = 0;
        int counterIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                samenumberIndex++;
        }
        int[] outArray = new int[array.length - samenumberIndex];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                outArray[counterIndex] = array[i];
                counterIndex++;
            }
        }
        return outArray;
    }

    /**
     * Create a function (orderArray) that takes an array of integers and returns the array ordered from largest to
     * smallest.
     */
    public int[] orderArray(int[] array) {


        if(array.length == 0 || array.length == 1){
            return array;
        }
        int count = 0;
        for (int i=0; i< array.length; i++){
            for (int j = 0; j< array.length-1;j++){
                if(array[j]>array[j+1]){
                    count=array[j];
                    array[j]=array[j+1];
                    array[j+1]=count;
                }
            }
        }

        return array;
    }
}

