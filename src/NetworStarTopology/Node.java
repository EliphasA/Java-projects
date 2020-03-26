/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworStarTopology;

/**
 *
 * @author Andreas E.S
 */
public class Node {

    private int data;
    public Node previous;
    public Node next;

    public Node(int data) {
        previous = null;
        this.data = data;
        next = null;
    }

    public Node(Node previous, int data, Node next) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }
    String name;
    
    Node(Node previous, String data, Node next) {
        this.previous = previous;
        this.name = data;   
    }
    public int getData() {
        return data;
    }
}
