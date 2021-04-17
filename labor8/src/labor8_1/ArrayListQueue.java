package labor8_1;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue{
    private ArrayList<Object> items;
    private final int CAPACITY;

    public ArrayListQueue(int CAPACITY) {
        this.items = new ArrayList<>();
        this.CAPACITY = CAPACITY;
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean isFull() {
        return items.size()==CAPACITY;
    }

    @Override
    public void enQueue(Object obj) {
        if(!isFull()){
            items.add(obj);
        }
        else{
            System.out.println("The queue is full!");
        }
    }

    @Override
    public Object deQueue() {
        if(isEmpty()){
            System.out.println("The queue is empty!");
            return null;
        }
        return items.remove(0);
    }

    @Override
    public void printQueue() {
        System.out.println("ArrayListQueue"+items.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        return Objects.equals(items, that.items);
    }
}
