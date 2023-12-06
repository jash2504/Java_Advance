package Builderpattern;

import java.net.IDN;

public class Shopping {

    private String id;
    private String product_name;
    private String no_item;
    private String price;
    private boolean cornfrim;

    public Shopping(String id) {
        this.id = id;
    }

    public Shopping(String id, String product_name, String no_item, String price, boolean cornfrim) {
        this.id = id;
        this.product_name = product_name;
        this.no_item = no_item;
        this.price = price;
        this.cornfrim = cornfrim;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getNo_item() {
        return no_item;
    }

    public void setNo_item(String No_item) {
        this.no_item = No_item;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isCornfrim() {
        return cornfrim;
    }

    public void setCornfrim(boolean cornfrim) {
        this.cornfrim = cornfrim;
    }

    @Override
    public String toString() {
        return "Shopping{" + "id=" + id + ", Product_name=" + product_name + ", No_item=" + no_item + ", price=" + price + ", cornfrim=" + cornfrim + '}';
    }

}
