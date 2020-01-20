package task1;

public class Retired extends Person{
    private int expiriancse;
    private String favoriteGame;

    public int getExpiriancse() {
        return expiriancse;
    }

    public void setExpiriancse(int expiriancse) {
        this.expiriancse = expiriancse;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }

    @Override
    public void work(){
        System.out.println("I`ve been woriking "+getExpiriancse()+" years");
    }
    @Override
    public void haveRest(){
        System.out.println("I found of play "+getFavoriteGame());
    }
    public void showInf(){
        System.out.println(getName()+" I`m "+getAge()+" years old");
    }
    public void hasPension(int Pension){
        System.out.println(Pension+" hrn is gotten to me by country every month");
    }
    public void speak(){
        System.out.println("I like gossipping with another retired");
    }

}
