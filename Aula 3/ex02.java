package main;

public class ola {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5};

        array[2] = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0)
                System.out.println(array[i]);
        }
    }
}