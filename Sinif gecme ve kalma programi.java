package baslangic;
import java.util.Scanner;
public class startingfive {

	public static void main(String[] args) {
   

   int mat;
   int turkce;
   int fizik;
   int tarih;
   int muzik;
   int kimya;
	Scanner input=new Scanner(System.in);
    muzik=input.nextInt();	
   kimya=input.nextInt();
    mat=input.nextInt();
    turkce=input.nextInt();
    fizik=input.nextInt();
    tarih=input.nextInt();
    float ortalama;
    ortalama=(mat+muzik+tarih+kimya+turkce+fizik)/6;
    System.out.println((ortalama)>=60 ? "gecti" : "kaldi");
	}
	}
	
	


