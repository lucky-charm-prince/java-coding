
// reverse a string using recursion
// class Test
// {
//     public static void main(String[] args) {
//         String s="prince";
//         System.out.println(reverString(s));
//     }
//     public static String reverString(String str)
//     {
//         if(str.length()==0)
//         {
//             return "";
//         }
//         return reverString(str.substring(1))+str.charAt(0);
//     }
// }

reverse the sting before the space occur

class Test
{
    public static void main(String[] args) {
        String str="olleh dlrow avaj";
        int k=0;
        String s2="";
        for(int i=0;i<str.length();i++)
         {
             if(str.charAt(i)==' ')
             {
                s2=s2+revString(str.substring(k, i))+" ";
                k=i+1;
             }

         }
         s2=s2+revString(str.substring(k,str.length()));

        System.err.println(s2);
    }

    public static String revString(String str)
    {
        if(str.length()==0)
        {
            return "";
        }
        return revString( str.substring(1,str.length()))+str.charAt(0);
    }
}


// input String s="i love india";
// output String s="india love i";
class Test {
    public static void main(String[] args) {
        String s="i love programming so much";
        String s1=reverseString(s);
        s="";
        int k=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==' ')
            {
                s=s+reverseString(s1.substring(k,i))+" ";
                k=i+1;
            }
        }
        s=s+reverseString(s1.substring(k));
        System.out.println(s);
}
    public static String reverseString(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }
        return reverseString(s.substring(1))+s.charAt(0);
    }
}
