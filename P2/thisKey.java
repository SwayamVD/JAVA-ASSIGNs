public class thisKey{
    //regular class data member
    String name;
    //static data member (can be access without ref of object)
    static String staticname;

    //parameterized constructor that assigns value to non-static and static variables
    thisKey(String uname){
        this.name = uname;
        staticname = uname;
    }

    //display non-static datamember value
    void displaynonstatic(){
        System.out.println("Name(Non-Static): "+name);
    }
    //display static datamember value
    static void displaystatic(){
        System.out.println("Name(Static): "+staticname);
    }
    public static void main(String[] args) {
        thisKey a = new thisKey("Swayam");
        a.displaynonstatic();
        displaystatic();
    }
}