import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    /**
     * A list to store all pre-generated special palindromic numbers.
     * Using a static final list and a static initializer block ensures that
     * the generation process runs only once when the class is loaded,
     * making subsequent calls to specialPalindrome very fast.
     */
    private static final List<Long> specialNumbers = new ArrayList<>();

    static {
        // The maximum length of a special number we need to consider.
        // n is up to 10^15 (16 digits). The next special number could be a bit longer.
        // A max sum of digits (which equals the length) of 18 is a safe upper bound.
        int maxLen = 18;
        generateCombinations(1, 0, new ArrayList<>(), maxLen);
        Collections.sort(specialNumbers);
    }

    /**
     * Finds the smallest special number strictly greater than n.
     * @param n The input number.
     * @return The smallest special number > n.
     */
    public long specialPalindrome(long n) {
        // Since specialNumbers is pre-computed and sorted, we can simply iterate
        // through it to find the first number that is greater than n.
        for (long specialNum : specialNumbers) {
            if (specialNum > n) {
                return specialNum;
            }
        }
        // This line should not be reached given the problem constraints
        // and the range of numbers we generate.
        return -1;
    }

    /**
     * Recursively generates combinations of digits {1..9} that can form a special number.
     * @param startDigit The starting digit for the current exploration to avoid duplicate combinations.
     * @param currentSum The sum of digits in the current combination (equals the total length of the final number).
     * @param currentDigits The list of digits in the current combination.
     * @param maxLength The maximum allowed sum of digits.
     */
    private static void generateCombinations(int startDigit, int currentSum, List<Integer> currentDigits, int maxLength) {
        // Process the current combination of digits if it's not empty.
        if (!currentDigits.isEmpty()) {
            buildPalindromesFromCombination(currentDigits);
        }

        // Explore adding more digits to the combination.
        for (int i = startDigit; i <= 9; i++) {
            if (currentSum + i <= maxLength) {
                currentDigits.add(i);
                generateCombinations(i + 1, currentSum + i, currentDigits, maxLength);
                currentDigits.remove(currentDigits.size() - 1); // Backtrack
            }
        }
    }

    /**
     * For a given combination of digits, builds all possible special palindromes.
     * @param digits The combination of unique digits (e.g., {1, 2}).
     */
    private static void buildPalindromesFromCombination(List<Integer> digits) {
        int oddCount = 0;
        Integer oddDigit = null; // The digit that will be in the center of the palindrome
        int totalLength = 0;

        // Check validity: at most one odd digit is allowed.
        for (int d : digits) {
            if (d % 2 != 0) {
                oddCount++;
                oddDigit = d;
            }
            totalLength += d;
        }

        // If there's more than one odd digit, no palindrome can be formed.
        if (oddCount > 1) {
            return;
        }

        // Determine the multiset of digits for the first half of the palindrome.
        // For each digit 'd' in the combination, we take d/2 copies of it.
        int[] firstHalfCounts = new int[10];
        for (int d : digits) {
            firstHalfCounts[d] += d / 2;
        }
        int firstHalfLength = totalLength / 2;

        // Generate all unique permutations of the first half's digits.
        generatePermutations("", firstHalfLength, firstHalfCounts, oddDigit);
    }

    /**
     * Recursively generates permutations for the first half of the palindrome.
     * @param current The current permutation string being built.
     * @param targetLen The target length of the first half.
     * @param counts An array storing the counts of available digits for the permutation.
     * @param oddDigit The middle digit of the palindrome, if any.
     */
    private static void generatePermutations(String current, int targetLen, int[] counts, Integer oddDigit) {
        // Base case: The first half is fully constructed.
        if (current.length() == targetLen) {
            // Construct the full palindrome string.
            StringBuilder reversedHalf = new StringBuilder(current).reverse();
            String palindromeStr;
            if (oddDigit != null) {
                palindromeStr = current + oddDigit + reversedHalf.toString();
            } else {
                palindromeStr = current + reversedHalf.toString();
            }

            // A valid palindrome must not be empty. This check handles the initial
            // empty combination from the top-level call.
            if (!palindromeStr.isEmpty()) {
                try {
                    long specialNum = Long.parseLong(palindromeStr);
                    specialNumbers.add(specialNum);
                } catch (NumberFormatException e) {
                    // The generated number is too large to fit in a long, so we ignore it.
                }
            }
            return;
        }

        // Recursive step: Try adding each available digit to the permutation.
        // Digits are 1-9, so no leading zero issue.
        for (int i = 1; i <= 9; i++) {
            if (counts[i] > 0) {
                counts[i]--; // Use one instance of digit i
                generatePermutations(current + i, targetLen, counts, oddDigit);
                counts[i]++; // Backtrack to restore the count for other permutations
            }
        }
    }
}