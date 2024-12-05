package lab_10;

class Product {
    int id;

    public Product(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product ID: " + id;
    }
}
