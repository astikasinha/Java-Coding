public class learninglinkedlist {
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public Node head=null;
    public Node tail=null;

    //add-first,last
    public void addfirst(String data){
        //create a new node
        Node newNode=new Node(data);
        Object head;
        if(head == null){
            head= newNode;
            tail=newNode;
        }
        else{

        }
    }

    public void addlast(String data){
        Node newNode=new Node(data);
        Object head;
        if(head == null){
            head=newNode;
            return;
        }

        currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }


    //print
    /**
     * 
     */
    public void printlist(){
        Node currNode = head;
        while(currNode!=null){
            System.out.println(currNode.data + "->");
            currNode=currNode.next;

        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        head = new Node();
        learninglinkedlist list=new learninglinkedlist();
        list.addfirst("a");
        list.addlast("is");
        list.printlist();

    }
}
