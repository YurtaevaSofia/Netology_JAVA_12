package domain;

import manager.ProductManager;
import org.junit.jupiter.api.Test;
import repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

//@ExtendWith(MockitoExtension.class)

public class ProductManagerTest {


    @Test
    public void shouldSearchByName(){

        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);

        Product book1 = new Book(1, "1984", 300, "George Orwell");
        Product book2 = new Book(2, "Idiot", 500, "Dostoyevsky");
        Product smartPhone1 = new Smartphone(3, "Iphone7", 16000, "Apple");
        Product smartPhone2 = new Smartphone(4, "Iphone10", 60000, "Apple");


        manager.add(book1);
        manager.add(book2);
        manager.add(smartPhone1);
        manager.add(smartPhone2);


        Product [] expected = new Product[]{book1};
        Product [] actual = manager.searchBy("1984");
        assertArrayEquals(expected, actual);


    }


    @Test
    public void shouldSearchNotByName(){

        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);

        Product book1 = new Book(1, "1984", 300, "George Orwell");
        Product book2 = new Book(2, "Idiot", 500, "Dostoyevsky");
        Product smartPhone1 = new Smartphone(3, "Iphone7", 16000, "Apple");
        Product smartPhone2 = new Smartphone(4, "Iphone10", 60000, "Apple");


        manager.add(book1);
        manager.add(book2);
        manager.add(smartPhone1);
        manager.add(smartPhone2);



        Product [] expected1 = new Product[]{smartPhone1, smartPhone2};
        Product [] actual1 = manager.searchBy("Apple");
        assertArrayEquals(expected1, actual1);

    }

    @Test
    public void shouldSearchWhenNoMatch(){

        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);

        Product book1 = new Book(1, "1984", 300, "George Orwell");
        Product book2 = new Book(2, "Idiot", 500, "Dostoyevsky");
        Product smartPhone1 = new Smartphone(3, "Iphone7", 16000, "Apple");
        Product smartPhone2 = new Smartphone(4, "Iphone10", 60000, "Apple");


        manager.add(book1);
        manager.add(book2);
        manager.add(smartPhone1);
        manager.add(smartPhone2);


        Product [] expected = new Product[]{};
        Product [] actual = manager.searchBy("Devils");
        assertArrayEquals(expected, actual);


    }


}
