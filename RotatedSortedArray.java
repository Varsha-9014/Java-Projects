package varsha;


public class RotatedSortedArray{

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } 
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        RotatedSortedArray searcher = new RotatedSortedArray();

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = searcher.search(nums, target);
        System.out.println("Index of target " + target + ": " + result);
    }
}
