public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;


    public Slytherin(String name, String surName, int witchcraft, int transgression,int cunning,int determination, int ambition,int resourcefulness, int thirstForPower) {
        super(name, surName, witchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    @Override
    public String toString() {
        return "Ученик(ца) фак-та Слизерин: " + getName() + " " + getSurName() + " сила магии = " + getWitchcraft() +
                " сила трансгрессии = " + getTransgression() + " хитрость = " + cunning + " решительность = " +
                determination + " амбициозность = " + ambition + " находчивость = " + resourcefulness +
                "жажда власти = " + thirstForPower;
    }

    public  static void comparisonOfStudents(Slytherin firstName, Slytherin secondName) {
        int theSumOfTalentsOfTheFirstStudent = firstName.getTransgression() + firstName.getWitchcraft() +
                firstName.getCunning() + firstName.getDetermination() + firstName.getAmbition() + firstName.getResourcefulness() + firstName.thirstForPower;
        int theSumOfTalentsOfTheSecondStudent = secondName.getWitchcraft() + secondName.getTransgression() + secondName.getCunning() +
                secondName.getDetermination() + secondName.getAmbition() + secondName.getResourcefulness() + secondName.getThirstForPower();
        if (theSumOfTalentsOfTheFirstStudent > theSumOfTalentsOfTheSecondStudent) {
            System.out.println(firstName.getName()+firstName.getSurName() + " лучший студент Слизерена, чем " + secondName.getName() + secondName.getSurName());
        } else if (theSumOfTalentsOfTheFirstStudent == theSumOfTalentsOfTheSecondStudent) {
            System.out.println("Силы " + firstName.getName()+firstName.getSurName() + " и " + secondName.getName() + secondName.getSurName() + " равны");
        } else System.out.println(secondName.getName() + secondName.getSurName() + " лучший студент Слизерена, чем " + firstName.getName()+firstName.getSurName());
    }

}
