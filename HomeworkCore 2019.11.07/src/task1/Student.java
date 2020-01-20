package task1;

public class Student extends Person {
    private String faculty;
    private String year;

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public void work(){
        System.out.println("I`m studing from 9am to 2pm");
    }

    @Override
    public void haveRest() {
        System.out.println("I adore sleeping");
    }


    public void showInf(){
        System.out.println(getName()+" "+getSurname()+" I`m "+getAge()+" years old");
    }

    public void goOut(){
        System.out.println("I often spend time with friends");
    }
    public void hasScholarsip(int Scholarship){
        System.out.println(Scholarship+" hrn is gotten to me by University every month");
    }
}

