class Solution {
    public int solution(int n, String control) {

        char[] c = control.toCharArray();
        for(int i=0; i<c.length; i++){
            if(c[i] == 'w'){
                n += 1;
            }
            else if(c[i] == 's'){
                n -= 1;
            }
            else if(c[i] == 'd'){
                n += 10;
            }
            else if(c[i] == 'a'){
                n -= 10 ;
            }
        }
        
        return n;
    }
}