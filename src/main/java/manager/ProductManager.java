package manager;

import domain.Product;
import repository.ProductRepository;

public class ProductManager {
    private ProductRepository repository;

//    public ProductManager() {
//    }

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    public void add(Product item){
        repository.save(item);
    }

    public Product[] searchBy(String text) {
        Product [] items = repository.findAll();
        int numberOfItemsFound = 0;

        Product [] searchResult = new Product[numberOfItemsFound];
        int i = 0;
        for (Product item : items){
            if(item.matches(text)){
                numberOfItemsFound++;
                Product [] tmp = new Product[numberOfItemsFound];
                System.arraycopy(searchResult, 0, tmp, 0, searchResult.length);
                searchResult = tmp;
                searchResult[i] = item;
                i++;

            }
        }
      return searchResult;
    }


}

