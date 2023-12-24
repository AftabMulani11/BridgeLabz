package DayThree;
public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 1, 6, 3, 7, 8, 2, 9, 1};
        int[] frequency = new int[101];

        for (int j: arr) {
            frequency[j]++;
        }
        System.out.println("Element frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Element " + i + ": " + frequency[i] + " times");
            }
        }
    }
}
