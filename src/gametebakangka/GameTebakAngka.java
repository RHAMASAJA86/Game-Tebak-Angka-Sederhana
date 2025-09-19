package gametebakangka;
import javax.swing.JOptionPane;
import java.util.Random;

public class GameTebakAngka {
    public static void main(String[] args) {
        // Buat angka random 1-100
        Random pp = new Random();
        int angkaBenar = pp.nextInt(100) + 1;
        int tebakan;
        int percobaan = 0;
        boolean bebnar = false;
        
        JOptionPane.showMessageDialog(null,
            "Selamat datang di Game Tebak Angka!\n" +
            "Saya sudah memilih angka 1-100.\n" +
            "Coba tebak ya...");
           
    }    
}