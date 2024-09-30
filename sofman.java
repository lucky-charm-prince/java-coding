//write a program in java for an array the length , n=length of array divider by the distinct value store in array . Print the number and its count greater than n in java
import java.util.*;
class Test
{
    public static void main(String[] args) {
        Map<Integer,Integer> map= new HashMap<>();
        int i=0;
        int[] arr={3,3,4,1,1,2,2,2,5};
        for(int x:arr)
        {
            if(!map.containsKey(x))
            {
                int coun=0;
                map.put(x, ++coun);
                i++;
            }
            else 
            {
                int k=map.get(x);
                map.replace(x, ++k);
            }
        }
        
        for(Integer x: map.keySet())
        {
            if(map.get(x)>(arr.length/i))
            {
                System.out.println(x +" "+map.get(x));
            }
        }
    }
}

