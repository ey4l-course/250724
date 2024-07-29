public class NumberHolder {
    public int intNumber;
    public double floatNumber;

    public NumberHolder(){
        
    }

    public NumberHolder(int num){
        this.intNumber = num;
        this.floatNumber = 5.5;
    }

    @Override
    public String toString(){
        return "NumberHolder{\n" +
            "intNumber: " + this.intNumber +
            "\nfloatNumber: " + this.floatNumber +
            "\n}";
        }
    
    public static void main(){
        NumberHolder empty = new NumberHolder();
        System.out.println("Empty cunstructor output: " + empty);

        NumberHolder defaultFloat = new NumberHolder(3);
        System.out.println("Empty cunstructor output: " + defaultFloat);
    }
    

}
