package day01;

public class Person {
    private Ticket  ticket;

    public Person(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ticket=" + ticket +
                '}';
    }
}