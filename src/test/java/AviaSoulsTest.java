import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Comparator;

public class AviaSoulsTest {

    @Test
    public void shouldCompareAndSortTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Астана", 20000, 14, 17);
        Ticket ticket2 = new Ticket("Москва", "Астана", 15000, 5, 8);
        Ticket ticket3 = new Ticket("Екатеринбург", "Караганда", 6000, 10, 12);
        Ticket ticket4 = new Ticket("Сочи", "Екатеринбург", 13000, 11, 14);
        Ticket ticket5 = new Ticket("Москва", "Астана", 25000, 15, 18);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);


        Ticket[] expected = {ticket2, ticket1, ticket5};
        Ticket[] actual = manager.search("Москва", "Астана");
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldCompareAndSortTicketsOnlyOne() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Астана", 20000, 14, 17);
        Ticket ticket2 = new Ticket("Москва", "Астана", 15000, 5, 8);
        Ticket ticket3 = new Ticket("Екатеринбург", "Караганда", 6000, 10, 12);
        Ticket ticket4 = new Ticket("Сочи", "Екатеринбург", 13000, 11, 14);
        Ticket ticket5 = new Ticket("Москва", "Астана", 25000, 15, 18);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);


        Ticket[] expected = {ticket4};
        Ticket[] actual = manager.search("Сочи", "Екатеринбург");
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldCompareAndSortTicketsNo() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Астана", 20000, 14, 17);
        Ticket ticket2 = new Ticket("Москва", "Астана", 15000, 5, 8);
        Ticket ticket3 = new Ticket("Екатеринбург", "Караганда", 6000, 10, 12);
        Ticket ticket4 = new Ticket("Сочи", "Екатеринбург", 13000, 11, 14);
        Ticket ticket5 = new Ticket("Москва", "Астана", 25000, 15, 18);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);


        Ticket[] expected = { };
        Ticket[] actual = manager.search("Воронеж", "Кемерово");
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldCompareAndSortTicketsWithComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Астана", 20000, 14, 18);
        Ticket ticket2 = new Ticket("Москва", "Астана", 15000, 5, 7);
        Ticket ticket3 = new Ticket("Екатеринбург", "Караганда", 6000, 10, 12);
        Ticket ticket4 = new Ticket("Сочи", "Екатеринбург", 13000, 11, 14);
        Ticket ticket5 = new Ticket("Москва", "Астана", 25000, 15, 18);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] expected = {ticket2, ticket5, ticket1};
        Ticket[] actual = manager.searchAndSortBy("Москва", "Астана", comparator);
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldCompareAndSortTicketsWithComparatorOnlyOne() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Астана", 20000, 14, 18);
        Ticket ticket2 = new Ticket("Москва", "Астана", 15000, 5, 7);
        Ticket ticket3 = new Ticket("Екатеринбург", "Караганда", 6000, 10, 12);
        Ticket ticket4 = new Ticket("Сочи", "Екатеринбург", 13000, 11, 14);
        Ticket ticket5 = new Ticket("Москва", "Астана", 25000, 15, 18);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] expected = {ticket4};
        Ticket[] actual = manager.searchAndSortBy("Сочи", "Екатеринбург", comparator);
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldCompareAndSortTicketsWithComparatorNo() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Астана", 20000, 14, 18);
        Ticket ticket2 = new Ticket("Москва", "Астана", 15000, 5, 7);
        Ticket ticket3 = new Ticket("Екатеринбург", "Караганда", 6000, 10, 12);
        Ticket ticket4 = new Ticket("Сочи", "Екатеринбург", 13000, 11, 14);
        Ticket ticket5 = new Ticket("Москва", "Астана", 25000, 15, 18);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] expected = { };
        Ticket[] actual = manager.searchAndSortBy("Воронеж", "Кемерово", comparator);
        Assertions.assertArrayEquals(expected, actual);

    }
}

