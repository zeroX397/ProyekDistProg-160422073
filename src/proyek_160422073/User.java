/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyek_160422073;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author chris
 */
public class User {

    //Setter methods
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setMemberSince(Date memberSince) {
        this.memberSince = memberSince;
    }

    private String fullname;
    private String username;
    private String password;
    private String email;
    private Date dob;
    private Date memberSince;

    // Constructor
    public User(String fullname, String username, String password, String email, Date dob) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.dob = dob;
        this.memberSince = new Date(); // Set the memberSince date to the current date
    }

    // Getter methods
    public String getFullname() {
        return fullname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Date getDob() {
        return dob;
    }

    public Date getMemberSince() {
        return memberSince;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input user data
        System.out.println("Enter User Details:");
        System.out.print("Full Name: ");
        String fullname = scanner.nextLine();
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Date of Birth (YYYY-MM-DD): ");
        String dobString = scanner.nextLine();

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dob = dateFormat.parse(dobString);

            // Create User object
            User user = new User(fullname, username, password, email, dob);

            // Display user data
            System.out.println("\nUser Information:");
            System.out.println("Full Name: " + user.getFullname());
            System.out.println("Username: " + user.getUsername());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Date of Birth: " + dateFormat.format(user.getDob()));
            System.out.println("Member Since: " + dateFormat.format(user.getMemberSince()));
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
        } finally {
            scanner.close();
        }

    }
    
}
