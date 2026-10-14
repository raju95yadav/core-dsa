class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum < 1 || sum > 9 * num) {
            return "";
        }
        int nines = sum / 9 ;
        int remain = sum % 9 ;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nines; i++) {
            result.append('9');
        }
        if (remain > 0) {
            result.append(remain);
        }
        int zeros = num-result.length();
        if(zeros >0){
            for (int i = 0; i < zeros; i++) {
            result.append('0');
        }
        }

       return result.toString();
    }
}