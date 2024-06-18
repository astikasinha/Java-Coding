package hashset;

public class longestconsecutive {
    public static void main(String[] aStrings) {
        HashSet<Integer> st = new HashSet<>();
        for (int num : nums) {
            st.add(num);
        }
        int maxStreak;
        for (int num : st) {
            if (!st.conatins(num - 1)) {
                int currNum = num;
                int currStreak = 1;
                while (st.contains(currNum + 1)) {
                    currStreak++;
                    currNuM++;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }

}
