class Solution {
    public int romanToInt(String s) {
        int[] val = new int[26];
        val['I' - 'A'] = 1;
        val['V' - 'A'] = 5;
        val['X' - 'A'] = 10;
        val['L' - 'A'] = 50;
        val['C' - 'A'] = 100;
        val['D' - 'A'] = 500;
        val['M' - 'A'] = 1000;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = val[s.charAt(i) - 'A'];
            if (i + 1 < s.length() && curr < val[s.charAt(i + 1) - 'A']) {
                sum -= curr;
            } else {
                sum += curr;
            }
        }
        return sum;  
    }
}