public class Test {

    public static void main(String[] args) {

Salary salary = new Salary();
        Employee employee1 = new Employee();
        employee1.person.name = "Sergey";
        employee1.salary= 100000;

        Employee employee2 = new Employee();
        employee2.person.name = "Sergei";
        employee2.salary= 100000;

        Employee [] array  = {employee1,employee2};
            System.out.println(salary.getSum(array));




    }
}
