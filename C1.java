/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class Book {
    private String title;
    private double price;
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getImportTax(){
        double thue = this.price * 10 / 100;
        return thue;
    }
    public void setBook(){
        Scanner nhap= new Scanner(System.in);
        System.out.println("Nhap ten sach: ");
        title = nhap.nextLine();
        System.out.println("Nhap gia bia: ");
        price = nhap.nextDouble();
    }
    public void getBook(){
        System.out.println("Ten sach: " + title);
        System.out.println("Gia bia: "+ price);
        System.out.println("Thue nhap khau:" + getImportTax());
    }
     public static void main(String[] args) {
        Book a= new Book();
        Scanner nhap= new Scanner(System.in);
        System.out.println("Nhập vào số sách: ");
        int n = nhap.nextInt();
        for(int i=0; i<n; i++){
            a.setBook();
        }
        for(int i=0; i<n; i++){
            a.getBook();
        }
    }
}
