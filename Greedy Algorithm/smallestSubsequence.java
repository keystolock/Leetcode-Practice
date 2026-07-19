class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length();
        int[] last = new int[26];

        for (int i = 0; i < n; i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        boolean[] visited = new boolean[26];
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (visited[ch - 'a']) continue;

            while (st.length() > 0 &&
                   st.charAt(st.length() - 1) > ch &&
                   last[st.charAt(st.length() - 1) - 'a'] > i) {
                visited[st.charAt(st.length() - 1) - 'a'] = false;
                st.deleteCharAt(st.length() - 1);
            }

            st.append(ch);
            visited[ch - 'a'] = true;
        }

        return st.toString();
    }
}