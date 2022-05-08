package contact;

import contact.model.Contact;
import contact.model.Result;
import contact.model.subClasses.ContactMenu;
import contact.model.subClasses.SelectedContact;
import contact.service.ServiceContactImplement;

import java.util.Scanner;

public class ContactMain {
    public static void main(String[] args) {
        ServiceContactImplement serviceContact = new ServiceContactImplement();
        Result result = new Result();
        Scanner scanner = new Scanner(System.in);
        while (true){
            ContactMenu.showMenu();
            Contact selectedContact;
            switch (scanner.nextInt()){
                case 0 : {
                    return;
                }
                case 1 : {
                    selectedContact = SelectedContact.createNewContact();
                    serviceContact.createContact(selectedContact);
                    break;
                }
                case 2 : {
                    serviceContact.changeContact();
                    break;
                }
                case 3 : {
                    serviceContact.searchContact();
                    break;
                }
                case 4 : {
                    serviceContact.deleteContact();
                    break;
                }
                default: {
                    System.out.println("Bunday raqam yo'q");
                    break;
                }
            }
        }

    }
}
