package vn.edu.iuh.fit.models;

public class CartItem {
    private Product product; // Sản phẩm được thêm vào giỏ hàng
    private int amount;

    public CartItem() {
    }

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.amount = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int quantity) {
        this.amount = quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "product=" + product +
                ", amount=" + amount +
                '}';
    }
}
