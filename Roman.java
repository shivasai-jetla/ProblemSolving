import java.util.*;
class RomanToInt {
    public static void romanToInt() {
        Map<Character, Integer> m = new HashMap<>();
        
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
 
        int ans = m.get('X');
        System.out.println(ans);
}
public static void main(String args[])
{
romanToInt();
}
}