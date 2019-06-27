/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

/**
 *
 * @author rkaune
 */
public class ArrayStackTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ArrayStack<Integer> arrayStack = new ArrayStack<Integer>();
        ArrayStack<Integer> arrayStack = new ArrayStack<Integer>(1);
        arrayStack.push(1);
        System.out.println("Stack size: " + arrayStack.size());
        arrayStack.push(2);
        System.out.println("Stack size: " + arrayStack.size());
        arrayStack.push(3);
        
//        arrayStack.push(3);
        System.out.println("Stack size: " + arrayStack.size());
        System.out.println("Stack before peek " + arrayStack);
        System.out.println("Calling peek method ");
        System.out.println(arrayStack.peek());
        System.out.println("Stack before pop " + arrayStack);
        System.out.println("Calling pop method ");
        System.out.println(arrayStack.pop());
        System.out.println("Stack after pop " + arrayStack);
        System.out.println("Stack size: " + arrayStack.size());
        System.out.println(arrayStack);
    }
    
}
