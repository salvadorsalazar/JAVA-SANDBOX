//package Sandbox;
//
//import java.io.*;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class CodeTest extends CodeExamples {
//
//    public static void main(String[] args) {
////        swapMethod1(4,5);
////        swapMethod2(10,12);
////
////        System.out.println("");
////        findCelsius(98.6);
////        findFarenheit(90.0);
////
////        System.out.println("");
////        int num1 = 60;
////        int num2 = 24;
////        int gcd = findGCD(num1,num2);
////        int lcm = findLCM(num1,num2,gcd);
////        System.out.println("gcd : "+gcd);
////        System.out.println("lcdm : "+lcm);
////
////        System.out.println("");
////        basicMath(2,4);
////
////        System.out.println("");
//
////do while eample-------------------------------------------------------
////        String answer ;
////
////        do {
////            Scanner scanner = new Scanner(System.in);
////            System.out.println("enter the price: ");
////            double price = scanner.nextDouble();
////            System.out.println("enter the quantity");
////            double qty = scanner.nextDouble();
////            double total = price * qty;
////            System.out.println("the total is :" + total);
////            System.out.println("Do you want to enter calculate another total? Yes or No");
////            answer = scanner.next();
////        }while(answer.equalsIgnoreCase("Yes"||"y"));
////        String quit ="";
////        do{
////
////
////
////        }while(!quit.equals("q"));
//
//
//////exception practice
////        try {
////            Scanner scanner = new Scanner(System.in);
////            System.out.println("wnter a whole number to divide: ");
////            int x = scanner.nextInt();
////
////            System.out.println("enter a whole number to divide by");
////            int y = scanner.nextInt();
////
////            int z = x / y;
////            System.out.println("result " + z);
////        }catch(ArithmeticException e){
////            System.out.println("error - ypu cant divide by zero");
////
////        }catch(InputMismatchException e ){
////            System.out.println("enter a number not a letter");
////        }catch(Exception e){
////            System.out.println("This is a generic exceptio :something went wrong");
////        }
////        finally {
////            System.out.println("This will always print : program ended");
////        }
//
////JAVA I/O FILE READ AND WIRTE PRACTIE AND EXAMPLE
//        ///////////////////////////////
//
////File file = new File("/Users/salvadorsalazar/IdeaProjects/JAVA PRGRAMSEXAMPLES/src/testFile.txt");
////File file = new File("src/Sandbox/testFile.txt");
//
////if(file.exists()){
////    System.out.println("that file exists");
////    System.out.println(file.getPath());
////    System.out.println(file.getAbsolutePath());
////    System.out.println(file.isFile());
////}else{
////    System.out.println("file does not exist");
////}
//
////CREATE/WRITE TO A FILE OR READ
//
////    try {
////        FileWriter writer = new FileWriter("poem.txt");//creates file
////    writer.write("roses are red \nViloets are asdfkj \nsdfasdfsad");//write to file on separte lines
////    writer.append("\n using writer.append)_ method to add to end of file");//methos to add to end of file
////    writer.close();//closes file
////
////        }catch(IOException e) {
////            e.printStackTrace();
////    }
//
////FILE READER
//
//        try {
//            FileReader reader =  new FileReader("poem.txt");
//            int data = reader.readAllLines();
//
//            while(data !=1){
//                System.out.println((char) data);
//                data = reader.read();
//            }
//            reader.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//}
