package task1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bob",21);
        person.setDay(Days.SATURDAY);
        System.out.println(person.getDay());
        person.goToUviversity();
        person.goToGym();
        person.goToLodos();
    }
}
