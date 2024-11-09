//Main klasse til at teste programmet
public class DictatorSimulator {
    public static void main(String[] args) {
        //Opretter et array af leaders og tilføjer de to klasser
        Leader[] leaders = {
                new MilitaryDictator("Poodin", "Russia", 7),
                new PoliticalDictator("Nixon", "USA", 5)
        };
        //Løber igennem arrayet og kalder metoderne fra både leader og interfacet PowerActions
        for (Leader leader : leaders) {
            leader.printDetails();
            leader.implementPolicy(leader instanceof MilitaryDictator ? "Military Dictatorship" : "Political Dictatorship");
            leader.repressOpposition();
            leader.holdParade();
            leader.giveSpeech();
            System.out.println();
        }
    }
}
