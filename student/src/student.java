public class student {
    String name="Saikrishna";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }
    public static void main(String[] args){
        student a=new student();
        a.getName();
        a.setName("abcd");
      }
}
