package lab8;

public class Sheriff extends Person{

    private String workState;


    public Sheriff(String pID, String name, String workState) {
        super(pID, name);
        this.workState = workState;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I work at"+this.workState);
    }

    public String getWorkState() {
        return workState;
    }

    public void setWorkState(String workState) {
        this.workState = workState;
    }
}