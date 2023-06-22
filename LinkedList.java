package com.datastructure;

public class LinkedList {
    Node header;
    public LinkedList(){
        header=null;
    }
    public void createList(int d){
        Node newnode=new Node(d);
        header=newnode;
    }
    //Adding the newnode at start.
    public void insertFirst(int d){
        Node newnode=new Node(d);
        newnode.link=header;
        header=newnode;
    }
    //Removing the first node.
    public void deleteFirst(){
        if(header!=null){
            System.out.println("Delete node " +header.data);
            header=header.link;
        }
        else
            System.out.println("List is empty.");
    }
    //Adding the node at the end.
    public void appendNode(int d){
        Node temp=header;
        while(temp.link!=null){
            temp=temp.link;
        }
        Node newnode=new Node(d);
        temp.link=newnode;
    }
    //Searching the element in the linked list
    public void searchElement(int element) {
        Node temp = header;
        int position = 1;
        int count = 0;

        while (temp != null) {
            if (temp.data == element) {
                System.out.println("The element is found at position " + position);
                count++;
                break;
            }
            position++;
            temp = temp.link;
        }
        if (count == 0) {
            System.out.println("Element not found in the list.");
        }
    }
        public int countNode(){
            Node currentNode=header;
            int count=0;

            while(currentNode!=null){
                count++;
                currentNode=currentNode.link;
            }
            return count;
        }
    public void insertAtNth(int n, int d){
        if(countNode()+1<n){
            System.out.println("Invalid position");
            return;
        }
        else if(n==1){
            insertFirst(d);
            return;
        }
        Node newNode=new Node(d);
        Node currentNode=header;
        int count=1;
        while(count<(n-1)){
            currentNode=currentNode.link;
            count++;
        }
        newNode.link=currentNode.link;
        currentNode.link=newNode;
    }
    public void deleteNth(int n){
        if(countNode()<n){
            System.out.println("Invalid position");
            return;
        }
        Node currentNode=header;
        int count=1;
        while(count<(n-1)){
            currentNode=currentNode.link;
            count++;
        }
        currentNode.link=currentNode.link.link;
    }
    public void printList(){
        Node currentnode=header;
        while(currentnode.link != null){
            System.out.print(currentnode.data+" =>");
            currentnode=currentnode.link;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        obj.createList(30);
        obj.insertFirst(56);
        obj.insertAtNth(2,70);
        obj.appendNode(75);
        obj.countNode();
        obj.searchElement(75);
        obj.printList();

    }
}
