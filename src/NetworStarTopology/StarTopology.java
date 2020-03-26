/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworStarTopology;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * 
 */
public class StarTopology {

    /**
     * d
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException, NullPointerException {

        boolean found = false;
        Scanner in = new Scanner(System.in);
        System.out.println("*****************************************\n"
                + "-----------------------------------------\n"
                + "    1.CLIENT            2.STAR           \n"
                + "                                         \n"
                + "              3.EXIT                     \n"
                + "-----------------------------------------\n"
                + "*****************************************");
        System.out.print("Option (Star,Client or Exit): ");

        String option = in.next();
        
        
        if (option.equalsIgnoreCase("CLIENT")) {
            //Creating a linked list for clients who can access the server
            LinkedList names = new LinkedList();
            names.add("Elifas");
            names.add("Andrew");
            names.add("Claudia");
            names.add("Ester");
            names.add("Emilie");

            System.out.print("Username: ");
            String userName = in.next();
            for (int i = 0; i < names.size(); i++) {
                if (userName.equalsIgnoreCase(names.get(i).toString())) {
                    found = true;
                }
            }
            LinkedList pwd = new LinkedList();
            pwd.add(218024142);
            pwd.add(218006225);
            pwd.add(217050824);
            pwd.add(218067496);
            pwd.add(218053665);

            if (found) {
                System.out.print("Your password " + userName + ": ");
                String password = in.next();
                boolean gotIt = false;

                for (int i = 0; i < pwd.size(); i++) {
                    if (password.equals(pwd.get(i).toString())) {
                        gotIt = true;
                    }
                }
                //User login
                if (gotIt) {
                    if (userName.equalsIgnoreCase("Elifas") && pwd.equals(218024142)) {
                        gotIt = true;
                    }
                    if (gotIt) {
                        System.out.println("_______________________________________\n"
                                + " WELCOME TO THE CLIENT SERVER " + userName + "\n"
                                + ":::::::::::::::::::::::::::::::::::::::");
                         //Creating the client object
                         ClientNode client = new ClientNode();
                        try {
                            client.sentRecieve();
                        } catch (InputMismatchException e) {
                            System.out.println("Check your inputs");
                        }
                    } else {
                        System.out.println("_______________________________\n"
                                + "Check your password" + userName + "\n"
                                + "*******************************");
                    }
                } else if (gotIt) {
                    if (userName.equalsIgnoreCase("Andrew") && pwd.equals(218006225)) {
                        gotIt = true;
                    }
                    if (gotIt) {
                        System.out.println("___________________________________\n"
                                + " WELCOME TO THE CLIENT SERVER " + userName + "\n"
                                + "::::::::::::::::::::::::::::::::::::");
                        ClientNode client = new ClientNode();
                        try {
                            client.sentRecieve();
                        } catch (InputMismatchException e) {
                            System.out.println("Check your inputs");
                        }
                    } else {
                        System.out.println("_______________________________\n"
                                + "Check your password" + userName + "\n"
                                + "*******************************");
                    }
                } else if (gotIt) {
                    if (userName.equalsIgnoreCase("Claudia") && pwd.equals(217050824)) {
                        gotIt = true;
                    }
                    if (gotIt) {
                        System.out.println("___________________________________\n"
                                + " WELCOME TO THE CLIENT SERVER " + userName + "\n"
                                + "::::::::::::::::::::::::::::::::::::");
                        ClientNode client = new ClientNode();
                        try {
                            client.sentRecieve();
                        } catch (InputMismatchException e) {
                            System.out.println("Check your inputs");
                        }
                    } else {
                        System.out.println("_______________________________\n"
                                + "Check your password" + userName + "\n"
                                + "*******************************");
                    }
                } else if (gotIt) {
                    if (userName.equalsIgnoreCase("Ester") && pwd.equals(218067496)) {
                        gotIt = true;
                    }
                    if (gotIt) {
                        System.out.println("___________________________________\n"
                                + " WELCOME TO THE CLIENT SERVER " + userName + "\n"
                                + "::::::::::::::::::::::::::::::::::::");
                        ClientNode client = new ClientNode();
                        try {
                            client.sentRecieve();
                        } catch (InputMismatchException e) {
                            System.out.println("Check your inputs");
                        }
                    } else {
                        System.out.println("_______________________________\n"
                                + "Check your password" + userName + "\n"
                                + "*******************************");
                    }
                } else if (gotIt) {
                    if (userName.equalsIgnoreCase("Emilie") && pwd.equals(218053665)) {
                        gotIt = true;
                    }
                    if (gotIt) {
                        System.out.println("___________________________________\n"
                                + " WELCOME TO THE CLIENT SERVER " + userName + "\n"
                                + "::::::::::::::::::::::::::::::::::::");
                        ClientNode client = new ClientNode();
                        try {
                            client.sentRecieve();
                        } catch (InputMismatchException e) {
                            System.out.println("Check your inputs");
                        }
                    } else {
                        System.out.println("_______________________________\n"
                                + "Check your password" + userName + "\n"
                                + "*******************************");
                    }
                } //ende for user login
                else {
                    System.out.println("_________________________________________\n"
                            + "Invalid password " + userName + ", try again.\n"
                            + "_________________________________________");
                }
            } else {
                System.out.println("____________________________________\n"
                        + "You don't have access to this device\n"
                        + "__--------------------------------__");
            }
            //Server login
        } else if (option.equalsIgnoreCase("SERVER")) {
            LinkedList admin = new LinkedList();
            admin.add("Elifas");

            System.out.print("Username: ");
            String userN = in.next();
            for (int i = 0; i < admin.size(); i++) {
                if (userN.equalsIgnoreCase(admin.get(i).toString())) {
                    found = true;
                }
            }
            if (found) {
                boolean foundp = false;
                LinkedList pwd = new LinkedList();
                pwd.add("Andreas");

                System.out.print("Your password " + userN + ": ");
                String passwrd = in.next();

                for (int i = 0; i < pwd.size(); i++) {
                    if (passwrd.equalsIgnoreCase(pwd.get(i).toString())) {
                        foundp = true;
                    }
                }
                if (foundp) {
                    try {
                        ServerNode server = new ServerNode();
                        server.broker();
                    } catch (NullPointerException e) {
                        System.out.println("");
                    }
                } else {
                    System.out.println("_____________________________________\n"
                            + "Invalid password " + userN + ", try again\n"
                            + "_____________________________________");
                }
            } else {
                System.out.println("_________________________________________\n"
                        + "You are not allowed to access the server.\n"
                        + "_________________________________________");
            }
        } //Star login
        else if (option.equalsIgnoreCase("STAR")) {
            System.out.print("Username: ");
            String userNa = in.next();
            System.out.print("password: ");
            String password = in.next();
            if (userNa.equalsIgnoreCase("Star") && password.equalsIgnoreCase("star")) {
                System.out.println("+------------------------------+\n"
                        + "| Welcome to the star topology |\n"
                        + "--------------------------------\n"
                        + "  1.Add node\n"
                        + "  2.Delete node\n"
                        + "  3.Add device\n"
                        + "--------------------------------\n"
                        + "--------------------------------");
                System.out.print("Choice(1-2): ");
                String choice = in.next();
                if (choice.equalsIgnoreCase("1")) {
                    System.out.println("Enter nodes:");
                    int node1 = in.nextInt();
                    int node2 = in.nextInt();
                    int node3 = in.nextInt();
                    int node4 = in.nextInt();
                    int node5 = in.nextInt();
                    Star star = new Star();
                    System.out.println("\nAdded nodes\n"
                            + "---------------");
                    star.insertNode(node1);
                    star.insertNode(node2);
                    star.insertNode(node3);
                    star.insertNode(node4);
                    star.insertNode(node5);

                    star.print();
                } else if (choice.equalsIgnoreCase("2")) {
                    Star star = new Star();
                    System.out.println("Before deletion\n"
                            + "---------------");
                    star.insertNode(30);
                    star.insertNode(32);
                    star.insertNode(33);
                    star.insertNode(34);
                    star.insertNode(35);
                    star.print();
                    System.out.println("After deletion\n"
                            + "--------------");
                    star.deleteNode();
                    star.print();
                }
                else if (choice.equalsIgnoreCase("3")) {
                    
                    System.out.println("Enter device name: ");
                    String name = in.next();
                    String names = in.next();
                    Star star = new Star();
                    //Adding devices at the bac of the hub
                    star.addDevice(name);
                    //adding devices at the front of he hub
                    star.addFront("HUB");
                    star.addFront(names);
                    System.out.println("Devices added to a hub" );
                                     
                    star.printDevice();
                }
                } else {
                    System.out.println("Invalid username or password!!");
                }

            } else if (option.equalsIgnoreCase("EXIT")) {
                System.exit(0);
            } else {
                System.out.println("_________________________\n"
                        + "Invalid option, try again\n"
                        + "*************************");
            }
        }
}
