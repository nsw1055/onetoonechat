package org.onetoone.client;

import java.net.Socket;

public class ClientMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Ready................");

        Socket socket = new Socket("127.0.0.1", 5555);

        ClientService service = new ClientService(socket);
        service.runClient();
    }
}
