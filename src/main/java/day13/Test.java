package day13;

import java.util.Scanner;

public class Test {

    //Kullanici A Ayse ; kullanici B Burak ismini data olarak girerse cikti ne olur?
    String studentName;
    String year="2020";
    String studentId ;
    static int counter=1000;
    public Test(){
        Scanner input=new Scanner(System.in);
        System.out.println(" Isminizi giriniz ");
        studentName=input.next();
        setStudentId();
    }
    private void setStudentId() {
        counter++;
        this.studentId=year+""+counter;
    }
    public static void main(String[] args) {
        Test student1=new Test();
        System.out.println(student1.studentName+student1.studentId);//A Ayse20201001
        Test student2=new Test();
        System.out.println(student2.studentName+student2.studentId);//B Burak20201002
    }

}
