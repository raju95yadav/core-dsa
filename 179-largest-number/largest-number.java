import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Comparator<String> myComparator = (s1, s2) -> (s2 + s1).compareTo(s1 + s2);

        Arrays.sort(arr, myComparator);
        
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }

        return result.toString();
    }
}