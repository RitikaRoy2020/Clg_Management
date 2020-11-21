public class LabAssistants extends Employee {
    LabAssistants(String name,int empId){
        this.setName(name);
        this.setEmpId(empId);
    }
    MemberType memberType=MemberType.LAB_ASSISTANTS;
}
