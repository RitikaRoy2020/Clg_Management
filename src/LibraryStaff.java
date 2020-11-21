public class LibraryStaff extends Employee{
    LibraryStaff(String name,int empId){
        this.setName(name);
        this.setEmpId(empId);
    }
    MemberType memberType=MemberType.LIBRARY_STAFF;
}
