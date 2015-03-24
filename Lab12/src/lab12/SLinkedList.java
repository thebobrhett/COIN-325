/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/* Bob Rhett - Tuesday, March 24, 2015
 *   A class to create a singly linked list
 *   and implement the interface methods of the List class.
 */
public class SLinkedList implements List {
    Node head, tail;
    
    @Override
    // I wasn't sure if the index should start at 0 or 1.
    // I chose to allow an index of 0 to be the first element
    // in the list (thus count starts at 1).
    public Object get(int index) {
        Object obj;
        int count = 1;
        Node here = head;

        while (count <= index) {
            here = here.next;
            count++;
        }

        return here.value;
    }

    @Override
    public void add(Object obj) {
        Node node = new Node();
        node.value = obj;
        node.next = null;
        
        if (head == null && tail == null) {
            head = tail = node;
        } else {
            if (head != null && tail != null) {
                tail.next = node;
                tail = node;
            } else {
                System.err.println("Invalid state. Only one is null: head, tail");
            }
        }
    }

    @Override
    // This may not be the most elegant solution but at least I understand it!
    public int size() {
        Node here = head;
        int count = 0;
        while (here != null) {
            count++;
            here = here.next;
        }
        return count;
    }
    
    class Node {
        Object value;
        Node next;
    }
}
