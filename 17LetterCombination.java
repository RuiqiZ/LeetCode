class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == "") return new ArrayList<>();
        
        List<String> next = new ArrayList<>();
        
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        for (int i = 0; i < digits.length(); i++) {
            
            String letter = map.get(digits.charAt(i));
            if (next.size() == 0) {
                for (int j = 0; j < letter.length(); j++) {
                    next.add(letter.charAt(j) + "");
                }
            } else {
                List<String> current = next;
                next = new ArrayList<>();
                for (int k = 0; k < current.size(); k++) {
                    for (int j = 0; j < letter.length(); j++) {
                        next.add(current.get(k) + letter.charAt(j));
                    }
                }
            }
        }
        return next;
    }
}