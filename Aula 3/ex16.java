package main;

public class ola {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArray[i] = array[i];
            }
            if(newArray[i] != 0) {
                System.out.println(newArray[i]);
            }
        }
    }
}