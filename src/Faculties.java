import java.util.ArrayList;
import java.util.List;

public class Faculties extends Employee{
    List<String> name=new ArrayList<>();

    public void setName(List<String> name) {
        this.name = name.add("Ishan");
    }

    MemberType memberType=MemberType.FACULTIES;
}