public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String name, String surName, int witchcraft, int transgression,int nobility, int honor, int bravery) {
        super(name, surName, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Ученик(ца) фак-та Гриффиндор: " + getName() + " " + getSurName() + " сила магии = " + getWitchcraft() +
                " сила трансгрессии = " + getTransgression() + " благородство = " + nobility + " честь = " +
                honor + " храбрость = " + bravery;
    }

    public  static void comparisonOfStudents(Gryffindor firstName, Gryffindor secondName) {
        int theSumOfTalentsOfTheFirstStudent = firstName.getTransgression() + firstName.getWitchcraft() + firstName.getHonor() + firstName.getNobility() + firstName.getBravery();
        int theSumOfTalentsOfTheSecondStudent = secondName.getWitchcraft()+secondName.getTransgression()+secondName.getNobility()+secondName.getHonor()+secondName.getBravery();
        if (theSumOfTalentsOfTheFirstStudent > theSumOfTalentsOfTheSecondStudent) {
            System.out.println(firstName.getName()+firstName.getSurName() + " лучший студент Грифендора, чем " + secondName.getName() + secondName.getSurName());
        } else if (theSumOfTalentsOfTheFirstStudent == theSumOfTalentsOfTheSecondStudent) {
            System.out.println("Силы " + firstName.getName()+firstName.getSurName() + " и " + secondName.getName() + secondName.getSurName() + " равны");
        } else System.out.println(secondName.getName() + secondName.getSurName() + " лучший студент Грифендора, чем " + firstName.getName()+firstName.getSurName());
    }
}


