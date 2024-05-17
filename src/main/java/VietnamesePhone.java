import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VietnamesePhone extends Phone{
    private List<Contact> contactList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    @Override
    void insertContact(String name, String phone) {
        Contact contact = new Contact(name, phone);
        contactList.removeIf(contact -> contact.getName().equals(name));

    }

    @Override
    void removeContact(String name) {


    }

    @Override
    void updateContact(String name, String newPhone) {

    }

    @Override
    void searchContact(String name) {

    }
}
