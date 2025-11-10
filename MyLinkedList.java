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
    public boolean add(Object obj){
        return addLast(obj);
    }

    //Adds a node to the beginning
    public boolean addFirst(Object obj){
        head = new ListNode(obj, head);
        size++;
        return true;
        }
    
    public boolean addLast(Object obj){
        ListNode newNode = new ListNode(obj, null);
        if(isEmpty()){
            head = newNode;
        }
        else{
            ListNode temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        size++;
        return true;
    }
    
    public Object get(int i){
        if((i<0) || (i>=size)){
            return null;
        }

        ListNode current = head;
        for(int x=0; x<i; x++){
            current = current.getNext();
        }
        return current.getNext();
    }

    public Object set(int i, Object obj){
        if((i<0) || (i>=size)){
            return null;
        }

        ListNode current = head;
        for(int x=0; x<i; x++){
            current = current.getNext();
        }
        Object oldVal = current.getValue();
        current.setValue(obj);
        return oldVal;

    }

    public Object remove(int i){
        if((i<0) || (i>=size)){
            return null;
        }

        Object removed;

        if(i == 0){
            removed = head.getValue();
            head = head.getNext();
        }
        else{
            ListNode previous = head;
            for(int x = 0; x<i-1; x++){
                previous = previous.getNext();
            }
            removed = previous.getNext().getValue();
            previous.setNext(previous.getNext().getNext());
        }
        size--;
        return removed;
    }

    public Object removeFirst(){
        if(isEmpty())
            return null;
        
            Object val = head.getValue();
            head = head.getNext();
            size--;
            return val;
    }

    public Object removeLast(){
        if(isEmpty())
            return null;
        
        Object val;
        if(size == 1){
            val = head.getValue();
            head = null;
        }
        else{
            ListNode previous = head;
            for(int x=0; x<size-2; x++){
                previous = previous.getNext();
            }
            val = previous.getNext().getValue();
            previous.setNext(null);
        }
        size--;
        return val;
    }

    public String toString(){
        String result = "";
        ListNode current = head;
        int pos = 1;

        while(current != null){
            result += pos + ": " + current.getValue() + "\n";
            current = current.getNext();
            pos++;
        }
        
    }

}
