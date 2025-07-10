package lombok_annotations.src.main.java.group;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString(exclude = "workStart")
@AllArgsConstructor
public class Employee {
    private String name;
    private Integer salary;
    private Date workStart;
}
