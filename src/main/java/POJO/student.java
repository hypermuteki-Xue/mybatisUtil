package POJO;

public class student {
    private int ID;
    private String stuName;
    private String className;
    private int stuAge;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "student{" +
                "ID=" + ID +
                ", stuName='" + stuName + '\'' +
                ", className='" + className + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }
}
