package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {

    private int[] dynamicIntArray;
    private static int count = 0;

    public DynamicIntArray(){
        dynamicIntArray = new int[0];
    }

    public DynamicIntArray(int length){
        dynamicIntArray = new int[length];
    }

    public void add(int number){
        int newDynamicArrayLength = dynamicIntArray.length + 1;
        int[] newDynamicArray = new int[newDynamicArrayLength];
        int lastIndexInNewArray = newDynamicArrayLength - 1;

        System.arraycopy(dynamicIntArray, 0, newDynamicArray, 0, dynamicIntArray.length);
        newDynamicArray[lastIndexInNewArray] = number;
        dynamicIntArray = newDynamicArray;

    }

    public void remove(int removeElementAtIndex) throws ArrayIndexOutOfBoundsException{

        checkIndexExist(removeElementAtIndex);

        int newDynamicArrayLength = dynamicIntArray.length - 1;
        int[] newDynamicArray = new int[newDynamicArrayLength];

        for(int i = 0, j = 0; i < newDynamicArrayLength; i++, j++){

            if(j == removeElementAtIndex) j++;

            newDynamicArray[i] = dynamicIntArray[j];
        }

        dynamicIntArray = newDynamicArray;
    }

    public void insert(int index, int number){

        int newDynamicArrayLength = dynamicIntArray.length + 1;
        int[] newDynamicArray = new int[newDynamicArrayLength];

        for(int i = 0, j = 0; j < dynamicIntArray.length; i++, j++){

            if(i == index) {
                newDynamicArray[i] = number;
                i++;
            }
            newDynamicArray[i] = dynamicIntArray[j];
        }

        if(index > newDynamicArray.length) newDynamicArray[newDynamicArray.length - 1] = number;

        dynamicIntArray = newDynamicArray;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int number : dynamicIntArray){
            sb.append(" ");
            sb.append(number);
        }
        return sb.toString();
    }

    private void checkIndexExist(int index){
        if(dynamicIntArray.length <= index || index < 0)
            throw new ArrayIndexOutOfBoundsException();
    }

}
