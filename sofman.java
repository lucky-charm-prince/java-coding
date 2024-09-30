// Q1 write a program in java for an array the length , n=length of array divider by the distinct value store in array . Print the number and its count greater than n in java
// import java.util.*;
// class Test
// {
//     public static void main(String[] args) {
//         Map<Integer,Integer> map= new HashMap<>();
//         int i=0;
//         int[] arr={3,3,4,1,1,2,2,2,5};
//         for(int x:arr)
//         {
//             if(!map.containsKey(x))
//             {
//                 int coun=0;
//                 map.put(x, ++coun);
//                 i++;
//             }
//             else 
//             {
//                 int k=map.get(x);
//                 map.replace(x, ++k);
//             }
//         }
        
//         for(Integer x: map.keySet())
//         {
//             if(map.get(x)>(arr.length/i))
//             {
//                 System.out.println(x +" "+map.get(x));
//             }
//         }
//     }
// }


// Q2 Write a program 
//  n=38   -> n=3+8=11  -> n=11 -> n=1+1 -> n=2 continue same process until we get the one digit number 

// class Test{
//     public static void main(String[] args) {
//         int num=38;
//         int sum=0;
//         while(num>=10)
//         {
//             while(num>9)
//             {
//                 sum=sum+(num%10);
//                 num=num/10;
//                 if(num<10)
//                 {
//                     sum=sum+num;
//                     break;
//                 }
//             }
            
//             num=sum;
//             sum=0;
//         }
//         System.out.println(num);
//     }
// }

//Q3  reverse the sting before the space occur

// class Test
// {
//     public static void main(String[] args) {
//         String str="olleh dlrow avaj";
//         int k=0;
//         String s2="";
//         for(int i=0;i<str.length();i++)
//          {
//              if(str.charAt(i)==' ')
//              {
//                 s2=s2+revString(str.substring(k, i))+" ";
//                 k=i+1;
//              }

//          }
//          s2=s2+revString(str.substring(k,str.length()));

//         System.err.println(s2);
//     }

//     public static String revString(String str)
//     {
//         if(str.length()==0)
//         {
//             return "";
//         }
//         return revString( str.substring(1,str.length()))+str.charAt(0);
//     }
// }



// Q4  print the similar value present in the both the array
// class Test{
//     public static void main(String[] args) {
//         int[] arr1={3,4,6,7,5};
//         int []arr2={1,5,2,3,9,6,9,};
//  int[] arr3=new int[arr1.length];
//  int k=0;
//         for(int i=0;i<arr1.length;i++)
//         {
//             for(int j=0;j<arr2.length;j++)
//             {
//                 if(arr1[i]==arr2[j])
//                 {
//                     arr3[k++]=arr1[i];
//                 }
//             }
//         }
//         for(int i=0;i<k;i++)
//         {
//             System.out.println(arr3[i]+" ");
//         }

//     }
// }


// second way
// import java.util.HashSet;
// import java.util.Set;
// class Test{
//     public static void main(String[] args) {
//         int[] arr1={3,4,6,6,67,5};
//                 int []arr2={1,5,2,3,9,6,9,};
// Set<Integer> s=findCommonElement(arr1, arr2);
// System.err.println(s);

//     }

//     public static Set<Integer> findCommonElement(int[] arr1,int[] arr2)
//     {
//         Set<Integer> s1=new HashSet<>();
//         Set<Integer> commomset=new HashSet<>();
//         for(int num:arr1)
//         {
//             s1.add(num);
//         }
//         for(int num2:arr2)
//         {
//             if(s1.contains(num2))
//             {
//                 commomset.add(num2);
//             }
//         }
//         return commomset;
//     }
// }