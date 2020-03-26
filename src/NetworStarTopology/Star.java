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
public class Star {

    private DeviceNode hub;
    private DeviceNode devices;
    private int pointer;

    private Node head;
    private int size;

    public Star() {
        head = null;
        size = 0;
    }

    //inserting node in the model method
    public void insertNode(int data) {
        if (head == null) {
            head = new Node(null, data, null);
        } else {
            Node newLink = new Node(null, data, head);
            head.previous = newLink;
            head = newLink;
        }
        size++;
    }

    //deleting nodes from the model method
    public void deleteNode() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    //Method for adding a hub star topology
    public void addDevice(String data) {
        if (hub == null) {
            hub = new DeviceNode(null, data, null);
        } else {
            DeviceNode current = hub;
            while (current.next != null) {
                current = current.next;
            }
            DeviceNode newLink = new DeviceNode(current, data, null);
            current.next = newLink;
        }
        size++;
    }
    //Method for adding devices to the star
    public void addFront(String data) {
        if (hub == null) {
            hub = new DeviceNode(null, data, null);
        } else {
            DeviceNode newLink = new DeviceNode(null, data, hub);
            hub.previous = newLink;
            hub = newLink;
        }
        size++;
    }

    //printing out elements in the the model
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }
    }

    public void printDevice() {
        DeviceNode current = hub;
        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }
    }
}
