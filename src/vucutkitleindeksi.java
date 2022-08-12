import java.util.Scanner;
public class vucutkitleindeksi {
    public static void main(String[] args) {
        int kg;
        double boy,index ;
Scanner input = new Scanner(System.in);
        System.out.println("Metre Cinsinden Boy bilginizi giriniz.");
boy =input.nextDouble();
System.out.println("Lütfen Kilonuzu giriniz");
    kg = input.nextInt();
index =kg / (boy*boy);
System.out.println(index);
    }
}
