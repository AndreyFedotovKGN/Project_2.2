public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry", "Potter", 95, 70, 60, 70, 90);
        Gryffindor hermioneGranger = new Gryffindor("Hermione", "Granger", 70, 80, 70, 65, 70);
        Gryffindor ronWeasley = new Gryffindor("Ron", "Weasley", 60, 55, 30, 60, 50);
        Slytherin dracoMalfoy = new Slytherin ("Draco", "Malfoy", 80, 60, 70,60,50,75,80);
        Slytherin grahamMontague = new Slytherin("Graham", "Montague", 65, 40, 30, 45, 58, 26, 63);
        Slytherin gregoryGoyle = new Slytherin("Gregory", "Goyle", 35, 62, 75, 25, 39, 46, 15);
        Hufflepuff zachariahSmith = new Hufflepuff("Zachariah", "Smith", 52, 63, 85,56,43);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric", "Diggory", 65, 48, 69, 59, 86);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin", "Finch-Fletchley", 65, 45, 54, 36, 74);
        Ravenclaw zhouChang = new Ravenclaw("Zhou", "Chang", 35, 85, 46, 63, 48, 56);
        Ravenclaw padmaPatil = new Ravenclaw("Padma", "Patil", 65, 79, 57, 67, 84, 95);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus", "Belby", 65, 25, 36, 52, 48, 62);

        System.out.println(harryPotter);
        System.out.println(zachariahSmith);

        harryPotter.comparisonOfStudents(ronWeasley);
        ronWeasley.comparisonOfStudents(hermioneGranger);
        zachariahSmith.comparisonOfStudents(cedricDiggory);
        padmaPatil.comparisonOfStudents(marcusBelby);
        dracoMalfoy.comparisonOfStudents(gregoryGoyle);
        padmaPatil.comparisonOfStudents(hermioneGranger);





    }
}