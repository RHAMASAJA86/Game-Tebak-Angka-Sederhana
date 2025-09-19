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
        boolean benar = false;
        
        JOptionPane.showMessageDialog(null,
            "Selamat datang di Game Tebak Angka!\n" +
            "Saya sudah memilih angka 1-100.\n" +
            "Coba tebak ya...");
        
        // Looping sampai benar
        while (!benar) {
            // Input angka dari user
            String input = JOptionPane.showInputDialog("Masukkan tebakanmu (1–100):");

            // Jika user tekan Cancel atau kosong, keluar game
            if (input == null || input.equals("")) {
                JOptionPane.showMessageDialog(null, "Game dibatalkan.");
                break;
            }

            try {
                tebakan = Integer.parseInt(input); // ubah ke integer
                percobaan++;

                if (tebakan == angkaBenar) {
                    JOptionPane.showMessageDialog(null, 
                        "🎉 Selamat! Kamu benar!\n" +
                        "Angkanya adalah: " + angkaBenar + 
                        "\nJumlah percobaan: " + percobaan);
                    benar = true;
                } else if (tebakan < angkaBenar) {
                    JOptionPane.showMessageDialog(null, "Terlalu kecil! Coba lagi.");
                } else {
                    JOptionPane.showMessageDialog(null, "Terlalu besar! Coba lagi.");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input harus berupa angka!");
            }
        }       
    }    
}