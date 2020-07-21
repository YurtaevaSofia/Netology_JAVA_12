package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartphoneTest {
    public void shouldMatchWhenSearchedByName() {

        Product smartPhone1 = new Smartphone(1, "Iphone7", 16000, "Apple");

        boolean actual = smartPhone1.matches("Iphone7");
        assertEquals(true, actual);

        boolean actual1 = smartPhone1.matches("Iphone8");
        assertEquals(false, actual1);
    }

    public void shouldMatchWhenSearchedByManufacturer() {

        Product smartPhone1 = new Smartphone(1, "Iphone7", 16000, "Apple");

        boolean actual = smartPhone1.matches("Apple");
        assertEquals(true, actual);

        boolean actual1 = smartPhone1.matches("Samsung");
        assertEquals(false, actual1);
    }
}
