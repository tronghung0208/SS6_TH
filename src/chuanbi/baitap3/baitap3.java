package chuanbi.baitap3;

public class baitap3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Category category1=new Category(1,"Iphone");
        Category category2=new Category(2,"Cart");

        Product product1=new Product(1, "iphone13", 10, category1);
        Product product2=new Product(2,"iphone14",15,category1);
        Product product3=new Product(3, "Vin", 2000, category2);
        Product product4=new Product(3,"Mec", 12000, category2);


        System.out.println(category1.toString());
        System.out.println(category2.toString());
        System.out.println("-------------------");
        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());
        System.out.println(product4.toString());



    }

}
