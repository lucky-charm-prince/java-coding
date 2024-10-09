//Remove duplicate from the given String using recursion and for loop

class Test
{
    static int i=0;
    public static void main(String[] args)
    {
        String s ="aaababccddbddef";
        System.out.println(removeDuplicate(s,""));
        
    }
    public static String removeDuplicate(String s,String newString)
    {
        if(s.length()==0)
        {
            return newString;
        }
        int count=0;
        for(int i=0;i<newString.length();i++)
        {
            if(newString.charAt(i)==s.charAt(0))
            {
              count++;
            }
        }
        if(count==0)
        {
            newString=newString+s.charAt(0);
        }
        return removeDuplicate(s.substring(1),newString);
        
    }
}    