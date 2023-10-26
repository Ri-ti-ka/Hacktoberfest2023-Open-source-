import java.util.Arrays;

public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }
public void insert(int value) {
        if (isFull()) {
            throw new IllegalStateException("Heap is full");
        }
        heap[size] = value;
        size++;
        siftUp(size - 1);
    }
public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(5);
        minHeap.insert(10);
        minHeap.insert(3);
        minHeap.insert(8);
        minHeap.insert(1);

        System.out.println("Min Heap:");
        while (!minHeap.isEmpty()) {
            int min = minHeap.remove();
            System.out.print(min + " ");
        }
    }
}






