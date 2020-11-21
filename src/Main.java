import java.util.*;

public class Main {
    public static void main(String[] args) {
        Faculties faculties=new Faculties();
        List<String> Faculties=new ArrayList<>();
        var.add(faculties);
        LibraryStaff libraryStaff=new LibraryStaff("Rohit",02);
        LabAssistants labAssistants=new LabAssistants("Shweta",03);
        Students students=new Students("Ritika",2034,2020,"BEC4");
        System.out.println(labAssistants.getName()+" "+labAssistants.getEmpId()+" "+MemberType.LAB_ASSISTANTS);
        System.out.println(libraryStaff.getName()+" "+libraryStaff.getEmpId()+" "+MemberType.LIBRARY_STAFF);
        System.out.println(faculties.getName()+" "+faculties.getEmpId()+" "+MemberType.FACULTIES);
        System.out.println(students.getName()+" "+students.getId()+" "+students.getPassingYear()+" "+students.getBatch());
    }
}