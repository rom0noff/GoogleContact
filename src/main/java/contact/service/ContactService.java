package contact.service;

import contact.model.Contact;
import contact.model.Result;

public interface ContactService {

    Result createContact(Contact contact);
    Result changeContact();
    void searchContact();
    Result deleteContact();
}
