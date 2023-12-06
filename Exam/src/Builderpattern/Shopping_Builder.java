package Builderpattern;

public class Shopping_Builder {

    private String id;
    private String product_name = "None";
    private String no_item = "0";
    private String price = "0";
    private boolean cornfrim = false;

    public Shopping_Builder with_id(String id) {
        this.id = id;
        return this;
    }

    public Shopping_Builder P_name(String product_name) {
        this.product_name = product_name;
        return this;
    }

    public Shopping_Builder No_item(String no_item) {
        this.no_item = no_item;
        return this;
    }

    public Shopping_Builder Price(String price) {
        this.price = price;
        return this;
    }

    public Shopping_Builder Cornfirm(boolean cornfirm) {
        this.cornfrim = cornfirm;
        return this;
    }

    public Shopping build() {
        return new Shopping(id, product_name, no_item, price, cornfrim);
    }
}
