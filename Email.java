import java.util.Scanner;

public class Email {
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private int mailboxCapacity;
  private String alternateEmail;

  public Email(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println("Email created for " + this.firstName + " " + this.lastName);

    this.department = setDepartment();
    System.out.println("Department set as: " + this.department);
    
    this.password = generatePassword(8);
    System.out.println("Password set as: " + this.password);

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
