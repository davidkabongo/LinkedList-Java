import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class LinkedListTest {
    
    public LinkyList instance = new LinkyList<Integer>();

    /**
     * Testing the push method
     */
    public void testPush(){
        int first = 10;
        instance.push(10);
        assertEquals(1, instance.numNodes);
    }

    public void testGetHead(){
        int first = 20;
        int second = 40;
        
        instance.push(first);
        instance.push(second);

        assertSame(first, instance.head);
    }

    public void testGetTail(){
        int first = 60;
        int second = 80;
        
        instance.push(first);
        instance.push(second);

        assertSame(second, instance.tail);
    }

    public void testNumNodes(){
        int first = 10;
        int second = 20;
        int third = 40;
        int fourth = 60;
        int fifth = 80;

        instance.push(first); 
        instance.push(second);
        instance.push(third);
        instance.push(fourth);       
        instance.push(fifth);

        assertEquals(5, instance.numNodes);
    }


}
