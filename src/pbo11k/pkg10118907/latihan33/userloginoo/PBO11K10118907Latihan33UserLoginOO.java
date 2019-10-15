/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan33.userloginoo;

import java.util.Scanner;

/**
 *
 * @author programmer
 */
public class PBO11K10118907Latihan33UserLoginOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usName, passWord;
        
        System.out.print("Masukkan Username : ");
        Scanner s = new Scanner(System.in);
        usName = s.next();
        
        System.out.print("Masukkan Password : ");
        Scanner s2 = new Scanner(System.in);
        passWord = s2.next();
        
        User u = new User();
        u.pengecekanLogin(usName, passWord);
        
    }
    
}
