import java.util.LinkedList;
public class CISQueue {

    // Linked list property.
    public LinkedList linkedList;

    // Size property.
    public int size;

    // Constructor.
    public CISQueue() {
        size = 0;
        linkedList = new LinkedList<Integer>();
    }

    public void enqueue(int t){
        linkedList.addLast(t);
        size++;
    }

    public int dequeue(){
        int result = (int) linkedList.getFirst();
        linkedList.removeFirst();
        size--;
        return result;
    }

    public boolean isEmpty(){
        return (size == 0);
    }
    public int size(){
        return size;
    }

    public String toString(){
        String result = "CISQueue{queue=[";
        for (var value : linkedList){
            result += "" + value + ", ";
        }
        result = result.substring(0,result.length()-2);
        result += "], size=" + size + "}";
        return result;
    }

    // toString. Returns a description of the queue in, for example, the following format:
    // CISQueue{queue=[7, 11], size=2}

}
