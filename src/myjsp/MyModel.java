package myjsp;

public class MyModel {
    public Person getPerson() {
        Person person = new Person();
        person.setName("Sergio");
        person.setAge(22);
        return person;
    }
}
