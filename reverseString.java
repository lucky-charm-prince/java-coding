
// reverse a string using recursion
class Test
{
    public static void main(String[] args) {
        String s="prince";
        System.out.println(reverString(s));
    }
    public static String reverString(String str)
    {
        if(str.length()==0)
        {
            return "";
        }
        return reverString(str.substring(1))+str.charAt(0);
    }
}