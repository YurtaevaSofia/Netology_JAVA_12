package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.*;

//@ExtendWith(MockitoExtension.class)

public class ProductManagerTest {


    @Test
    public void shouldSearchBy(){

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


        Product [] expected1 = new Product[]{smartPhone1, smartPhone2};
        Product [] actual1 = manager.searchBy("Apple");
        assertArrayEquals(expected1, actual1);

    }




}
