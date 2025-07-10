package lombok_annotations.src.main.java.group;

public class NewExamples extends Examples {
    NewExamples(String id){
        super(id);
    }

    @Override
    public String other() {
        return super.other();
    }
}
