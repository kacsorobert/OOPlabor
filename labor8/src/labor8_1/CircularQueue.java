package labor8_1;

import java.util.Arrays;
import java.util.Objects;

public class CircularQueue implements IQueue{
    private final int CAPACITY;
    private Object[] items;
    private int front;
    private int rear;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items=new Object[this.CAPACITY];
        this.front=-1;
        this.rear=-1;
    }

    @Override
    public boolean isEmpty() {
        return front==-1;
    }

    @Override
    public boolean isFull() {
        return (front==0 && rear==CAPACITY-1) || front==rear+1;
    }

    @Override
    public void enQueue(Object obj){
        if(isFull()){
            System.out.println("The queue is full!");
            return;
        }

        if(isEmpty()){
            front=0;
            rear=0;
            items[0]=obj;
        }
        else{
            rear=(++rear) % CAPACITY;
            items[rear]=obj;
        }
    }

    @Override
    public Object deQueue() {
        if(isEmpty()){
            System.out.println("The queue is empty!");
            return null;
        }
        Object item=items[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front=(++front) % CAPACITY;
        }
        return item;
    }

    @Override
    public void printQueue() {
        System.out.print("CircularQueue [ array[ ");
        for(Object obj:items){
            System.out.print(obj+" ");
        }
        System.out.println("], front: "+front+" ,rear: "+rear+"]");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircularQueue that = (CircularQueue) o;
        Arrays.sort(that.items);
        Arrays.sort(items);
        return CAPACITY == that.CAPACITY && Arrays.equals(items, that.items);
    }
}
