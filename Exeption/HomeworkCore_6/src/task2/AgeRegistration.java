package task2;

public class AgeRegistration {
    public void inputAge(){
        Age age = new Age();
        try {
            age.setAge(125);
        } catch (RegistrationExeption registrationExeption) {
            registrationExeption.printStackTrace();
        }
    }
}
