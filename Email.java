public class Email {
  private String firstName;
  private String lastName;
  private String password;
  private int mailboxCapacity;
  private String alternateEmail;

  public Email(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println("Email created for " + this.firstName + " " + this.lastName);

  }
  public static void main(String[] args) {
    
  }
  
}
