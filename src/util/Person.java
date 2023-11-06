package util;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
//TODO: return the person's name
    }
    public void setName(String name) {
        this.name = name;
//TODO: change the name field to the passed value
    }
        public void sayHello () {
            System.out.println("Hello " + this.name);
//TODO: print a message to the console using the person's name
        }

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
//        util.Person person = new util.Person("John");
//        System.out.println(person.getName());
//        person.setName("Jane");
//        System.out.println(person.getName());
//        person.sayHello();
    }


}
