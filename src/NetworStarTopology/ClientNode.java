/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworStarTopology;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.LinkedList;

/**
 *
 * @author Andreas E.S
 */
public class ClientNode {
    
    public void sentRecieve() throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException {
        //get the localHost IP address, if the server is running on the some other ip
        InetAddress host = InetAddress.getLocalHost();
        Socket socket   =  null;
        ObjectOutputStream output = null;
        ObjectInputStream input = null;
           
          LinkedList client = new LinkedList();
          client.add("Elifas");
          client.add("Andrew");
          client.add("Claudia");
          client.add("Ester");
          client.add("Emilie");
        
        for (int i = 0; i < client.size(); i++) {
            int size = client.size();
            //establishing socket connection to a server
            socket = new Socket(host.getHostName(), 2535);
            //write to the socket using ObjectOutputStream
            output = new ObjectOutputStream(socket.getOutputStream());
            System.out.println(client.get(i)+" sending request to the server");
            if (size > 5) {
                output.writeObject("exit");
            }
            else{
                output.writeObject(" "+ client.get(i));
            }
            //reading the server response
            input = new ObjectInputStream(socket.getInputStream());
            String message = (String) input.readObject();
            System.out.println("Response: "+message);
            
            //close resources
            input.close();
            output.close();
            Thread.sleep(2000);
           }
        }
    }

