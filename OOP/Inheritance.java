package Day7;

public class Inheritance {
    public static void main(String[] args){
        Manager boss = new Manager("Gaurav Jha", 50000, 2015,15,19);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry", 5000, 2009, 10, 1);
        staff[2] = new Employee("Tester", 4000, 2019, 5, 50);

        for(Employee e: staff) System.out.println("name" + e.getName() + ",Salary=" + e.getSlary());
    }
}
