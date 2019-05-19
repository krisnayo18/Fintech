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
                ArrayList<String> listSaham = user.displaySaham();
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
                    db.insertHistory(username, "LOGIN");
                }
                else if (pecah[0].equals("LOGOUT"))
                {
                   user = new User();
                   user.insertHistory("", "LOGOUT" );
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
                        user.insertHistory(pecah[1], "REGISTRASI");
                        chatToClient.writeBytes("SUKSES" +"\n");
                    }
                    else{
                        chatToClient.writeBytes("GAGAL"+"\n");
                    } 
                        
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
                    String hasil = "";
                    String badanUsaha = "";
                    double usd = 0;
                    double euro = 0;
                    double pounds = 0;
                    double ihsg = 0;
                    int count = listSaham.size();
                    for(int i=0; i < count; i++)
                    {
                        String[] saham = listSaham.get(i).split("-");
                        badanUsaha = saham[0];
                        usd = Double.parseDouble(saham[1]);
                        euro = Double.parseDouble(saham[2]);
                        pounds = Double.parseDouble(saham[3]);
                        ihsg = Double.parseDouble(saham[4]);
                        
                        if(badanUsaha.equals("Investhree"))
                        {
                            hasil = user.hitungSahamInves(usd, euro, pounds, ihsg);
                           
                        }
                       else if(badanUsaha.equals("IndoPremium"))
                        {
                            hasil = user.hitungSahamIndo(usd, euro, pounds, ihsg);
                        }
                       else if(badanUsaha.equals("Baca"))
                        {
                            hasil = user.hitungSahamBaca(usd, euro, pounds, ihsg);
                        }
                        System.out.println("base value : " + listSaham.get(i));
                        System.out.println("sudah di Gap : " + hasil);
                        System.out.println("");
                        chatToClient.writeBytes("berhasil-"+ badanUsaha + "-" + hasil + "\n" );
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(HandleSocket.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
            
        }catch(IOException ex)
        {
            Logger.getLogger(HandleSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
