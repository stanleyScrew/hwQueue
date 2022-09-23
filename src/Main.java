import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new ArrayDeque<>();
        List<Person> people = generateClients();
        for (Person person : people) {
            queue.offer(person);
        }
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println("Посетитель " + person.getName() + " прокатился");
            person.spendTickets();
            if (person.hasMoreTickets()) {
                queue.offer(person);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> ans = new ArrayList<>();
        ans.add(new Person("Petya", "P", 3));
        ans.add(new Person("Anya", "P", 1));
        ans.add(new Person("Olya", "P", 1));
        ans.add(new Person("Kolya", "P", 2));
        return ans;
    }
}
