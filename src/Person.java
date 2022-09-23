public class Person {
    protected String name;
    protected String surname;
    protected int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public void spendTickets() {
        tickets--;
    }

    public boolean hasMoreTickets() {
        return tickets > 0;
    }

    public int getTickets() {
        return tickets;
    }

    public String getName() {
        return name;
    }
}
