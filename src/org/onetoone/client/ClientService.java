package org.onetoone.client;

import org.onetoone.BaseUI;

import java.net.Socket;

public class ClientService extends BaseUI {


    public ClientService(Socket socket) throws Exception {
        super(socket);
    }

    public void runClient() throws Exception{

        runChat();
    }
}
