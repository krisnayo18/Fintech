/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fintech_server;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;
/**
 *
 * @author Era
 */
public class MainServer {
    ArrayList<HandleSocket> clients;
  
    public MainServer(){
        
        try{
            ServerSocket ss =  new ServerSocket(6000);
            Socket s;
            clients = new ArrayList<>();
            while(true)
            {
                
                s = ss.accept();
                HandleSocket hs = new HandleSocket(this, s, "Thread");
                clients.add(hs);
                hs.start();
                
            }
        }catch(IOException ex)
        {
             System.out.println("Ms");
             Logger.getLogger(MainServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
