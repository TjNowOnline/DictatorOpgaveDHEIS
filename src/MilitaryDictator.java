//Opretter en konkret klasse MilitaryDictator som arver fra superklasse Leader og implementerer PowerActions
public class MilitaryDictator extends Leader implements PowerActions {
    //Opretter konstruktør
    public MilitaryDictator(String name, String country, int yearsinpower) {
    super(name, country, yearsinpower);
    }
    //Variabel string som er diktatorens rang
    String militaryRank = "General";
    //Herunder er metoderne fra både PowerActions og Leader som er påkrævet
    public void implementPolicy(String policy) {
        System.out.println("Implementing policy: " + policy);
    }
    public void repressOpposition() {
        System.out.println("Opposition has been repressed with power.");
    }
    public void holdParade() {
        System.out.println("Oppressing parade has been held.");
    }
    public String giveSpeech() {
        return "I have given my oppressing speech.";
    }
   public void printDetails() {
    super.printDetails();
    System.out.println("Military Rank: " + militaryRank);
}
}
