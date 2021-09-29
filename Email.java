import java.util.Scanner;

public class Email {
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private String email;
  private int mailboxCapacity = 500;
  private String alternateEmail;
  private String compSuffix = "joshCorp.com";

  public Email(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;

    this.department = setDepartment();
    
    this.password = generatePassword(8);
    System.out.println("Password set as: " + this.password);

    this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + "." + this.compSuffix;
  }

  private String setDepartment() {
    System.out.println("Enter the department:");
    System.out.println("1 - Sales");
    System.out.println("2 - Development");
    System.out.println("3 - Accounting");
    System.out.println("0 - None");

    Scanner in = new Scanner(System.in);
    int depChoice = in.nextInt();
    if (depChoice == 1) {
      return "sales";
    } else if (depChoice == 2) {
      return "dev";
    } else if (depChoice == 3) {
      return "acct";
    } else {
      return "";
    }
  }

  public void setMailboxCapacity(int capacity) {
    this.mailboxCapacity = capacity;
  }

  public void setAlternateEmail(String altEmail) {
    this.alternateEmail = altEmail;
  }

  public void changePassword(String password) {
    this.password = password;
  }

  public int getMailboxCapacity() {
    return this.mailboxCapacity;
  }

  public String getAlternateEmail() {
    return this.alternateEmail;
  }

  public String getPassword() {
    return this.password;
  }

  public String showInfo() {
    return "DISPLAY NAME: " + this.firstName + " " + this.lastName + "\nCOMPANY EMAIL: " + this.email + "\nMAILBOX CAPACITY: " + this.mailboxCapacity + "mb";
  }

  private String generatePassword(int length) {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
    char[] password = new char[length];
    for (int i = 0; i < length; i++) {
      int random = (int) (Math.random() * characters.length());
      password[i] = characters.charAt(random);
    }
    return new String(password);
  }
  public static void main(String[] args) {
    
  }
  
}
