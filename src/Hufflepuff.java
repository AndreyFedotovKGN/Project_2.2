public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;


    public Hufflepuff(String name, String surName, int witchcraft, int transgression,int diligence,int loyalty,int honesty) {
        super(name, surName, witchcraft, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Ученик(ца) фак-та Пуффендуй: " + getName() + " " + getSurName() + " сила магии = " + getWitchcraft() +
                " сила трансгрессии = " + getTransgression() + " трудолюбие = " + diligence + " верность = " +
                loyalty + " честность = " + honesty;
    }

    public  void comparisonOfStudents(Hufflepuff secondName) {
        int theSumOfTalentsOfTheFirstStudent = this.getTransgression() + this.getWitchcraft() + this.getDiligence() + this.getLoyalty() + this.getHonesty();
        int theSumOfTalentsOfTheSecondStudent = secondName.getWitchcraft() + secondName.getTransgression() + secondName.getDiligence() + secondName.getLoyalty() + secondName.getHonesty();
        if (theSumOfTalentsOfTheFirstStudent > theSumOfTalentsOfTheSecondStudent) {
            System.out.println(this.getName() + this.getSurName() + " лучший студент Пуффендуя, чем " + secondName.getName() + secondName.getSurName());
        } else if (theSumOfTalentsOfTheFirstStudent == theSumOfTalentsOfTheSecondStudent) {
            System.out.println("Силы " + this.getName() + this.getSurName() + " и " + secondName.getName() + secondName.getSurName() + " равны");
        } else System.out.println(secondName.getName() + secondName.getSurName() + " лучший студент Пуффендуя, чем " + this.getName() + this.getSurName());
    }
}
