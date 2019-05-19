/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fintech_client;

import java.awt.Panel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Krisna
 */
public class MultiRequestSaham  extends  Thread {
    public String requestToServer;
    public String sendToServer;
    fintech_client akun;
    public Boolean server = true;
    
    
    public MultiRequestSaham(String pRequest, fintech_client pAkun)
    {
        this.requestToServer = pRequest;
        this.akun =pAkun;
    }
    public MultiRequestSaham(){
        
    }
    public void Close(){
        this.server = false;
    }
    @Override
    public void run()
    {
        while(server == true)   
        {
            try
            {                 
                 akun.sendToServer.writeBytes(requestToServer + "\n");
                 String Accept = akun.chatFromServer.readLine();
                 String[] pecah = Accept.split("-");
                 String badanUsaha = pecah[1];    
                 String USD = pecah[2];
                 String Euro = pecah[3];
                 String Pounds = pecah[4];
                 String Ihsg = pecah[5];
                 FormTampilSaham fm = new FormTampilSaham();
                 
                 if(pecah[0].equals("berhasil"))
                 {
                     if(badanUsaha.equals("Investhree"))
                     {
                        fm.TampilkanSahamInvess(USD,Euro,Pounds,Ihsg); 
                     }
                     if(badanUsaha.equals("IndoPremium"))
                     {
                         fm.TampilkanSahamIndo(USD,Euro,Pounds,Ihsg);  
                     }
                     if(badanUsaha.equals("Baca"))
                     {
                         fm.TampilkanSahamBaca(USD,Euro,Pounds,Ihsg);  
                     }
                                        
                 }
                 
                 Thread.sleep(5000);
            }
            catch(Exception ex)
            {
                System.out.println(ex);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex1) {
                    Logger.getLogger(MultiRequestSaham.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
           
        }
    }
    
    
    
}
