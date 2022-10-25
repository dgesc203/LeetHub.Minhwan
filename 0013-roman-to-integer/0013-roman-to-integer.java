class Solution {
    public int romanToInt(String s) {
    
        Map<Character, Integer> map=new HashMap<Character, Integer>();  
        //바꿀 요소 맵에 저장  
        map.put('I',1);  
        map.put('V',5);  
        map.put('X',10);  
        map.put('L',50);  
        map.put('C',100);  
        map.put('D',500);  
        map.put('M',1000); 
        
        //뒤에가 앞에보다 클 경우에 +가 아닌 -로 바꾼다
        s = s.replace("IV","IIII");  
        s = s.replace("IX","VIIII");  
        s = s.replace("XL","XXXX");  
        s = s.replace("XC","LXXXX");  
        s = s.replace("CD","CCCC");  
        s = s.replace("CM","DCCCC");  
        int number = 0;  
    //배열 반복   
        for (int i = 0; i < s.length(); i++)  
        {  
    //각각의 배열을 number에 치환하여 추가
            number = number + (map.get(s.charAt(i)));  
       
       
        }   
         return number; 
    }
}
