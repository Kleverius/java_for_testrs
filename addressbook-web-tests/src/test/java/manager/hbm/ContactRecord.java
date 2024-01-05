package manager.hbm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "addressbook")
public class ContactRecord {
    @Id
    public int id;
    public String firstname;
    public String middlename;
    public String lastname;
    public String nickname;
    public String company;
    public String address;
    public String home;
    public String email;
    public String title = "";
    public String mobile = "";
    public String work = "";
    public String fax = "";
    public String email2 = "";
    public String email3 = "";
    public String homepage = "";

    public ContactRecord() {
    }

    public ContactRecord(int id, String firstname, String lastname, String address, String home, String email, String middlename, String nickname, String company) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.home = home;
        this.email = email;
        this.middlename = middlename;
        this.nickname = nickname;
        this.company = company;
    }
}