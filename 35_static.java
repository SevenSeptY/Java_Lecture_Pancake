package Java_Felix;

public class Static {
    public static void main(String[] args){
        Role beibei = new Role("Beibei");
        Role yunchang = new Role("Yunyun");
        Role feifei = new Role("Flyfly");

        System.out.println(beibei.getInfo());
       // System.out.println(yunchang.getInfo());
       // System.out.println(feifei.getInfo());

        System.out.println(beibei.country);
        System.out.println(beibei.country);

        System.out.println("-----------------");
        System.out.println(Role.country);

    }
}

class Role{
    private String name;
    static String country = "Shu Country";// static variable atrribute(for all)
    //This static area can be called
    /*public Role(String name , String country){
        this.name = name;
        this.country = country;
    }
    */
    public Role(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setCountry(){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }
    public String getInfo(){
        return "Name" +name +",Country= "+country;
    }
    public static void setCountry(String country){
        Role.country = country;
    }
}

/*
1. Static for all
2. Static not belong to object, it depends on class
3. Static
4. 
5.
6. Static for an attribute
7. Static method can not access non-static attribute and method
   Static method can only access static method or attribute
 */
