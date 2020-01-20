package task1;

public class Worker extends Person{
    private int salary;
    private String company;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void work(){
        System.out.println("I`m working in "+getCompany()+" and earn "+getSalary()+" $ per mounth");
    }

    @Override
    public void haveRest(){
        System.out.println("I play football when I have free time");
    }

    public void travell(){
        System.out.println("I often travell to differend country");
    }
    public void showInf(){
        System.out.println(getName()+" "+getSurname()+" I`m "+getAge()+" years old");
    }
    public void buy(){
        System.out.println("I like collecting magnets from country where I was");
    }
}
