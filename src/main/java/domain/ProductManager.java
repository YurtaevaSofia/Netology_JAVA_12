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
            if(matches(item, text)){
                numberOfItemsFound++;
            }
        }
        Product [] searchResult = new Product[numberOfItemsFound];
        int i = 0;
        for (Product item : items){
            if(matches(item, text)){
                searchResult[i] = item;
                i++;
            }
        }
      return searchResult;
    }

    public boolean matches(Product product, String search) {
        if (product instanceof Book) {
            Book book = (Book) product;
            if (book.getName().equalsIgnoreCase(search)) {
                return true;
            }
            if (book.getAuthor().equalsIgnoreCase(search)) {
                return true;
            }
        }
        if (product instanceof Smartphone) {
            Smartphone smartphone = (Smartphone) product;
            if (smartphone.getName().equalsIgnoreCase(search)) {
                return true;
            }
            if (smartphone.getManufacturer().equalsIgnoreCase(search)) {
                return true;
            }
        }
        return false;
    }
}

