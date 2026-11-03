package Test;

public class TestAccount {
public static void main (String[]args) {
	Account a1 = new Account();
a1.setAccountTylpe("saving");
a1.setNumber("98745387578558");
a1.setBalance(234.00);
a1.setName("ram");
System.out.println(a1.getAccountTylpe());
System.out.println(a1.getBalance());
System.out.println(a1.getName());
System.out.println(a1.getNumber());
System.out.println("-------------------------------");
Account a2 = new Account ();
a2.setAccountTylpe("currunt");
a2.setBalance(4567.00);
a2.setName("sakshi");
a2.setNumber("9876545674");
System.out.println(a1.getAccountTylpe());
System.out.println(a1.getBalance());
System.out.println(a1.getName());
System.out.println(a1.getNumber());


System.out.println("----------------------------------");

Account a3 = new Account();
a3.setAccountTylpe("saving");
a3.setBalance(550000.00);
a3.setName("harshit");
a3.setNumber("784185962862");
System.out.println(a3.getAccountTylpe());
System.out.println(a3.getNumber());
System.out.println(a3.getName());
System.out.println(a3.getBalance());

}
}