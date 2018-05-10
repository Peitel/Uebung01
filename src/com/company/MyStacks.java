package com.company;

import java.util.ArrayList;

public class MyStacks<T> implements MyStack {

    private ArrayList<Object> stack = new ArrayList<>();
    private int counter = 0;


    @Override
    public void push(Object input) {
        stack.add(input);
        counter++;
    }

    @Override
    public Object pop() {
        if (counter == 0) {
            return null;
        } else counter -= 1;
        return stack.remove(counter);

    }

    @Override
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        } else return false;
    }

}
