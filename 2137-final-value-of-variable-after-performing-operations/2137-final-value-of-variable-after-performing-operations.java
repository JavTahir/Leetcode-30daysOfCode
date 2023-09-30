public class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;

        for (String op : operations) {
            if (op.equals("++X") || op.equals("X++")) {
                X++;
            } else if (op.equals("--X") || op.equals("X--")) {
                X--;
            }
        }

        return X;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] operations = {"++X", "++X", "X--"};
        int res = solution.finalValueAfterOperations(operations);
        System.out.println("Final value of X: " + res);
    }
}
