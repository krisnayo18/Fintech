/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fintech_client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Krisna
 */
public class fintech_client {

    /**
     * @param args the command line arguments
     */
             
    Socket clientSocket;
    DataOutputStream sendToServer;
    BufferedReader chatFromServer;     
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public fintech_client()
    {
         try 
        {
        //buat koneksi
            clientSocket = new Socket("localhost",6000);
            sendToServer = new DataOutputStream(clientSocket.getOutputStream()); // untuk mengirim pesan ke server
            // untuk menerima pesan dari server
            chatFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
        }catch(IOException ex)
        {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }  
}