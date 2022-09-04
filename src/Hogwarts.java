public class Hogwarts {
    private final String name;
    private final String surName;
    private int witchcraft;
    private int transgression;

    public Hogwarts(String name, String surName, int witchcraft, int transgression) {
        this.name = name;
        this.surName = surName;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Ученик(ца) " + name + " " + surName + " сила магии = " + witchcraft + " сила трансгрессии = " + transgression;
    }

    public static void comparisonOfStudents(Hogwarts firstName, Hogwarts secondName) {
        int theMagicOfTheFirstStudent = firstName.getWitchcraft() + firstName.getTransgression();
        int theMagicOfTheSecondStudent = secondName.getWitchcraft() + secondName.getTransgression();
        if (theMagicOfTheFirstStudent > theMagicOfTheSecondStudent) {
            System.out.println(firstName.getName() + firstName.getSurName() + " обладает большей мощностью магии, чем " + secondName.getName()+secondName.getSurName());
        } else if (theMagicOfTheFirstStudent == theMagicOfTheSecondStudent) {
            System.out.println("Cила магии " + firstName.getName() + firstName.getSurName() + " равна силе магии " + secondName.getName()+secondName.getSurName());
        } else System.out.println(secondName.getName()+secondName.getSurName() + " обладает большей мощностью магии, чем " + firstName.getName() + firstName.getSurName());
    }
}
