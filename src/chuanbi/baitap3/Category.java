package chuanbi.baitap3;

public class Category {
    int categoryId;
    String categoryName;
    public Category(int categoryId, String categoryName) {
        super();
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    public Category() {

    }
    @Override
    public String toString() {
        return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
    }

}
