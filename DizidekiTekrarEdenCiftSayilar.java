import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 7, 2, 8, 4, 7, 9, 4, 2, 6, 8, 6};

        // Çift sayıların tekrar edenlerini tutacak olan map
        Map<Integer, Integer> repeatedPairs = new HashMap<>();

        // Sayı dizisini tarayarak tekrar eden çiftleri bulma
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {  // Sadece çift sayıları kontrol etme
                if (repeatedPairs.containsKey(numbers[i])) {
                    int count = repeatedPairs.get(numbers[i]);
                    repeatedPairs.put(numbers[i], count + 1);
                } else {
                    repeatedPairs.put(numbers[i], 1);
                }
            }
        }

        // Tekrar eden çiftleri ekrana yazdırma
        System.out.println("Tekrar Eden Çift Sayılar:");
        for (Map.Entry<Integer, Integer> entry : repeatedPairs.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();
            if (count > 1) {
                System.out.println(number + " - Tekrar Sayısı: " + count);
            }
        }
    }
}
