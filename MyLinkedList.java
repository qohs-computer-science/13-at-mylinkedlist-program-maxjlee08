public class MyLinkedList
{
    private ListNode head;
    public int size;

    public MyLinkedList(){
        head = null;
        size = 0;
        
    }

    //# of elements
    public int size(){
        return size;
    }
    
    //true if list is empty
    public boolean isEmpty(){
        return size == 0;
    }

    //adds new node to the end of the list
    public boolean add(Object newItem){
        return (newItem);
    }

    //Adds a node to the beginning
    public boolean addFirst(Object newItem){
        ListNode temp = new ListNode(newItem);
        temp.setNext(head);
        head = temp;
        size++;
        return true;
        

        
        }
    }

    

    

    

}
