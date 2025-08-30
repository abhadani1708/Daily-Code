class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int cnt=0;
        while(sb.length()<b.length()){
            sb.append(a);
            cnt++;
        }
        if(sb.toString().contains(b)){
            return cnt;
        }
        if(sb.append(a).toString().contains(b)){
            return cnt+1;
        }
        return -1;
    }
}