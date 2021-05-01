package labor10_4;

import java.util.ArrayList;

public class Stack {
    private int capacity;
    private ArrayList<Object> items=new ArrayList<>();

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public void push (Object element) throws StackException{
        if(isFull()){
            throw new StackException("The stack is full!");
        }
        items.add(element);
    }

    public void pop() throws StackException{
        if(isEmpty()){
            throw new StackException("The stack is empty!");
        }
        items.remove(items.size()-1);
    }

    public Object top() throws StackException{
        if(isEmpty()){
            throw new StackException("The stack is empty!");
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
