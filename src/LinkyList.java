public class LinkyList<T> {
    LinkedNode<T> head;
    LinkedNode<T> tail;
    int numNodes;
    
    /**
     * The only constructor for a new LinkedList
     * @param data
     */
    public LinkyList(){
        head = new LinkedNode<T>(null);
        tail = head;
    }

    /**
     * push a new node onto the LinkedList
     * @param newNode
     */
    public void push(T newData){
        tail.next = new LinkedNode<T>(newData);
        tail = tail.next;
        tail.prev = tail.prev.prev;

        numNodes++;
    }

    public T remove(T removedObject){
        LinkedNode temp = head;

        while(temp.data != removedObject){
            temp = temp.next;
        }
        T removedData = (T) temp.data;
        temp.prev = null;
        temp.next = null;

        numNodes--;
        return removedData;

        
    }

    /**
     * 
     * @return head of LinkedList
     */
    public LinkedNode<T> getHead(){
        return head;
    }

    /**
     * 
     * @return tail of LinkedList
     */
    public LinkedNode<T> getTail(){
        return tail;
    }

    /**
     * 
     * @return number of nodes in the LinkedList
     */
    public int numNodes(){
        return numNodes;
    }

    /**
     * prints all elements of the LinkedList in a readable way
     */
    public void printList(){
        for(int i = 0; i < numNodes-1;i++){
            LinkedNode<T> temp = head;
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("There are -> " + numNodes + " <- nodes in this list");
    }


    
}
