package main;
public class ola {
    public static void main(String[] args) {

        float[] array = new float[]{1, 2, 3, 4};
        int result=1;

        for (int i = 0; i < array.length; i++) {
            result *= array[i];
        }
        System.out.println(result);
    }
}