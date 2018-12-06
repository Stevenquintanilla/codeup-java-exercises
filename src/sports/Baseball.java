package sports;

public class Baseball extends Sports {

    public Baseball(int players, String teamName) {
        super(players, teamName);
    }

    public void playBall() {
        System.out.println("Naw, baseball is boring");
    }
}
