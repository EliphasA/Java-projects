/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworStarTopology;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Andreas E.S
 */
public class ServerNode {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        server = new ServerSocket(port);
        ServerNode server = new ServerNode();
        server.broker();
    }
    /**
     * ServerNode node from the previous client and one to the next client
     */
    private static ServerSocket server;
    
    //Socket server port on which it will listen
    private static int port = 2535;

    public void broker() throws IOException, ClassNotFoundException, InterruptedException {
        
                    System.out.println("__________________________________\n"
                                     + "<<Waiting for the client request>>");
        //listens until the program terminates
        while (true) {
            
            //creating the socket and wait for client connection
            Socket socket = server.accept();

            //reading from socket to ObjectInputStream object
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

            //Converting objectInputStream object tp String
            String message = (String) input.readObject();
            System.out.println("Message recieved from: " + message);

            //Creating objectOutputStream object
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            //Writing object to a socket
            output.writeObject("Hi " + message);
            //Close resources
            input.close();
            output.close();
            socket.close();
            //time it should take to print out the recueved message
            Thread.sleep(2000);
            //terminate the server if the client sends an exit request
            if (message.equalsIgnoreCase("exit")){ 
                break;
            }
        }
        System.out.println("_________________________\n"
                + "Shuting down the server!!\n"
                + "-------------------------");
        //Close the serverSocket object
        server.close();
    }
}
