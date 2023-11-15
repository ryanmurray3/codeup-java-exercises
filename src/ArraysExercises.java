

public class ArraysExercises {
//    int[] numbers = {1, 2, 3, 4, 5};
//System.out.println(numbers.toString);


    public static void main(String[] args) {
//        arrays in java have a fixed length.
        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person("Jane");
        people[2] = new Person("Bob");

//        array.for hit tab to create the loop
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeople = new Person[people.length + 1];
        System.arraycopy(people, 0, newPeople, 0, people.length);
        newPeople[newPeople.length - 1] = newPerson;
        return newPeople;
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


