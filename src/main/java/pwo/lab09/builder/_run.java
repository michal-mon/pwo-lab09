package pwo.lab09.builder;

import java.util.Scanner;

public class _run {

    public static void main(String [] args){

        TxtPic1 txtPic = new TxtPic1('.','*',20,"txtpic1.txt");
        txtPic.save();

        TxtPic2 txtPic2 = new TxtPic2();

        txtPic2
        .setBackground('_')
        .setForeground('*')
        .setSize(20)
        .setFileName("txtpic2.txt")
        .createTxtPic()
        .save();
        
        TxtPic3 txtPic3 = new TxtPic3();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj znak tła: ");
        txtPic3.setBackground(in.next().charAt(0));
        System.out.println("Podaj znak obrazka: ");
        txtPic3.setForeground(in.next().charAt(0));
        System.out.println("Podaj rozmiar obrazka (wysokość): ");
        txtPic3.setSize(in.nextInt());
        System.out.println("Podaj nazwę pliku wynikowego: ");
        txtPic3.setFileName(in.next().toString()).createTxtPic().save();
    }
}