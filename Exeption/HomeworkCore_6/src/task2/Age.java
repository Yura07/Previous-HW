package task2;

public class Age {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws RegistrationExeption {
        if (age > 122 || age <= 0){
            throw new RegistrationExeption("Age is incorrect");
        }
        this.age = age;
    }
}
