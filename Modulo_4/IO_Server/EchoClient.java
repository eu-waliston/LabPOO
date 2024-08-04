/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package IO_Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.UnknownHostException;

/**
 *
 * @author wesan
 */
public class EchoClient {
    public static void main(String[] args) throws  IOException {
        if(args.length != 2) {
            System.out.println(
                "Usage: java EchoClient <host name> <port number>"
            );

            System.exit(1);
        }

        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);

        try (
            Socket echoSocket = new Socket(hostName, portNumber);

            PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);

            BufferedReader in = new BufferedReader(
                new InputStreamReader(echoSocket.getInputStream())
            );

            BufferedReader stdIn = new BufferedReader(
                new InputStreamReader(System.in)
            )
        ) {
            String userInput;
            while((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                System.out.println("echo: " + in.readLine());
            }
        } catch (UnknownHostException e) {
            System.out.println("Could'd get I/O for connection to " + hostName);

            System.exit(1);
        }
    }
}
