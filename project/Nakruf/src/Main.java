import java.util.Scanner;

import javax.net.ssl.SSLHandshakeException;
import javax.security.sasl.Sasl;
import javax.xml.transform.Source;
public class Main {
    public static void main(String[] args) {

        double KM ;
        double perKm = 2.20 , total = 10  ;

        Scanner input = new Scanner(System.in);
        System.out.print("mesafeyi km cinsinden giriniz  : ");

        KM = input.nextDouble();

        total += (KM * perKm) ;
        System.out.println();
    main(SSLHandshakeException);

        System.out.println("toplam tutar  :" + total);





    }
}