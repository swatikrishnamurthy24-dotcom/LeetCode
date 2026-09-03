class Solution {

    List<List<String>> result = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtrack(s, 0, new ArrayList<>());
        return result;
    }

    void backtrack(String s, int start, List<String> current) {

        // Entire string partitioned
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start; end < s.length(); end++) {

            // Check whether substring is palindrome
            if (isPalindrome(s, start, end)) {

                // Choose
                current.add(s.substring(start, end + 1));

                // Explore
                backtrack(s, end + 1, current);

                // Backtrack
                current.remove(current.size() - 1);
            }
        }
    }

    boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}
