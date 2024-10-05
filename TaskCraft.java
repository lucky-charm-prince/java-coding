// input String s="i love india";
// output String s="india love i";
// class Test {
//     public static void main(String[] args) {
//         String s="i love programming so much";
//         String s1=reverseString(s);
//         s="";
//         int k=0;
//         for(int i=0;i<s1.length();i++)
//         {
//             if(s1.charAt(i)==' ')
//             {
//                 s=s+reverseString(s1.substring(k,i))+" ";
//                 k=i+1;
//             }
//         }
//         s=s+reverseString(s1.substring(k));
//         System.out.println(s);
// }
//     public static String reverseString(String s)
//     {
//         if(s.isEmpty())
//         {
//             return "";
//         }
//         return reverseString(s.substring(1))+s.charAt(0);
//     }
// }


// Q  find the given interger is palindrom or not?

// class Test 
// {
//     public static void main(String[] args)
//     {
//         int n=121;
//         int a=n;
//         int x=0;
//         while(n>0)
//         {
            
//                 x=x*10;
//                 x=x+(n%10);
//                 n=n/10;
//         }
        
//         if(x==a)
//         {
//             System.out.println("Pallindwom");
//         }
//         else 
//         {
//             System.out.println("not a Pallindwom");
//         }

//     }
// }


Q pattern 
// 0
// 01
// 012
// 0123
// 01234
// 0123
// 012
// 01
// 0

class Test 
{
    public static void main(String[] args)
    {
        int n=10;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                if(j<=i && i<n/2)
                {
                    System.out.print(j);
                }
                if((i+j<n-1) && (i>=n/2))
                {
                    System.out.print(j);
                } 
            }
            System.out.println();
            
        }
    }
}