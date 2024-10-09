class Test {
    static Node head=null;
    static    Node currentNode=null;
    class Node
    {
        
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addData(String data)
    {
        Node newNode= new Node(data);
        if(head==null)
        {
            head=newNode;
            currentNode=newNode;
            return ;
        }
        else 
        {
          currentNode.next=newNode;
          currentNode=newNode;
        }
        
    }
    
    public  void printData()
    {
        Node firstNode=head;
        if(firstNode==null)
        {
            System.out.println("null");
            return;
        }
        while(firstNode!=null)
        {
            System.out.print(firstNode.data+" --> ");
            firstNode=firstNode.next;
        }
        System.out.println("null");
    }
    public void removeData()
    {
        Node firstNode=head;
        if(firstNode==null)
        {
            System.out.println("null");
            return;
        }
        if(firstNode.next==null)
        {
            head=null;
            currentNode=null;
            return;
        }
        else
        {
            while(firstNode.next!=currentNode)
            {
                firstNode=firstNode.next;
            }
            currentNode=firstNode;
            firstNode.next=null;
            return;
        }
    }
    
    public static void main(String[] args) {
     Test t = new Test();
     t.addData("10");
     t.addData("20");
     t.addData("30");
     t.printData();
     t.removeData();
     t.addData("10");
     t.addData("20");
     t.addData("30");
     t.printData();
    
    }
}