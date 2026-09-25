class Solution {
    public boolean backspaceCompare(String s, String t) {
        return f(s).equals(f(t));
    }
    String f(String s) {
        StringBuilder x = new StringBuilder();
        for(char c:s.toCharArray())
            if(c=='#' && x.length()>0) x.deleteCharAt(x.length()-1);
            else if(c!='#') x.append(c);
        return x.toString();
    }
}