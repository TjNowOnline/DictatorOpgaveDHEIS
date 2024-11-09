//Opretter en abstrakt klasse Leader som implementerer PowerActions
abstract class Leader implements PowerActions {
    //Laver variablerne name, country og yearsinpower.
    String name;
    String country;
    int yearsinpower;
    //Konstruktør
    public Leader(String name, String country, int yearsinpower) {
        this.name = name;
        this.country = country;
        this.yearsinpower = yearsinpower;
    }
    //Abstrakt metode til at give tale
    abstract String giveSpeech();
    //Metode til at printe detaljerne som er variablerne
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Years in power: " + yearsinpower);
    }
}
