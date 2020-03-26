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
public class DeviceNode {
    
    private String data;
    public DeviceNode previous;
    public DeviceNode next;

    public DeviceNode(String data) {
        previous = null;
        this.data = data;
        next = null;
    }

    public DeviceNode(DeviceNode previous, String data, DeviceNode next) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }
    public String getData(){
    return data;
    }
}
