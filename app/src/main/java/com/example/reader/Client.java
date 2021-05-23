package com.example.reader;
import android.content.res.Resources;
import android.widget.TextView;
import android.widget.Toast;

import java.net.*;
import java.io.*;

import androidx.appcompat.app.AppCompatActivity;

public class Client extends Thread{

    static public String result = "0123456789012346788";

    private String _data = "";
    private String _address;
    private int _port;
    private AppCompatActivity _app = null;
    private TextView text;
    private boolean t = false;

    public Client(String command, String address, int port){
        this._data = command;
        this._address = address;
        this._port = port;

    }

    public void run(){
        try {
            this.main();
            //text.setText("OK");
        } catch (IOException e) {
            t = false;
            e.printStackTrace();
            text.setText("NE OK");
        }
    }
    public void main() throws IOException {
        Socket client_socket = new Socket(this._address, this._port);
        client_socket.getOutputStream().write(this._data.getBytes());
        byte[] b = new byte[100];
        client_socket.getInputStream().read(b);
        Client.result = new String(b, "utf-8");
        client_socket.close();
    }

}
