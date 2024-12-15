//67. Add Binary

class Solution {
    public String addBinary(String a, String b) {

        StringBuilder res = new StringBuilder(); // To store the result in reverse
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0; // Initialize carry to 0

        // Process both strings and the carry
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry; // Start with the carry

            // Add bits from a and b if available
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';

            // Append the current binary digit
            res.append(sum % 2);

            // Update carry
            carry = sum / 2;

            // Move to the next digits
            i--;
            j--;
        }

        // Reverse the result and return as a string
        return res.reverse().toString();
    }
}
