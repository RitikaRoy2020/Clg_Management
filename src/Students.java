public class Students{
    MemberType memberType=MemberType.STUDENTS;
    private String name;
    private int id;
    private int passingYear;
    private String batch;
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getPassingYear(){
        return passingYear;
    }
    public String getBatch(){
        return batch;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setPassingYear(int passingYear){
        this.passingYear=passingYear;
    }
    public void setBatch(String batch){
        this.batch=batch;
    }
    Students(String name,int id,int passingYear,String batch){
        this.setName(name);
        this.setId(id);
        this.setPassingYear(passingYear);
        this.setBatch(batch);
    }
}