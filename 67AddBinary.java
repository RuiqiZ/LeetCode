class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int remainder = 0;
        
        while (i >= 0 || j >= 0) {
            int sum = (i >= 0? a.charAt(i) - 48: 0) +  (j >= 0? b.charAt(j) - 48 : 0) + carry;
            remainder = sum%2;
            carry = sum/2;
            result = remainder + result;
            i--;
            j--;
        }
        
        if (carry != 0) {
            result = carry + result;
        }
        return result;
    }
}