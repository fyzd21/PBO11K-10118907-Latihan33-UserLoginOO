/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan33.userloginoo;

/**
 *
 * @author programmer
 */
public class User {
    private String username = "RizkiAdam", password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUsername, String parPassword) {
        if(parUsername.equals(username) && parPassword.equals(password)) {
            return true;
        }
        
        return false;
    }
    
    private void hasilLogin(boolean status, String parUsername) {
        System.out.println();
        if(statusAkun == true) {
            System.out.println("***HALO "+parUsername.toUpperCase()+"***");
            System.out.println("Selamat datang di aplikasi ini");
        } else {
            System.out.println("Oops, username atau password Anda salah");
        }
    }
    
    public void pengecekanLogin(String parUsername, String parPassword) {
        statusAkun = cekAkun(parUsername, parPassword);
        hasilLogin(statusAkun, parUsername);
    }
}
