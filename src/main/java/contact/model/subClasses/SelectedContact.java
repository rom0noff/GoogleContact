package contact.model.subClasses;

import contact.model.Contact;

import java.util.Scanner;

public class SelectedContact {
    public static Contact createNewContact(){

        Scanner scanner = new Scanner(System.in);
        Contact newContact = new Contact();

        System.out.println("==========INFO==========");

        System.out.println("Ism: ");
        newContact.setName(scanner.nextLine());
        System.out.println("Familya: ");
        newContact.setSurName(scanner.nextLine());
        System.out.println("Company");
        newContact.setCompany(scanner.nextLine());
        System.out.println("Elektron pochta: ");
        newContact.setEmail(scanner.nextLine());
        System.out.println("Telefon raqam: ");
        newContact.setPhoneNumber(scanner.nextLine());
        System.out.println("Tug'ilgan sana: ");
        newContact.setBirthday(scanner.nextLine());
        System.out.println("Yashash manzil: ");
        newContact.setAddreess(scanner.nextLine());
        return newContact;
    }
}
