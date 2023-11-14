public class LinkedNode<T> {

    T data;
    LinkedNode<T> next;
    LinkedNode<T> prev;

    /**
     * The only constructor for a new LinkedNode
     * @param newData
     */
    public LinkedNode(T newData){
        data = newData;
        next = null;
        prev = null;
    }
    

}