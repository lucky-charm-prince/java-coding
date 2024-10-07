

 class LL {
   Node head;
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

    public void addFirst(String data)
    {
        Node newNode= new Node(data);
        if(head==null)
        {
             head=newNode;
             return;
        }
        else 
        {
                newNode.next=head;
                head=newNode;
        }
    }

    public void addLast(String data)
    {
        Node newNode=new Node(data);
        Node currentNode=head;
        if(currentNode==null)
        {
            head=newNode;
            return;
        }
        while(currentNode.next!=null)
        {
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }

    public void printData()
    {
        Node currentNode=head;
         while(currentNode!=null)
         {
            System.out.print(currentNode.data+" --> ");
            currentNode=currentNode.next;   
         }
         System.out.print("null");

    }
    public static void main(String[] args) {
        LL list = new LL();
     
        list.addFirst("10");
        list.addFirst("5");
        list.addLast("20");
        list.addLast("30");
        list.printData();

    }
}
