package task1;

public abstract class Person {
    private String name;
    private String surname;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println("I eat " + food);
    }
    public void sleep(int hours){
        System.out.println("I sleep " + hours + " hours");
    }
    public void work(){
        System.out.println("I`m working");
    }
    abstract public void haveRest();
}
