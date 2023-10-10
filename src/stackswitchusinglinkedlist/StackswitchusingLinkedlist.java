/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackswitchusinglinkedlist;

import java.util.Scanner;


public class StackswitchusingLinkedlist {
        
        private class StackNode{
            int data;
            StackNode next;
        }
        private StackNode top;
        private int size;
        
        private StackNode createNewNode (int element) throws Exception{
            StackNode node = new StackNode();
            if (node == null){
                throw new Exception ("memory is full");
            }else{
                node.data = element;
                node.next = null;
                return node;
            }
        }
        
        public void push(int element) throws Exception{
            StackNode node = createNewNode(element);
            if (size == 0){
            top = node;
        }else{
                node.next = top;
                top = node;
            }
            size++;
        }
        
        public int pop ()throws Exception{
            
            if (size == 0){
                throw new Exception("Stack is empty");
                
            }
            int temp = peek();
            top = top.next;
            size--;
            return temp;
        }
        
        public int peek() throws Exception{
        if (size == 0){
            throw new Exception ("stack is empty");
        }
        return top.data;
        
      
        }
        
        public void display () throws Exception{
            if (size == 0) {
                throw new Exception ("Stack is empty");
            }
            StackNode temporary = top;
            
            while (temporary != null){
                System.out.println(temporary.data +" ->");
                temporary = temporary.next;
            }
            System.out.println("NULL");
        }
        
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        StackswitchusingLinkedlist Stack = new StackswitchusingLinkedlist();
        
        while (true){
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. display");
            System.out.println("4. Exit");
            
            int element;
            int choice = scn.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("enter value of push");
                    element = scn.nextInt();
                    Stack.push(element);
                    System.out.println("\n");
                    break;
                    
                case 2:
                    System.out.println("deleted na");
                    System.out.println("\n");
                    
                case 3:
                    Stack.display();
                    System.out.println("\n");
                    break;
                    
                case 4:
                   scn.close();
                   System.exit(0);
                    
                
            }
        }
    }
    }
    
    
    
    
