package org.onetoone;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public abstract class BaseUI {

    private Scanner scanner;
    private Socket socket;
    private DataOutputStream dos;
    private DataInputStream din;

    public BaseUI(Socket socket) throws Exception {
        this.socket = socket;
        this.scanner = new Scanner(System.in);
        this.dos= new DataOutputStream(socket.getOutputStream());
        this.din= new DataInputStream(socket.getInputStream());
    }

    public void runChat() throws  Exception{
        System.out.println("a client connect.....");

        new Thread(()->{
            try {
                // 읽기용 루프
                for (int i = 0; i < 100; i++) {
                    String msg = din.readUTF();
                    System.out.println("받은 메시지: " +msg);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }).start();
        // 쓰기용 루프
        for (int i = 0; i < 100; i++) {
            String myMsg = scanner.nextLine();
            dos.writeUTF(myMsg);
            dos.flush();
        }
    }
}
