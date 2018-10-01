package main;


import frame.ClienteFrame;


public class Cliente {

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteFrame().setVisible(true);
            }
        });
    }
}
