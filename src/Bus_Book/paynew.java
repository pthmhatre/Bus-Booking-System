/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus_Book;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author VIRAJ
 */
public class paynew extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public paynew() {
        initComponents();
    }
    
     public paynew(String Name, String Phone, String from1, String arrival1, String Condn, String Seat2, String Name1, String Phone1, String from, String arrival, String Condn1, String Seat1) {
        initComponents();
        Name_Lab_Sec_4.setText(Name);
        Phone_Lab_Sec_4.setText(Phone);
        Name_Lab_Sec_4.setVisible(true);
        Phone_Lab_Sec_4.setVisible(true);
        
        result_from.setText(from1);
        result_from.setVisible(false);
        result_arrival.setText(arrival1);
        result_arrival.setVisible(false);
        result_ac.setText(Condn);
        result_ac.setVisible(false);
        result_seat.setText(Seat2);
        result_seat.setVisible(false);
        String u,v,w,ac;
        u =(result_from.getText());
        v = (result_arrival.getText());
        w = (result_seat.getText());
        ac=(result_ac.getText());

        if(ac=="NON AC"){
       if(u=="Dadar" && v=="Mahabaleshwar"){
           int l=900;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Dadar" && v=="Raigad Fort"){
           int l=700;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Dadar" && v=="Matheran"){
           int l=650;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Dadar" && v=="Lonavala"){
           int l=600;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Dadar" && v=="Ellora Caves"){
           int l=400;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Borivali" && v=="Mahabaleshwar"){
           int l=950;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Borivali" && v=="Raigad Fort"){
           int l=750;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Borivali" && v=="Matheran"){
           int l=700;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Borivali" && v=="Lonavala"){
           int l=650;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Borivali" && v=="Ellora Caves"){
           int l=450;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Vasai" && v=="Mahabaleshwar"){
           int l=1000;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Vasai" && v=="Raigad Fort"){
           int l=800;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Vasai" && v=="Matheran"){
           int l=750;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Vasai" && v=="Lonavala"){
           int l=700;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Vasai" && v=="Ellora Caves"){
           int l=500;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Worli" && v=="Mahabaleshwar"){
           int l=850;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Worli" && v=="Raigad Fort"){
           int l=650;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Worli" && v=="Matheran"){
           int l=600;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Worli" && v=="Lonavala"){
           int l=550;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Worli" && v=="Ellora Caves"){
           int l=350;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Bhayander" && v=="Mahabaleshwar"){
           int l=800;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Bhayander" && v=="Raigad Fort"){
           int l=600;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Bhayander" && v=="Matheran"){
           int l=550;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Bhayander" && v=="Lonavala"){
           int l=500;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Bhayander" && v=="Ellora Caves"){
           int l=350;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
        }
        else if (ac=="AC"){
            if(u=="Dadar" && v=="Mahabaleshwar"){
           int l=1100;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Dadar" && v=="Raigad Fort"){
           int l=900;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Dadar" && v=="Matheran"){
           int l=850;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Dadar" && v=="Lonavala"){
           int l=800;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Dadar" && v=="Ellora Caves"){
           int l=600;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Borivali" && v=="Mahabaleshwar"){
           int l=1150;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Borivali" && v=="Raigad Fort"){
           int l=950;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Borivali" && v=="Matheran"){
           int l=900;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Borivali" && v=="Lonavala"){
           int l=850;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Borivali" && v=="Ellora Caves"){
           int l=650;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Vasai" && v=="Mahabaleshwar"){
           int l=1200;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Vasai" && v=="Raigad Fort"){
           int l=1000;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Vasai" && v=="Matheran"){
           int l=950;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Vasai" && v=="Lonavala"){
           int l=900;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Vasai" && v=="Ellora Caves"){
           int l=700;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Worli" && v=="Mahabaleshwar"){
           int l=1050;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Worli" && v=="Raigad Fort"){
           int l=850;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Worli" && v=="Matheran"){
           int l=800;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Worli" && v=="Lonavala"){
           int l=750;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Worli" && v=="Ellora Caves"){
           int l=550;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Bhayander" && v=="Mahabaleshwar"){
           int l=1000;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Bhayander" && v=="Raigad Fort"){
           int l=800;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Bhayander" && v=="Matheran"){
           int l=750;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Bhayander" && v=="Lonavala"){
           int l=700;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
       else if(u=="Bhayander" && v=="Ellora Caves"){
           int l=550;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            Private_Amount.setText(y);
       }
        }
    }
    public paynew(String Name1, String Phone1, String from, String arrival, String Condn1, String Seat1) {
        initComponents();
        Name_Lab_Sec_4.setText(Name1);
        Phone_Lab_Sec_4.setText(Phone1);
        Name_Lab_Sec_4.setVisible(true);
        Phone_Lab_Sec_4.setVisible(true);
        
        result_from.setText(from);
        result_from.setVisible(false);
        result_arrival.setText(arrival);
        result_arrival.setVisible(false);
        result_ac.setText(Condn1);
        result_ac.setVisible(false);
        result_seat.setText(Seat1);
        result_seat.setVisible(false);
        
        String i,j,k,ac1;
        ac1=(result_ac.getText());
        k=(result_seat.getText());
        i= (result_from.getText());
        j = (result_arrival.getText());
        
       if(ac1=="NON-AC"){
        if(i=="Morewadi Chowk" && j=="Dadar"){
            int z=400;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Morewadi Chowk" && j=="Satara"){
            int z=120;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Morewadi Chowk" && j=="Pune"){
            int z=190;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Morewadi Chowk" && j=="Worli"){
            int z=70;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Morewadi Chowk" && j=="Bhayander"){
            int z=160;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Limb Phata" && j=="Dadar"){
            int z=300;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Limb Phata" && j=="Satara"){
            int z=90;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Limb Phata" && j=="Pune"){
            int z=170;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Limb Phata" && j=="Worli"){
            int z=100;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Limb Phata" && j=="Bhayander"){
            int z=195;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Vasai parnaka" && j=="Dadar"){
            int z=150;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Vasai parnaka" && j=="Satara"){
            int z=250;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Vasai parnaka" && j=="Pune"){
            int z=310;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Vasai parnaka" && j=="Worli"){
            int z=80;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Vasai parnaka" && j=="Bhayander"){
            int z=35;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="borivali bustop" && j=="Dadar"){
            int z=50;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="borivali bustop" && j=="Satara"){
            int z=180;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="borivali bustop" && j=="Pune"){
            int z=220;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="borivali bustop" && j=="Worli"){
            int z=30;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="borivali bustop" && j=="Bhayander"){
            int z=25;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Sion Bustop" && j=="Dadar"){
            int z=80;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Sion Bustop" && j=="Satara"){
            int z=200;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Sion Bustop" && j=="Pune"){
            int z=240;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Sion Bustop" && j=="Worli"){
            int z=20;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Sion Bustop" && j=="Bhayander"){
            int z=65;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
       }
       else if(ac1=="AC"){
           if(i=="Morewadi Chowk" && j=="Dadar"){
            int z=500;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Morewadi Chowk" && j=="Satara"){
            int z=220;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Morewadi Chowk" && j=="Pune"){
            int z=290;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Morewadi Chowk" && j=="Worli"){
            int z=170;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Morewadi Chowk" && j=="Bhayander"){
            int z=260;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Limb Phata" && j=="Dadar"){
            int z=400;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Limb Phata" && j=="Satara"){
            int z=190;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Limb Phata" && j=="Pune"){
            int z=270;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Limb Phata" && j=="Worli"){
            int z=200;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Limb Phata" && j=="Bhayander"){
            int z=295;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Vasai parnaka" && j=="Dadar"){
            int z=250;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Vasai parnaka" && j=="Satara"){
            int z=350;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Vasai parnaka" && j=="Pune"){
            int z=410;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Vasai parnaka" && j=="Worli"){
            int z=180;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Vasai parnaka" && j=="Bhayander"){
            int z=135;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="borivali bustop" && j=="Dadar"){
            int z=150;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="borivali bustop" && j=="Satara"){
            int z=280;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="borivali bustop" && j=="Pune"){
            int z=320;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="borivali bustop" && j=="Worli"){
            int z=130;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="borivali bustop" && j=="Bhayander"){
            int z=125;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Sion Bustop" && j=="Dadar"){
            int z=180;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Sion Bustop" && j=="Satara"){
            int z=300;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Sion Bustop" && j=="Pune"){
            int z=340;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Sion Bustop" && j=="Worli"){
            int z=120;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
        else if(i=="Sion Bustop" && j=="Bhayander"){
            int z=165;
            int n = Integer.parseInt(k);
            int mult=n*z;
            String g=Integer.toString(mult);
            Public_Amount.setText(g);
        }
       }
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pay_New_Head = new javax.swing.JLabel();
        UPI_button_Pay = new javax.swing.JRadioButton();
        Debit_Button_Pay = new javax.swing.JRadioButton();
        UPI_Number_Pay = new javax.swing.JTextField();
        Card_Number_ = new javax.swing.JTextField();
        Card_Holder_Name = new javax.swing.JTextField();
        CVV_Pay = new javax.swing.JTextField();
        Expired_Date_Pay = new javax.swing.JTextField();
        Pay_BG_Lab3 = new javax.swing.JLabel();
        Proceed_Button_Pay = new javax.swing.JButton();
        Public_Amount = new javax.swing.JLabel();
        Cancel_Button_Pay = new javax.swing.JButton();
        Reset_Detail_Pay = new javax.swing.JButton();
        Amount_Lab_ = new javax.swing.JLabel();
        result_from = new javax.swing.JLabel();
        result_arrival = new javax.swing.JLabel();
        result_ac = new javax.swing.JLabel();
        result_seat = new javax.swing.JLabel();
        Name_Lab_Sec_4 = new javax.swing.JLabel();
        Private_Amount = new javax.swing.JLabel();
        Phone_Lab_Sec_4 = new javax.swing.JLabel();
        Extra_Lab_Sec_4 = new javax.swing.JLabel();
        Pay_BG_1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pay_New_Head.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        Pay_New_Head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pay_New_Head.setText(".. Payment Verification ..");
        getContentPane().add(Pay_New_Head, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 500, 56));

        UPI_button_Pay.setBackground(new java.awt.Color(255, 255, 255));
        UPI_button_Pay.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        UPI_button_Pay.setText("UPI");
        UPI_button_Pay.setContentAreaFilled(false);
        UPI_button_Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPI_button_PayActionPerformed(evt);
            }
        });
        getContentPane().add(UPI_button_Pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 130, -1));

        Debit_Button_Pay.setBackground(new java.awt.Color(255, 255, 255));
        Debit_Button_Pay.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Debit_Button_Pay.setText("Debit/Credit");
        Debit_Button_Pay.setContentAreaFilled(false);
        Debit_Button_Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Debit_Button_PayActionPerformed(evt);
            }
        });
        getContentPane().add(Debit_Button_Pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 200, -1));

        UPI_Number_Pay.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        UPI_Number_Pay.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        UPI_Number_Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPI_Number_PayActionPerformed(evt);
            }
        });
        UPI_Number_Pay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UPI_Number_PayKeyReleased(evt);
            }
        });
        getContentPane().add(UPI_Number_Pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 290, 80));

        Card_Number_.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        Card_Number_.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        Card_Number_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card_Number_ActionPerformed(evt);
            }
        });
        Card_Number_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Card_Number_KeyReleased(evt);
            }
        });
        getContentPane().add(Card_Number_, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 360, 40));

        Card_Holder_Name.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        Card_Holder_Name.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        getContentPane().add(Card_Holder_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 130, -1));

        CVV_Pay.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        CVV_Pay.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        CVV_Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVV_PayActionPerformed(evt);
            }
        });
        CVV_Pay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CVV_PayKeyReleased(evt);
            }
        });
        getContentPane().add(CVV_Pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 60, 40));

        Expired_Date_Pay.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        Expired_Date_Pay.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        getContentPane().add(Expired_Date_Pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, 120, 40));

        Pay_BG_Lab3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_Pictures_1/visaa.png"))); // NOI18N
        getContentPane().add(Pay_BG_Lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 430, 260));

        Proceed_Button_Pay.setBackground(new java.awt.Color(51, 0, 153));
        Proceed_Button_Pay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_Pictures_1/proceed1.png"))); // NOI18N
        Proceed_Button_Pay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Proceed_Button_Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proceed_Button_PayActionPerformed(evt);
            }
        });
        getContentPane().add(Proceed_Button_Pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 659, 190, -1));

        Public_Amount.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        Public_Amount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Public_Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 130, 40));

        Cancel_Button_Pay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_Pictures_1/can1.png"))); // NOI18N
        Cancel_Button_Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_Button_PayActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel_Button_Pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 150, 60));

        Reset_Detail_Pay.setBackground(new java.awt.Color(0, 0, 0));
        Reset_Detail_Pay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_Pictures_1/reset1.png"))); // NOI18N
        Reset_Detail_Pay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reset_Detail_Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_Detail_PayActionPerformed(evt);
            }
        });
        getContentPane().add(Reset_Detail_Pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 650, 160, 60));

        Amount_Lab_.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Amount_Lab_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Amount_Lab_.setText("Amount :");
        getContentPane().add(Amount_Lab_, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 129, 46));
        getContentPane().add(result_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 120, 40));
        getContentPane().add(result_arrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 120, 40));
        getContentPane().add(result_ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 120, 40));
        getContentPane().add(result_seat, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, 120, 40));

        Name_Lab_Sec_4.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        getContentPane().add(Name_Lab_Sec_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 170, 50));

        Private_Amount.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        getContentPane().add(Private_Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 130, 40));

        Phone_Lab_Sec_4.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        getContentPane().add(Phone_Lab_Sec_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 170, 50));

        Extra_Lab_Sec_4.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        Extra_Lab_Sec_4.setText("Customer Detail :");
        getContentPane().add(Extra_Lab_Sec_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 190, 60));

        Pay_BG_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_Pictures/pay123.png"))); // NOI18N
        getContentPane().add(Pay_BG_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, -10, 880, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Debit_Button_PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Debit_Button_PayActionPerformed
        // TODO add your handling code here:
        if(Debit_Button_Pay.isSelected()){
            UPI_button_Pay.setSelected(false);
            UPI_Number_Pay.setText("");
            UPI_Number_Pay.setEditable(false);
            CVV_Pay.setEditable(true);
            Card_Holder_Name.setEditable(true);
            Card_Number_.setEditable(true);
            Expired_Date_Pay.setEditable(true);
        }
    }//GEN-LAST:event_Debit_Button_PayActionPerformed

    private void UPI_button_PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPI_button_PayActionPerformed
        // TODO add your handling code here:
        if(UPI_button_Pay.isSelected()){
            Debit_Button_Pay.setSelected(false);
            CVV_Pay.setText("");
            Card_Holder_Name.setText("");
            Card_Number_.setText("");
            Expired_Date_Pay.setText("");
            CVV_Pay.setEditable(false);
            Card_Holder_Name.setEditable(false);
            Card_Number_.setEditable(false);
            Expired_Date_Pay.setEditable(false);
            UPI_Number_Pay.setEditable(true);
        }
    }//GEN-LAST:event_UPI_button_PayActionPerformed

    private void Card_Number_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card_Number_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Card_Number_ActionPerformed

    private void CVV_PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CVV_PayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CVV_PayActionPerformed

    private void Cancel_Button_PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_Button_PayActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_Cancel_Button_PayActionPerformed

    private void Proceed_Button_PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proceed_Button_PayActionPerformed
        // TODO add your handling code here:
        if(UPI_button_Pay.isSelected()){
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking_system","root","");
            String upi="insert into upi_payment_method values(?,?)";
            PreparedStatement upi_now=con.prepareStatement(upi);
            upi_now.setString(1,Name_Lab_Sec_4.getText());
            upi_now.setString(2,UPI_Number_Pay.getText());
            upi_now.executeUpdate();
            JOptionPane.showMessageDialog(null,"Payment Done Successfully !");
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
        else if(Debit_Button_Pay.isSelected()){
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking_system","root","");
            String car="insert into card_payment_method values(?,?,?,?,?)";
            PreparedStatement car_now=con.prepareStatement(car);
            car_now.setString(1,Card_Number_.getText());
            car_now.setString(2,Card_Holder_Name.getText());
            car_now.setString(3,CVV_Pay.getText());
            car_now.setString(4,Expired_Date_Pay.getText());
            car_now.setString(5,Name_Lab_Sec_4.getText());
            car_now.executeUpdate();
            JOptionPane.showMessageDialog(null,"Payment Done Successfully !");
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking_system","root","");
            String cf="insert into confirm_ticket values(?,?,?,?,?,?)";
            PreparedStatement cf_now=con.prepareStatement(cf);
            cf_now.setString(1,Name_Lab_Sec_4.getText());
            cf_now.setString(2,Phone_Lab_Sec_4.getText());
            cf_now.setString(3,result_from.getText());
            cf_now.setString(4,result_arrival.getText());
            cf_now.setString(5,result_ac.getText());
            cf_now.setString(6,result_seat.getText());
            cf_now.executeUpdate();
            JOptionPane.showMessageDialog(null,"Payment Done Successfully !");
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        dispose();
        String Name=Name_Lab_Sec_4.getText();
        String Phone=Phone_Lab_Sec_4.getText();
        String from=result_from.getText();
        String to=result_arrival.getText();
        String type=result_ac.getText();
        String seats=result_seat.getText();
        new lastpage(Name,Phone,from,to,type,seats).setVisible(true);
        setVisible(false);
        
//        lastpage t=new lastpage();
//        t.setVisible(true);
    }//GEN-LAST:event_Proceed_Button_PayActionPerformed

    private void Reset_Detail_PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_Detail_PayActionPerformed
        // TODO add your handling code here:
        UPI_Number_Pay.setText("");
        CVV_Pay.setText("");
        Card_Holder_Name.setText("");
        Card_Number_.setText("");
    }//GEN-LAST:event_Reset_Detail_PayActionPerformed

    private void UPI_Number_PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPI_Number_PayActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_UPI_Number_PayActionPerformed

    private void UPI_Number_PayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UPI_Number_PayKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[0-9]{10}$";//Condition
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(UPI_Number_Pay.getText());//Input Text Field
        if(!match.matches()){
            UPI_Number_Pay.setBackground(Color.red);//Lable for warning
        }
        else
        {
            UPI_Number_Pay.setBackground(null);
        }
        
        
    }//GEN-LAST:event_UPI_Number_PayKeyReleased

    private void Card_Number_KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Card_Number_KeyReleased
        // TODO add your handling code here:
        String PATTERN="^[0-9]{16}$";//Condition
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(Card_Number_.getText());//Input Text Field
        if(!match.matches()){
            Card_Number_.setBackground(Color.red);//Lable for warning
        }
        else
        {
            Card_Number_.setBackground(null);
        }
        
    }//GEN-LAST:event_Card_Number_KeyReleased

    private void CVV_PayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CVV_PayKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[0-9]{16}$";//Condition
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(CVV_Pay.getText());//Input Text Field
        if(!match.matches()){
            CVV_Pay.setBackground(Color.red);//Lable for warning
        }
        else
        {
            CVV_Pay.setBackground(null);
        }
    }//GEN-LAST:event_CVV_PayKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(paynew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paynew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paynew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paynew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paynew().setVisible(true);
            }
        });
    }   //****S*****

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount_Lab_;
    private javax.swing.JTextField CVV_Pay;
    private javax.swing.JButton Cancel_Button_Pay;
    private javax.swing.JTextField Card_Holder_Name;
    private javax.swing.JTextField Card_Number_;
    private javax.swing.JRadioButton Debit_Button_Pay;
    private javax.swing.JTextField Expired_Date_Pay;
    public javax.swing.JLabel Extra_Lab_Sec_4;
    public javax.swing.JLabel Name_Lab_Sec_4;
    private javax.swing.JLabel Pay_BG_1;
    private javax.swing.JLabel Pay_BG_Lab3;
    private javax.swing.JLabel Pay_New_Head;
    public javax.swing.JLabel Phone_Lab_Sec_4;
    private javax.swing.JLabel Private_Amount;
    private javax.swing.JButton Proceed_Button_Pay;
    private javax.swing.JLabel Public_Amount;
    private javax.swing.JButton Reset_Detail_Pay;
    private javax.swing.JTextField UPI_Number_Pay;
    private javax.swing.JRadioButton UPI_button_Pay;
    private javax.swing.JLabel result_ac;
    private javax.swing.JLabel result_arrival;
    private javax.swing.JLabel result_from;
    private javax.swing.JLabel result_seat;
    // End of variables declaration//GEN-END:variables
}
