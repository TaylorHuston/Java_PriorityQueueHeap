/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taylor
 */
public class PriorityQueue<Key> {
    private BinaryHeap pq;
    
    PriorityQueue(int size) {
        pq = new BinaryHeap(size);
    }
    
    void insert(Key v) {
        
    }
    
    Key max(){
        return pq.getKey(1);
    }
    
    Key delMax() {
        
    }
     
    boolean isEmpty() {
        
    }
    
    int size() {
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
