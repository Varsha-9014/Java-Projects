package varsha;

public class LogTimeExample {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;

        int low = 0;
        int high = numbers.length - 1;
        int resultIndex = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (numbers[mid] == target) {
                resultIndex = mid;
                break;
            } else if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (resultIndex != -1) {
            System.out.println("Target " + target + " found at index " + resultIndex);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}