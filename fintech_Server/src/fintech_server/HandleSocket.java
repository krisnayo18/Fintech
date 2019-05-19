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
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.User;
import fintech_server.Fintech_Server;

public class HandleSocket extends Thread{
    MainServer parent;
    Socket client;
    BufferedReader chatFromClient;
    DataOutputStream chatToClient;
    User user = new User();
    MainServer server;
    Connection connect;
    Socket clientSocket;
    String nama;

    
    int USD = 4;
    int Euro = 5;
    int Pounds = 2;
    int Baca = 2;
   
    public HandleSocket(MainServer pMs, Socket pS, String pNama)
    {
       
        connect = user.getConnection();
        this.server = pMs;
        this.clientSocket = pS;
        this.nama = pNama;
        
    }
    
    @Override
    public void run()
    {
        try{
            super.run();
            chatFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            chatToClient = new DataOutputStream(clientSocket.getOutputStream());
            
            while(true)
            {
                ArrayList<User> datas = user.display();
                String request = chatFromClient.readLine();
                String[] pecah = request.split("-");
                if(pecah[0].equals("LOGIN")){
                    String username = pecah[1].toString();
                    String password = pecah[2].toString();
                    
                    User db = new User(username, password);
                    String res = db.checkLogin();
                    if(res.equals("1"))
                    {
                        chatToClient.writeBytes("TRUE" + "\n");
                    }
                    else
                    {
                       chatToClient.writeBytes("FALSE" + "\n");
                    }
                }
                
                else if(pecah[0].equals("REGISTRASI"))
                {
                    int status = 0;
                    for (User data : datas) 
                    {
                        
                        if(pecah[1].equals(data.getUsername())) 
                        {
                            status = 0;
                            break;
                        }
                        else status = 1;
                    }
                    if(status == 1)
                    {
                        user = new User(pecah[1],pecah[2]);
                        user.insert();
                        chatToClient.writeBytes("SUKSES" +"\n");
                    }
                    else chatToClient.writeBytes("GAGAL"+"\n");
                }
                else if(pecah[0].equals("MENU"))
                {
                    String Indo = pecah[1];
                    String Invess = pecah[2];
                    String Baca = pecah[3];
                    chatToClient.writeBytes("TRUE-" + Indo + "-" + Invess + "-" + Baca +"\n");
                    
                }
                else if(request.contains("Saham"))
                {
                    USD++;
                    Euro++;
                    Pounds++;
                    Baca++;
                    chatToClient.writeBytes("berhasil-" + USD + "-" + Euro + "-" + Pounds  + "-" + Baca + "\n" );
                }
            }
            
        }catch(IOException ex)
        {
            Logger.getLogger(HandleSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
