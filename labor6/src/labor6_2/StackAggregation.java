package labor6_2;

import java.util.ArrayList;

public class StackAggregation {
    private int capacity;
    private ArrayList<Object> items=new ArrayList<>();

    public StackAggregation(int capacity) {
        this.capacity = capacity;
    }

    public void push(Object element){
        if(items.size()==capacity){
            System.out.println("The stack is full!");
            return;
        }
        items.add(element);
    }

    public void pop(){
        if(items.size()==0){
            System.out.println("The stack is empty!");
            return;
        }
        items.remove(items.size()-1);
    }

    public Object top(){
        if(items.size()==0){
            System.out.println("The stack is empty!");
            return null;
        }
        return items.get(items.size()-1);
    }

    public int getSize(){
        return items.size();
    }

    public boolean isFull(){
        return items.size()==capacity;
    }

    public boolean isEmpty(){
        return items.size()==0;
    }
}
