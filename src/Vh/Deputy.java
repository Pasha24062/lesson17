package Vh;

public class Deputy extends Man{
    private String firstName;
    private String name;
    private int age;
    private boolean bribe;

    public Deputy(int weight, int height, String firstName, String name, int age) {
        super(weight, height);
        this.firstName = firstName;
        this.name = name;
        this.age = age;
    }
    public void giveBribe(){
        if (bribe == false) {
            System.out.println("Нормальний чувак");
        }else{
            System.out.println("Це поганий чувак");
        }

    }

    public Deputy(int weight, int height) {
        super(weight, height);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getBribe() {
        return bribe;
    }

    public void setBribe(boolean bribe) {
        this.bribe = bribe;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bribe=" + bribe +
                "} " + super.toString();
    }
}
