
package com.threeframes.assignment.product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Product {
    

    // Constructors, getters, and setters

    // Example constructor
    public Product(String id, String name, String category, String description, String details) {
    }

	public String getId() {
		
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}
}

class ProductDatabase {
    private Map<String, Product> productMap;

    public ProductDatabase() {
        this.productMap = new HashMap<>();
    }

    public void addProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    public Product getProductById(String productId) {
        return productMap.get(productId);
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(productMap.values());
    }
}

class ProductSearch {
    public static List<Product> searchProducts(ProductDatabase database, String searchTerm) {
        List<Product> searchResults = new ArrayList<>();
        for (Product product : database.getAllProducts()) {
            if (product.getName().toLowerCase().contains(searchTerm.toLowerCase()) ||
                product.getDescription().toLowerCase().contains(searchTerm.toLowerCase()) ||
                product.getCategory().toLowerCase().contains(searchTerm.toLowerCase()) ||
                product.getDetails().toLowerCase().contains(searchTerm.toLowerCase())) {
                searchResults.add(product);
            }
        }
        return searchResults;
    }

    public static void main(String[] args) {
        ProductDatabase productDatabase = new ProductDatabase();

        // Add sample products
        productDatabase.addProduct(new Product("1", "Laptop", "Electronics", "Powerful laptop", "8GB RAM, 256GB SSD"));
        productDatabase.addProduct(new Product("2", "Headphones", "Electronics", "Noise-canceling headphones", "Bluetooth"));

        // Search example
        String searchTerm = "laptop";
        List<Product> searchResults = ProductSearch.searchProducts(productDatabase, searchTerm);

        // Display search results
        for (Product result : searchResults) {
            System.out.println(result.getName() + " - " + result.getDescription());
        }
    }
}



