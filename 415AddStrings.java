class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        int sum = 0;
        String result = "";
        
        while (i >= 0 || j >=0) {
            if (i >= 0 && j >= 0) {
                sum = carry + num1.charAt(i) - '0' + num2.charAt(j) - '0';
            } else if (i >= 0) {
                sum = carry + num1.charAt(i) - '0';
            } else if (j >= 0) {
                sum = carry + num2.charAt(j) - '0';
            }
            
            carry = sum/10;
            result = sum%10 + result;
            i--;
            j--;
        }
        if (carry >0) {
            result = carry + result;
        }
        return result;
    }
}