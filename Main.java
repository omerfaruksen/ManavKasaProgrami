import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Değişkenleri tanımladık
        int armut, elma, domates, muz, patlican;
        double aKg=2.14, eKg=3.67, dKg=1.11, mKg=0.95, pKg=5.00, total;
        //Kullanıcıdan verileri aldık
        Scanner input=new Scanner(System.in);
        System.out.print("Armut kaç kg?: ");
        armut=input.nextInt();
        System.out.print("Elma kaç kg?: ");
        elma= input.nextInt();
        System.out.print("Domates kaç kg?: ");
        domates= input.nextInt();
        System.out.print("Muz kaç kg?: ");
        muz= input.nextInt();
        System.out.print("Patlıcan kaç kg?: ");
        patlican= input.nextInt();
        //Toplam işlemini yaptık
        total=(armut*aKg+elma*eKg+domates*dKg+muz*mKg+patlican*pKg);
        System.out.print("Toplam Tutar: " +total +"TL");
    }
}
