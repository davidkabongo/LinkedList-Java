public class LinkyList<T> {
    private LinkedNode<T> head;
    private LinkedNode<T> tail;
    private int numNodes;
    
    /**
     * The only constructor for a new LinkedList
     * @param data
     */
    public LinkyList(){
        head = new LinkedNode<T>(null);
        tail = head;
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
    }
    
}
