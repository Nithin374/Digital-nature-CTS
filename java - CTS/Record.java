import java.util.List;

record Person(String name, int age) {}

public class Record {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Abi", 21),
                new Person("John", 18),
                new Person("Priya", 25)
        );

        people.stream()
              .filter(p -> p.age() > 20)
              .forEach(System.out::println);
    }
}