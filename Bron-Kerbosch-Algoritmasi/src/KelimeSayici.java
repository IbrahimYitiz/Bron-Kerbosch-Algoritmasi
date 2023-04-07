import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KelimeSayici {

    public static void main(String[] args) {
        // Dosya yolu belirleme , Dosya yolunu kendinize göre güncelleyiniz..
        File dosya = new File("C:\\Users\\EXCALIBUR\\Desktop\\alice_in_wonderland.txt");

        // Aranacak kelimeleri tanımlama
        String[] aranacakKelimeler = {"upon", "sigh", "Dormouse", "jury-box", "swim"};

        // Her kelime için dosyada kaç kez geçtiğini sayma
        for (String kelime : aranacakKelimeler) {
            int kelimeSayisi = 0;

            try {
                Scanner scanner = new Scanner(dosya);
                while (scanner.hasNextLine()) {
                    String satir = scanner.nextLine().toLowerCase();
                    kelimeSayisi += kelimeSay(satir, kelime);
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            // Sonuçları ekrana yazdırma
            System.out.println(kelime + " kelimesi dosyada " + kelimeSayisi + " kez geçiyor.");
        }
    }

    // Verilen satırda kelimenin kaç kez geçtiğini sayma
    public static int kelimeSay(String satir, String kelime) {
        int kelimeSayisi = 0;
        int kelimeUzunlugu = kelime.length();

        for (int i = 0; i <= satir.length() - kelimeUzunlugu; i++) {
            if (satir.substring(i, i + kelimeUzunlugu).equals(kelime)) {
                kelimeSayisi++;
            }
        }

        return kelimeSayisi;
    }
}
