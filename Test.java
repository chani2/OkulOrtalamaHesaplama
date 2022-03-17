import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        int mat, fizik,turkce,kimya,muzik;
        double total = 0;
        int count = 0;
        double ortalama = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Mastematik notunuz");
        mat = input.nextInt();
        if ((mat>=0) && (mat<=100)){
            count++;
            total += mat;
        }

        System.out.print("Fizik notunuz");
        fizik = input.nextInt();
        if ((fizik>=0) && (fizik<=100)){
            count++;
            total += fizik;
        }

        System.out.print("Turkce notunuz");
        turkce = input.nextInt();
        if ((turkce>=0) && (turkce<=100)){
            count++;
            total += turkce;
        }

        System.out.print("Kimya notunuz");
        kimya = input.nextInt();
        if ((kimya>=0) && (kimya<=100)){
            count++;
            total += kimya;
        }

        System.out.print("Muzik notunuz");
        muzik = input.nextInt();
        if ((muzik>=0) && (muzik<=100)){
            count++;
            total += muzik;
        }
        ortalama = total / count;
        if (ortalama>=55){
            System.out.println("Tebrikler sinifi gectiniz...");
        }else{
            System.out.println("Ortalamaniz dusuk. Seneye tekrar deneyiniz..");
        }
        System.out.println("Ortalama notu:" + ortalama);












































    }
}
