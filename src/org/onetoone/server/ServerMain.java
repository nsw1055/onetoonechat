package org.onetoone.server;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) throws Exception {

        System.out.println("Ready................");

        ServerSocket serverSocket = new ServerSocket(5555);
        Socket socket = serverSocket.accept();

        ServerService service = new ServerService(socket);
        service.runServer();
    }
}
