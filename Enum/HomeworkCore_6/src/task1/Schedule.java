package task1;

public class Schedule {
    private Days day;

    public Days getDay() {
        return day;
    }

    public void setDay(Days day) {
        this.day = day;
    }

    public void goToUviversity(){
        if (day == Days.SATURDAY || day == Days.SUNDAY){
            System.out.println("Hoorey, it`s day off");
        }else {
            System.out.println("Oh, no. Univeriry again");
        }
    }

    public void goToGym(){
        if (day == Days.MONDAY || day == Days.WENDESDAY || day == Days.SATURDAY){
            System.out.println("I have to go to gym at 7pm");
        }else {
            System.out.println("I can calm dowm");
        }
    }

    public void goToLodos(){
        if (day == Days.TUESDAY || day == Days.THURSDAY){
            System.out.println("Logos at 16:00");
        }else {
            System.out.println("Do my Home Work");
        }
    }

}
