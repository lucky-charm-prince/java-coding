//Remove duplicate from the given String using recursion and for loop

// class Test
// {
//     static int i=0;
//     public static void main(String[] args)
//     {
//         String s ="aaababccddbddef";
//         System.out.println(removeDuplicate(s,""));
        
//     }
//     public static String removeDuplicate(String s,String newString)
//     {
//         if(s.length()==0)
//         {
//             return newString;
//         }
//         int count=0;
//         for(int i=0;i<newString.length();i++)
//         {
//             if(newString.charAt(i)==s.charAt(0))
//             {
//               count++;
//             }
//         }
//         if(count==0)
//         {
//             newString=newString+s.charAt(0);
//         }
//         return removeDuplicate(s.substring(1),newString);
        
//     }
// }    


//Remove dulicates from String using recursion and array

class Test
{
    public static void main(String[] args) {
       String s="aaabbbbcccdddeeefffaax";
       s=s.toUpperCase();
       int[] arr=new int[26];
       s=removeDuplicate(s,arr);
       System.out.println(s);
    }
    public static String removeDuplicate(String s, int[]arr)
    {
              if(s.isEmpty()){
                    for(int i=0;i<26;i++)
                    {
                        if(arr[i]!=0)
                        s=s+(char)(65+i);
                    }
                    return s;
              }
            arr[s.charAt(0)-65]=arr[s.charAt(0)-65]+1;
        return removeDuplicate(s.substring(1), arr);
    }
}