public class Employee {
    private String name;
    private int YOJ;
    private int salary;
    private String address;

    public Employee (String name, int YOJ, int salary, String address){
        this.name = name;
        this.YOJ = YOJ;
        this.salary = salary;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getYOJ(){
        return YOJ;
    }
    public int getSalary(){
        return salary;
    }
    public String getAddress(){
        return address;
    }

    @Override
    public String toString(){
        return name + " " + YOJ + " " + salary + " " + address;
    }
}
