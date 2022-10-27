class Solution {
    public String longestCommonPrefix(String[] strs) {
        //strs가 없거나 0일 경우에는 일치할 수가 없으니 반환 문자가 없다.
        if(strs == null || strs.length==0){
            return "";
        }
        //strs가 1개일 경우에는 0번 배열의 값을 반환
        if(strs.length == 1){
            return strs[0];
        }
        
        
        String prefix = strs[0];
        
        
        for (int i = 1;i < strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                
            }
        }
        return prefix;
    }
}