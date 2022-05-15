package Java_Felix;

/*
One hero <-> one weapon
 */
public class Object {
    public static void main(String[] args){
        Hero hero = new Hero("Bebie", 300);
        Weapon weapon = new Weapon("Couple sord", 3);

        //Connect 2 objectives
        hero.setWeapon(weapon);
        weapon.setHero(hero);

        //Find Hero info
        String name = hero.getName();
        int age = hero.getAge();
        Weapon w = hero.getWeapon();
        System.out.println("I am " + name + ", i am " +age+" years old, my weapon is"+w.getName()
        + "and it ranking "+ w.getGrade());

    }
}

class Hero{
    private String name;
    private int age;
    private Weapon weapon;//1 on 1, find weapon via hero
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public Weapon getWeapon(){
        return weapon;
    }
    public Hero(){}
    public Hero(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setname(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

class Weapon{
    private String name;
    private int grade;
    private Hero hero;
    public void setHero(Hero hero){
        this.hero = hero;
    }
    public Hero getHero(){
        return hero;
    }

    public Weapon(){
    }
    public Weapon (String name, int grade){
        this.name = name;
        this.grade = grade;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setGrade(){
        this.grade = grade;
    }
    public int getGrade(){
        return grade;
    }

}
