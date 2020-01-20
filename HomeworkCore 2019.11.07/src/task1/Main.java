package task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("\tStudent");
        Student student = new Student();
        student.setName("Kathy");
        student.setSurname("Elish");
        student.setAge(19);
        student.setGender("female");
        student.setFaculty("Lawyer");
        student.setYear("2");

        student.showInf();
        System.out.println("is stading "+student.getYear()+" year on "+student.getFaculty());
        student.work();
        student.hasScholarsip(1300);
        student.sleep(7);
        student.eat("vegetables");
        student.haveRest();
        student.goOut();

        System.out.println();

        System.out.println("\tRetired");
        Retired retired = new Retired();
        retired.setName("Bob");
        retired.setAge(74);
        retired.setGender("male");
        retired.setExpiriancse(45);
        retired.setFavoriteGame("Chess");

        retired.showInf();
        retired.work();
        retired.haveRest();
        retired.eat("healhty food");
        retired.sleep(10);
        retired.hasPension(2300);
        retired.speak();
        System.out.println();

        System.out.println("\tWorker");
        Worker worker = new Worker();
        worker.setName("Ned");
        worker.setSurname("Alen");
        worker.setAge(24);
        worker.setGender("male");
        worker.setCompany("SpaceX");
        worker.setSalary(3600);

        worker.showInf();
        worker.work();
        worker.haveRest();
        worker.eat("meat");
        worker.sleep(8);
        worker.travell();
        worker.buy();
    }

}
