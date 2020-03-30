package homework5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Task 1 from geekbrains
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 100000, 30));
        list.add(new Employee("Kuznetsov Vladimir", " Systems administrator", "v.l.kuz@gmail.com", "89225123645", 60000, 45));
        list.add(new Employee("Kalinina Ekaterina", "Engineer", "kalina148347@mailbox.com", "89052365496", 100000, 41));
        list.add(new Employee("Russkova Diana", "Lawyer", "russiamfl442@gmail.com", "89356255512", 70000, 47));
        list.add(new Employee("Finageniv Maxim", "Web developer", "finagen.maxim@mail.ru", "89093651442", 85000, 26));
        for (Employee employee : list) {
            if (employee.getAge() > 40) {
                System.out.println(employee.toString());
            }
        }
        System.out.println(list);
    }
}
