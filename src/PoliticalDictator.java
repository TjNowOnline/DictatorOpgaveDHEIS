//Opretter konkret klasse som arver fra superklassen leader og implementerer PowerActions
public class PoliticalDictator extends Leader implements PowerActions {
    //Opretter konstruktør
    public PoliticalDictator(String name, String country, int yearsinpower) {
        super(name, country, yearsinpower);
    }
    //Variabel string partyName som definerer navnet på diktatorens parti
    String partyName = "Independent";
    //Implementerer metoder fra PowerActions og Leader som påkrævet
    public void implementPolicy(String policy) {
        System.out.println("Implementing policy: " + policy);
    }
    public void repressOpposition() {
        System.out.println("Opposition has been repressed");
    }
    public void holdParade() {
        System.out.println("Parade has been held");
    }
    public String giveSpeech() {
        return "I have given my political speech";
    }
    public void printDetails() {
    super.printDetails();
    System.out.println("Party Name: " + partyName);
}
}
