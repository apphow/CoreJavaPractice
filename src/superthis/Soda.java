package superthis;

public class Soda extends Drink{

    boolean isDiet = false;

    public Soda(String type, String brand, int mostSugar, boolean isDiet) {
        super(type, brand, mostSugar);
        this.isDiet = isDiet;
    }

    public boolean isDiet() {
        return isDiet;
    }

    public void setDiet(boolean diet) {
        isDiet = diet;
    }
}
