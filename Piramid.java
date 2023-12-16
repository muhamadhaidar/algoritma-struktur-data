
import javax.swing.JOptionPane;

public class Piramid {
    static int b;
    public static void main(String[] args) {
        b = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Baris: "));
        cetakPiramid(0);
    }
    static void cetakPiramid (int i) {
        cetakSpasi(0, i);
        cetakBintang(b, i);
        System.out.println();
        i++;
        if (i < b)
        {
            cetakPiramid(i);
        }
    }
    static void cetakSpasi (int j, int i) {
        if (j < b-i-1)
        {
            System.out.print(" ");
            cetakSpasi (j+1, i);
        }
    }
    static void cetakBintang (int k, int i) {
        if (k> b-i-1)
        {
            System.out.print("* ");
            cetakBintang(k-1, i);
        }
    }
}