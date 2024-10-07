class Solution {
    public int minLength(String s) {
        // Using a stack to track characters
        StringBuilder stack = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            stack.append(c);
            
            // If the last two characters in the stack form "AB" or "CD", remove them
            int length = stack.length();
            if (length >= 2) {
                String lastTwo = stack.substring(length - 2);
                if (lastTwo.equals("AB") || lastTwo.equals("CD")) {
                    // Remove the last two characters
                    stack.delete(length - 2, length);
                }
            }
        }
        
        // The length of the remaining string in the stack is the answer
        return stack.length();
    }
}
