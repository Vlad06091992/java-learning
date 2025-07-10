package lombok_annotations.src.main.java.group;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Examples {

    @Getter
    @Setter
    private String name;
    private Integer age; ;

    String someVar = "123";

    public Examples(String id) {
    }

    public void setAge (@NonNull Integer age) {
        this.age = age;
    }

    @Deprecated
    public String some(){
        return "some";
    }

    public String other(){
        return "other";
    }

}
