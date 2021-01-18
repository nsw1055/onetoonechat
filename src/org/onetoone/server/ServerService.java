package org.onetoone.server;

import org.onetoone.BaseUI;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerService extends BaseUI {

    public ServerService(Socket socket) throws Exception {
        super(socket);
    }

    public void runServer() throws Exception {

        runChat();
    }
}
