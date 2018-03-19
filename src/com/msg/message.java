package com.msg;

import javax.swing.JOptionPane;

public class message {
    
    public static void show(String msg){
        
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static boolean valid(String msg){
        
        boolean sure = false;
        
        if (JOptionPane.showConfirmDialog(null, msg) == JOptionPane.YES_OPTION){
            sure = true;
        }
        
        return sure;
    }
}
