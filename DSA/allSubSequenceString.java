class Test{
    public static void main(String[] args) {
        String s="abc";
        printAllSubSequenceOfString(s, 0, "");
    }
    public static void printAllSubSequenceOfString(String s, int index, String  newString)
    {
        if(index==s.length())
        {
            System.out.println(newString);
            return;
        }
        char currentChar=s.charAt(index);
        printAllSubSequenceOfString(s, index+1, newString+currentChar);
        printAllSubSequenceOfString(s, index+1, newString);
    }
}