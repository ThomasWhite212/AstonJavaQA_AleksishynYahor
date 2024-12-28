public class Main {
    public static void main(String[] args) {
        // Task 2: Create and initialize an array of employees
        System.out.println("Initializing employees...");
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "+37529231231", 4700, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "pepetr@mailbox.com", "+37544233445", 6500, 35);
        employees[2] = new Employee("Sidorov Sidor", "Developer", "sidorov@mailbox.com", "+37525234567", 5000, 28);
        employees[3] = new Employee("Alexandrov Alex", "Janitor", "alalex@mailbox.com", "+37544237654", 1800, 40);
        employees[4] = new Employee("Muhtar", "Dog-Talisman", "dog@mailbox.com", "+375449237654", 50, 3);

        // Print information about all employees
        System.out.println("Printing employee information:");
        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println();
        }

        // Task 3: Park and attractions
        System.out.println("Initializing park and attractions...");
        Park park = new Park();
        park.addAttraction("Hully-Gully", "10:00 - 18:00", 25.0);
        park.addAttraction("Paratrooper", "09:00 - 20:00", 15.5);
        park.addAttraction("Super-8", "12:00 - 22:00", 12.75);

        System.out.println("Displaying park attractions:");
        park.displayAttractions();
    }
}
