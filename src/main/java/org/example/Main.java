package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //7.1
    Person person = new Person("Иван", 199);
    person.setName("Пётр");
    person.setAge(99);
    System.out.println("Имя:" + person.getName() + " age: " + person.getAge());
  //7.2
        Product product1 = new Product("Молоко", -458);
        System.out.println("Отрицательное значение" + " Name " + product1.getName() + " Price " + product1.getPrice());
        Product product2 = new Product("Квас", 458);
        System.out.println("Положительное значение" + " Name " + product2.getName() + " Price " + product2.getPrice());
  //7.3
        BankAccount account = new BankAccount("Иван", 1000);

       //  account.balance = 1000000;//'balance' has private access in 'org.example.BankAccount'
       //  account.owner = "Хакер";//'owner' has private access in 'org.example.BankAccount'

        System.out.println("\ndeposit(500)");
        account.deposit(500);
        System.out.println("Баланс: " + account.getBalance());

        System.out.println("\ndeposit(-100)");
        account.deposit(-100);
        System.out.println("Баланс: " + account.getBalance());

        System.out.println("\ndeposit(0)");
        account.deposit(0);
        System.out.println("Баланс: " + account.getBalance());

        System.out.println("\nwithdraw(300)");
        account.withdraw(300);
        System.out.println("Баланс: " + account.getBalance());


        System.out.println("\nwithdraw(1000000)");
        account.withdraw(1000000);
        System.out.println("Баланс: " + account.getBalance());


        System.out.println("\nwithdraw(-50)");
        account.withdraw(-50);
        System.out.println("Баланс: " + account.getBalance());
    }
}
