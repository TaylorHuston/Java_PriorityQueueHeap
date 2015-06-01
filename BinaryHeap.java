/*
  Binary Heap using an Array
 */
public class BinaryHeap<Key extends Comparable<Key>> {
    private Key[] theHeap;
    int heapMax = 0;

    public BinaryHeap(int size) {
        theHeap = (Key[]) new Comparable[size+1];
    }
    
    public boolean IsEmpty() {
        return heapMax == 0;
    }
    
    public int size() {
        return heapMax;
    }
    
    public void insert(Key keyToAdd) {
        heapMax++;
        theHeap[heapMax] = keyToAdd;
        swim(heapMax);
    }
    
    public Key remove() {
        Key toReturn = theHeap[1];
        swap(1, heapMax--);
        sink(1);
        
        return toReturn;
    }
    
    public Key getKey(int k) {
        return theHeap[1];
    }

    private void swim(int k) {
        while (k > 1 && less(k/2,k)) {
            swap(k/2, k);
            k = k/2;
        }
    }
    
    
    private void sink(int k) {
        while(2*k <= heapMax) {
            int j = 2*k;
            
            if (j < heapMax && less(j, j+1)) {
                j++;
            }
            
            if(!less(k,j)) {
                break;
            }
            
            swap(k, j);
            k=j;
        }
    }
    
    private boolean less(int i, int j) {
        return theHeap[i].compareTo(theHeap[j]) < 0;
    }
    
    private void swap(int i, int j){
        Key temp = theHeap[i];
        theHeap[i] = theHeap[j];
        theHeap[j] = temp;
    }
    
    public void printHeap() {
        for(int i = 1; i <= heapMax; i++) {
            StdOut.print(theHeap[i]);
        }
        StdOut.println();
    }
    
    
    public static void main(String[] args) {
        BinaryHeap<Integer> binHeap = new BinaryHeap<Integer>(10);
        
        binHeap.insert(1);
        binHeap.insert(3);
        binHeap.insert(2);
        binHeap.insert(4);
        binHeap.insert(7);
        binHeap.insert(6);
        binHeap.remove();
        binHeap.insert(5);
        
        binHeap.printHeap();
        
        
    }
}
