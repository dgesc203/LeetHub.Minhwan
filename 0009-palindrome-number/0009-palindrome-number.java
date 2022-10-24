class Solution {
    public boolean isPalindrome(int x) {
       if(x < 0){
           return false;
       }
      int reverse = 0;
        int temp =x;
        while(temp!=0){
                                    //나누기 10을 하면 끝자리를 얻을 수 있음
            reverse = reverse*10 + temp%10;
            temp /= 10;
            
        }
        return reverse == x;
        
    }
}
