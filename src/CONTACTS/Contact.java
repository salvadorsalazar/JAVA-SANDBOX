package CONTACTS;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Contact {
    public String name;
    public String number;
    Path contactsPath = Paths.get("/Users/salvadorsalazar/IdeaProjects/JAVA PRGRAMSEXAMPLES/src/CONTACTS", "contacts.txt");

    Scanner scanner = new Scanner(System.in);

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    //--------------Show all contacts
    public List<String> showContacts() {
        List<String> currentList = new ArrayList<>();
        try {
            currentList = Files.readAllLines(contactsPath);
        } catch (IOException stupid) {
            System.out.println("Catching This Nonsense");
        }
        System.out.println("Name | Phone number\n-------------------");

        for (String l : currentList) {
            System.out.println(l);

        }
        return currentList;
    }



    //-------------add contacts
    public void addContact() throws IOException {
        System.out.println("Enter a Name and Number to ADD to Contacts");
        String name = scanner.nextLine();
//          System.out.println("enter number");
//          String number = scanner.nextLine();
        Files.write(contactsPath,Arrays.asList(name), StandardOpenOption.APPEND);

      }


      //-----------Edit/search contacts
    public void editContact() throws IOException{
        List <String> currentContacts = Files.readAllLines(contactsPath);
        List<String> newList = new ArrayList<>();
        showContacts();
        System.out.println("Enter Contact to search: ");
        String contact = scanner.nextLine();
            for(String contactInfo:currentContacts){
                if(contactInfo.contains(contact)){
                    System.out.println("Update Name and Number");
                    String name = scanner.nextLine();
                    newList.add(name );
                    System.out.println("You Have Edited : " + name+"'s Contact Info.");
               // continue;

                }else{
                newList.add(contactInfo);
            }
        }
        Files.write(contactsPath,newList);

    }



    //------------delete contact
    public void deleteContact() throws IOException{
        List <String> currentContacts = Files.readAllLines(contactsPath);
        List<String> newList = new ArrayList<>();
        showContacts();
        System.out.println("Type name of contact to DELETE: ");
        String contact = scanner.nextLine();
            for(String contactInfo:currentContacts){
                if(contactInfo.contains(contact)){
//                System.out.println("Entere contact name DELETE");
//                String name = scanner.nextLine();
                    newList.remove(contactInfo );
                    System.out.println("you have DELETED : " + contact +" from Contacts.");
                // continue;

                }else{
                newList.add(contactInfo);
            }
        }
        Files.write(contactsPath,newList);
    }


}


//    1. Load all of the contacts by calling a method that returns a List of Contact objects.
//    2.    Call a method that shows the user the main menu and returns their choice of action.




//
//
///////draft 1.--------------
//package CONTACTS;
//
//        import java.io.IOException;
//        import java.nio.file.Files;
//        import java.nio.file.Path;
//        import java.nio.file.Paths;
//        import java.nio.file.StandardOpenOption;
//        import java.util.ArrayList;
//        import java.util.Arrays;
//        import java.util.List;
//        import java.util.Scanner;
//
//public class Contact {
//    public String name;
//    public String number;
//    Path contactsPath = Paths.get("//Users/salvadorsalazar/IdeaProjects/JAVA PRGRAMSEXAMPLES/src/CONTACTS/", "contacts.txt");
//
//    Scanner scanner = new Scanner(System.in);
//
//    public Contact(String name, String number) {
//        this.name = name;
//        this.number = number;
//    }
//
//    public Contact() {
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getNumber() {
//        return number;
//    }
//
//    public void setNumber(String number) {
//        this.number = number;
//    }
//
//
//
//
//
////
////    public void loadContacts() throws IOException {
////        List<String> contacts = Files.readAllLines(contactsPath);
////        for (String contact : contacts) {
////            System.out.println(contact);
////        }
////    }
//
//
//
//    public List<String> showContacts() {
//        List<String> currentList = new ArrayList<>();
//        try {
//            currentList = Files.readAllLines(contactsPath);
//        } catch (IOException stupid) {
//            System.out.println("Catching This Nonsense");
//        }
//        for (String l : currentList) {
//            System.out.println(l);
//
//        }
//
//        return currentList;
//    }
//
//
//
//    //add contacts
//    public void addContact() throws IOException {
//        System.out.println("enter a name and number");
//        String name = scanner.nextLine();
////          System.out.println("enter number");
////          String number = scanner.nextLine();
////          Files.write(contactsPath,Arrays.asList(name + "" + number), StandardOpenOption.APPEND);
//        Files.write(contactsPath,Arrays.asList(name), StandardOpenOption.APPEND);
////          System.out.println("added name : "+name+" and number : "+number);
////
//
//
////          List<String> contactsList = Arrays.asList("name1", "210-708-5814");
////          try {
////              Files.write(contactsPath, contactsList);
////          } catch (IOException xd) {
////              System.out.println("It requires this useless crap");
////          `1`
//    }
//
//}




























//package CONTACTS;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Contact {
//    private String info;
//
//    public Contact(String info){
//        this.info = info;
//    }
//
//    public String getInfo(){
//        return info;
//    }
//
//    public void setInfo(String info){
//        this.info = info;
//    }
//
//    // Takes in a list of Contact objects and returns a list of info strings
//    // (will use this to write the file after making changes)
//    public static List<String> contactsToInfoStrings(List<Contact> contacts) {
//        List<String> info = new ArrayList<>();
//        for (Contact object : contacts) {
//            info.add(object.getInfo());
//        }
//        return info;
//    }
//
//    // Takes in a list of info strings and returns a list of Contact objects
//    public static List<Contact> infoStringsToContacts(List<String> info){
//        List<Contact> contacts = new ArrayList<>();
//        for(String line : info) {
//            contacts.add(new Contact(line));
//        }
//        return contacts;
//    }
//
//}
//
////
//////public class Contact implements java.io.Serializable{
////class Contact implements java.io.Serializable{
////    private String name;
////    private String number;
////    private String Name;
////    private String Phone;
////
////    public Contact(String name, String number) {
////        this.name = name;
////        this.number = number;
////    }
////
////    public String getName() {
////        return name;
////    }
////
////    public void setName(String name) {
////        this.name = name;
////    }
////
////    public String getNumber() {
////        return number;
////    }
////
////    public void setNumber(String number) {
////        this.number = number;
////    }
////
////    public void printInfo() {
////        System.out.println("Name:" + Name + ", Phone:" + Phone);
////    }
////
////    public void printContact() {
////    }
////}
////
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////public class Contact {
////    private String name;
////    private String number;
////
////    public Contact (String inputName, String inputNumber) {
////        this.name = inputName;
////        this.number = inputNumber;
////    }
////
////    public void setName(String inputName) {
////        this.name = inputName;
////    }
////
////    public void setNumber(String inputNumber) {
////        this.number = inputNumber;
////    }
////
////    public String getName() {
////        return this.name;
////    }
////
////    public String getNumber() {
////        return this.number;
////    }
////
////    public void printContact() {
////        System.out.printf("%-20s |*| %-20s\n", this.name, "        "+ this.number + "      ");
////    }
////
////}