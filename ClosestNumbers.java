public class ClosestNumbers {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int x = 10;

        int smaller = Integer.MIN_VALUE;
        int larger = Integer.MAX_VALUE;

        for (int number : list) {
            if (number < x && number > smaller) {
                smaller = number;
            }
            if (number > x && number < larger) {
                larger = number;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + smaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + larger);
    }
}
