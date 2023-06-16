public class Main {
    public static void main(String[] args) {
        int size = 7;
        char[][] letterB = new char[size][size];

        // B harfinin yıldızlarla oluşturulması
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || (i == 0 || i == size / 2 || i == size - 1) && j < size - 1)
                    letterB[i][j] = '*';
                else
                    letterB[i][j] = ' ';
            }
        }

        // B harfinin ekrana yazdırılması
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(letterB[i][j] + " ");
            }
            System.out.println();
        }
    }
}
