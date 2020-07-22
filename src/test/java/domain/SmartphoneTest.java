package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartphoneTest {

    Product smartPhone1 = new Smartphone(1, "Iphone7", 16000, "Apple");

    public void shouldMatchWhenSearchedByNamePositive() {

        boolean actual = smartPhone1.matches("Iphone7");
        assertEquals(true, actual);
    }

    public void shouldMatchWhenSearchedByNameNegative() {

        boolean actual1 = smartPhone1.matches("Iphone8");
        assertEquals(false, actual1);
    }

    public void shouldMatchWhenSearchedByManufacturerPositive() {

        boolean actual = smartPhone1.matches("Apple");
        assertEquals(true, actual);
    }

    public void shouldMatchWhenSearchedByManufacturerNegative() {

        boolean actual1 = smartPhone1.matches("Samsung");
        assertEquals(false, actual1);
    }
}
