import java.util.Scanner;

public class KacTanesiAsal {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("Hangi sayıya kadar asal sayılar belirlenecek");
        int sinirSayi= giris.nextInt();
        int x=0;
        for (int i=2; i<=sinirSayi; i++){
            if (asalKontrol(i)==true){
                System.out.print(i+" ");
                x++;
            }
        }
        System.out.println("\n"+sinirSayi+" sayısına kadar toplam asal sayı sayısı "+x);


    }
    public static boolean asalKontrol(int sayi){
        boolean asalMi=true;
        for (int i=2 ; i<=sayi/2 ; i++){
            if (sayi % i == 0){
                asalMi=false;
            }
        }
        return asalMi;
    }

}
