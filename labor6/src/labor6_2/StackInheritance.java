package labor6_2;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {
    private int capacity;

    public StackInheritance(int capacity) {
        this.capacity = capacity;
    }

    public void push(Object element){
        if(super.size()==capacity){
            System.out.println("The stack is full!");
            return;
        }
        super.add(element);
    }

    public void pop(){
        if(super.size()==0){
            System.out.println("The stack is empty!");
            return;
        }
        super.remove(super.size()-1);
    }

    public Object top(){
        if(super.size()==0){
            System.out.println("The stack is empty!");
            return null;
        }
        return super.get(super.size()-1);
    }

    public int getSize(){
        return super.size();
    }

    public boolean isFull(){
        return super.size()==capacity;
    }

    public boolean isEmpty(){
        return super.size()==0;
    }
}
