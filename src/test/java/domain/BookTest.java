package domain;

import repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    public void shouldMatchWhenSearchedByName() {

        Product book1 = new Book(1, "1984", 300, "George Orwell");

        boolean actual = book1.matches("1984");
        assertEquals(true, actual);

        boolean actual1 = book1.matches("LalaLand");
        assertEquals(false, actual1);
    }

    public void shouldMatchWhenSearchedByAuthor() {

        Product book1 = new Book(1, "1984", 300, "George Orwell");

        boolean actual = book1.matches("George Orwell");
        assertEquals(true, actual);

        boolean actual1 = book1.matches("LalaLand");
        assertEquals(false, actual1);
    }
}