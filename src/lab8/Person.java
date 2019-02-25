package lab8;

public class Person {
    //class properties
    private String pID;
    private String name;
    private String yearBorn;


    //constructor
    public void introduce(){
        System.out.println("My name is" +this.name+",");
        System.out.println("I was born "+this.yearBorn);
    }

    public Person(String pID, String name) {
        this.pID = pID;
        this.name = name;
    }

    //getter and setter
    @Override
    public String toString() {
        return "Person{" +
                "pID='" + pID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getpID() {
        return pID;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
