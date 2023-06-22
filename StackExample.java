package com.datastructure;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //Stack is a linear data structure  which works on the principle of LAST IN FIRST OUT(LIFO).
        Stack<Integer>stack=new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.println("The elements in the stack are "+stack);
        System.out.println("The element at the top of the stack is "+stack.peek());
        System.out.println("The size of the stack before pop operations is "+stack.size());
        stack.pop();
        stack.pop();
        System.out.println("The size of the stack after pop operations is "+stack.size());
        System.out.println("70 is present in the list or not ="+stack.contains(70));
        boolean isEmpty= stack.isEmpty();
        System.out.println("The stack is empty =>"+isEmpty);
        stack.clear();
        System.out.println("The stack is cleared successfully.");
    }
}
