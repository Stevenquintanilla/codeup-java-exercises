package sports;

public class Sports {

    protected int players;
    protected String  teamName;

    public Sports() {
        this.players = 0;
        this.teamName = "In progress";
    }

    public Sports(int players, String teamName) {
        this.players = players;
        this.teamName = teamName;
    }

    public void playBall(){
        System.out.println("Wait, what are we playing?");
    }

    public void teamIntro() {
        System.out.printf("Here comes the %s", this.teamName);

    }
}
