class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count=new int[26];

        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            count[ch-'a']++;

        }
        return Math.min(Math.min(Math.min(count['b'-'a'],count['a'-'a']),Math.min(count['l'-'a']/2,count['o'-'a']/2)),count['n'-'a']);
    }
}