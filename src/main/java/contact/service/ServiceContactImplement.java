package contact.service;

import contact.model.Contact;
import contact.model.Result;
import contact.model.subClasses.SelectedContact;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServiceContactImplement implements ContactService{

    public ArrayList<Contact> contactList = new ArrayList<>();
    @Override
    public Result createContact(Contact contact) {
        Result result = new Result();
        if(checkContact(contact)){
            contactList.add(contact);
            result.setSuccess(true);
            result.setMessage("Muvoffaqiyatli.");
        }else {
            result.setMessage("Xato");
            result.setSuccess(false);
        }
        return result;
    }
    private boolean checkContact(Contact contact){
        for (int i = 0; i < contactList.size(); i++) {
            if(contactList.get(i).equals(contact)){
                return false;
            }
        }
        return true;
    }

    @Override
    public Result changeContact() {
        Result result = new Result();
        Scanner scanner = new Scanner(System.in);
        if(contactList.size() != 0){
            for (int i = 0; i < contactList.size(); i++) {
                System.out.println(i + " : " + contactList.get(i));
            }
            System.out.println("Qaysi Kontaktni o'zgartirmoqchisiz: ");
            int number = scanner.nextInt();
            Contact obj;
            obj = SelectedContact.createNewContact();
            contactList.remove(number);
            contactList.add(number, obj);
            for (int i = 0; i < contactList.size(); i++) {
                System.out.println(i + " : " + contactList.get(i));
            }
            result.setSuccess(true);
            result.setMessage("Muvoffaqiyatli");
        }else{
            System.out.println("Kontakt qo'sh");
            result.setMessage("Kontakt yo'q");
            result.setSuccess(false);

        }
        return result;
    }

    @Override
    public Result searchContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Izlash: ");
        String text = scanner.nextLine();
        Result result = new Result();
        for (int i = 0; i < contactList.size(); i++) {
            if(contactList.get(i).getName().equals(text) || contactList.get(i).getSurName().equals(text) || contactList.get(i).getCompany().equals(text) ||
                    contactList.get(i).getPhoneNumber().equals(text) || contactList.get(i).getAddreess().equals(text) || contactList.get(i).getBirthday().equals(text) ||
                    contactList.get(i).getEmail().equals(text)){
                System.out.println(contactList.get(i));
                result.setSuccess(true);
                result.setMessage("Muvoffaqiyatli");
            }else {
                result.setMessage("Yo'q");
                result.setSuccess(false);
                System.out.println("Topilmadi");
            }
        }
        return result;
    }

    @Override
    public Result deleteContact() {
        Result result = new Result();
        Scanner scanner = new Scanner(System.in);
        if(contactList.size() != 0) {
            for (int i = 0; i < contactList.size(); i++) {
                System.out.println(i + " : " + contactList.get(i));
            }
            System.out.println("O'chirmoqchi bo'lgan kontakt raqami: ");
            int number = scanner.nextInt();
            contactList.remove(number);
            for (int i = 0; i < contactList.size(); i++) {
                System.out.println(i + " : " + contactList.get(i));
            }
            result.setSuccess(true);
            result.setMessage("Muvoffaqiyatli");
        }else {
            System.out.println("Baraka top Kontakt qo'sh.");
            result.setMessage("Kontakt yo'q");
            result.setSuccess(false);
        }
        return result;
    }



}
