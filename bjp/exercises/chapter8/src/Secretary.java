public class Secretary extends Employee{
    public void takeDictation(String text) {
        System.out.println("Dictating text: " + text);
    }

//    Employee.getSalary();

    public double getSalary() {
//        Employee.getSalary();
        return super.getSalary() + 4000;
    }
}
