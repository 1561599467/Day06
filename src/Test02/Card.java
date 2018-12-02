package Test02;

public class Card {
    private String hs;
    private char ds;

    public Card() {
    }

    public Card(String hs, char ds) {
        this.hs = hs;
        this.ds = ds;
    }

    public String getHs() {
        return hs;
    }

    public void setHs(String hs) {
        this.hs = hs;
    }

    public char getDs() {
        return ds;
    }

    public void setDs(char ds) {
        this.ds = ds;
    }

    public  String showCard() {
        String str=hs+ds;
        return str;
    }
}
