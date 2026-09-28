class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        solve("", n, n, ans);
        return ans;
    }

    public void solve(String str, int open, int close, List<String> ans){
        if(open == 0 && close == 0){
            ans.add(str);
            return;
        }
        if(open > 0){
            solve(str + "(", open - 1, close, ans);
        }
        if(close > open){
            solve(str + ")", open, close - 1, ans);
        }
    }
}