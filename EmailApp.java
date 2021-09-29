public class EmailApp {

  public static void main(String[] args) {
    Email emailAccount = new Email("Josh", "Halpern");
    emailAccount.setAlternateEmail("Joeshmoe@butts.");
    System.out.println(emailAccount.getAlternateEmail());
  }

}