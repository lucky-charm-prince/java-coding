
// Parenthesis checking of string using recursion 
class Test
{
    public static void main(String[] args)
    {
        String s="{}[][";
        System.out.println(parenthesisCheck(s,""));
    }
    public static boolean parenthesisCheck(String s, String str)
    {
        System.out.println(s+"  "+str);
        if(s.isEmpty() )
       {
           if(str.isEmpty())
           return true;
           else 
           return false;
       }
       if(s.charAt(0)=='{'|| s.charAt(0)=='('|| s.charAt(0)=='[')
       {
           str=str+ s.charAt(0)+"";
       }
       
       else if(str.length()>0 && ((str.charAt(str.length()-1)=='[' && s.charAt(0)==']')|| (str.charAt(str.length()-1)=='{' && s.charAt(0)=='}')|| (str.charAt(str.length()-1)=='(' && s.charAt(0)==')')))
       {
           str=str.substring(0,str.length()-1);
       }
       else 
       {
           return false;
       }
       
       return parenthesisCheck(s.substring(1),str);
       
    }
}