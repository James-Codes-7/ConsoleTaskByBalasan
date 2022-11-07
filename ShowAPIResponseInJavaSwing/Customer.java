package hitapi;

public class Customer {

    private int id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;

    public String toString()
    {
        return "Id: "+id+"\nEmail: "+email+"\nFirst name: "+first_name+"\nlast name: "+last_name+"\nAvatar: "+avatar;
    }
    public void display()
    {
        System.out.println("ID:                    "+id);
        System.out.println("Email:                 "+email);
        System.out.println("First Name:            "+first_name);
        System.out.println("Last Name:             "+last_name);
        System.out.println("Avatar:                "+avatar);

      //  return "\nId: "+id+"\nEmail: "+email+"\nFirst name: "+first_name+"\nlast name: "+last_name+"\nAvatar: "+avatar+"\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
