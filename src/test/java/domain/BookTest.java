package domain;

import repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    Product book1 = new Book(1, "1984", 300, "George Orwell");

    public void shouldMatchWhenSearchedByNamePositive() {

        boolean actual = book1.matches("1984");
        assertEquals(true, actual);

    }

    public void shouldMatchWhenSearchedByNameNegative() {

        boolean actual1 = book1.matches("LalaLand");
        assertEquals(false, actual1);
    }

    public void shouldMatchWhenSearchedByAuthorPositive() {

        boolean actual = book1.matches("George Orwell");
        assertEquals(true, actual);

    }
    public void shouldMatchWhenSearchedByAuthorNegative() {

        boolean actual1 = book1.matches("LalaLand");
        assertEquals(false, actual1);
    }
}