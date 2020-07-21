package domain;

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
        for (Product item : items){
            if(item.matches(text)){
                numberOfItemsFound++;
            }
        }
        Product [] searchResult = new Product[numberOfItemsFound];
        int i = 0;
        for (Product item : items){
            if(item.matches(text)){
                searchResult[i] = item;
                i++;
            }
        }
      return searchResult;
    }


}

