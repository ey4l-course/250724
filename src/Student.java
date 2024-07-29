public class Student {
    private String name;
    private String phone;
    private String address;
    private int roll_no;

    public Student (String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString(){
        return "Student{" +
            "\nname:" + this.name +
            "\nphone:" + this.phone +
            "\naddress:" + this.address +
            "\nroll_no:" + this.roll_no +
            "\n}";
    }

}
