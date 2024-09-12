package main;

public class ola {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 6, 9};

        int[] newArray = new int[5];

        for (int i = 0; i < array.length; i++) {
            if (array[i]%3==0)
                newArray[i] = array[i];
            if (newArray[i]!=0)
                System.out.println(newArray[i]);
        }
    }
}
