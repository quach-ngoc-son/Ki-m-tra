package quachngocson_2021050572;

import java.util.Scanner;

public class book {
private String title;
private int price,VAT;
public void getlmportVAT(){
VAT=(price*5)/100; 
}
void setbook(){
Scanner sc = new Scanner(System.in);
System.out.println("Nhap ten sach: ");
        title = sc.nextLine();
System.out.println("Nhap gia bia: ");
        price = sc.nextInt();
}  
void getbook(){
    System.out.println("Ten sach:"+title+"\nGia bia"+price+"\nthue VAT"+VAT);
}
}
