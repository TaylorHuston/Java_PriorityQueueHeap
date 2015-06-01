/*
  Priority Queue  using a Binary Heap
 */
public class PriorityQueue<Key extends Comparable<Key>> {
    private BinaryHeap pq;
    
    PriorityQueue(int size) {
        pq = new BinaryHeap(size);
    }
    
    void insert(Key v) {
        pq.insert(v);
    }
    
    Comparable max(){
        return pq.getKey(1);
    }
    
    Comparable delMax() {
        if (!this.isEmpty()) {
            return pq.remove();
        }
        else return("PQ is empty");
    }
     
    boolean isEmpty() {
        return pq.IsEmpty();
    }
    
    int size() {
       return pq.size(); 
    }
    
    void printQ() {
        pq.printHeap();
    }
    
    public static void main(String[] args) {
        PriorityQueue<String> testPQ = new PriorityQueue<String>(10);
        testPQ.insert("P");
        testPQ.insert("Q");
        testPQ.insert("E");
        
        testPQ.printQ();
        
        testPQ.delMax();
        testPQ.insert("X");
        testPQ.insert("A");
        testPQ.insert("M");
        
        testPQ.printQ();
        
        testPQ.delMax();
        testPQ.printQ();
        
        testPQ.insert("P");
        testPQ.insert("L");
        testPQ.insert("E");
        
        testPQ.delMax();
        testPQ.printQ();
        
        
    }
    
}
