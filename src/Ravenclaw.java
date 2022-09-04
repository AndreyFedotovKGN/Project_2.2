public class Ravenclaw extends Hogwarts {

    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;


    public Ravenclaw(String name, String surName, int witchcraft, int transgression,int mind,int wisdom,int wit,int creativity) {
        super(name, surName, witchcraft, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ученик(ца) фак-та Когтевран: " + getName() + " " + getSurName() + " сила магии = " + getWitchcraft() +
                " сила трансгрессии = " + getTransgression() + " ум = " + mind + " мудрость = " +
                wisdom + " остроумие = " + wit + " творчество = " + creativity;
    }

    public  static void comparisonOfStudents(Ravenclaw firstName, Ravenclaw secondName) {
        int theSumOfTalentsOfTheFirstStudent = firstName.getTransgression() + firstName.getWitchcraft() + firstName.getMind() + firstName.getWisdom() + firstName.getWit() + firstName.getCreativity();
        int theSumOfTalentsOfTheSecondStudent = secondName.getWitchcraft() + secondName.getTransgression() + secondName.getMind() + secondName.getWisdom() + secondName.getWit() + secondName.getCreativity();
        if (theSumOfTalentsOfTheFirstStudent > theSumOfTalentsOfTheSecondStudent) {
            System.out.println(firstName.getName()+firstName.getSurName() + " лучший студент Когтеврана, чем " + secondName.getName() + secondName.getSurName());
        } else if (theSumOfTalentsOfTheFirstStudent == theSumOfTalentsOfTheSecondStudent) {
            System.out.println("Силы " + firstName.getName()+firstName.getSurName() + " и " + secondName.getName() + secondName.getSurName() + " равны");
        } else System.out.println(secondName.getName() + secondName.getSurName() + " лучший студент Когтеврана, чем " + firstName.getName()+firstName.getSurName());
    }
}
