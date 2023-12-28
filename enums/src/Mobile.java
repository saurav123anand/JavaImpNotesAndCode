public enum Mobile {
    SAMSUNG(400), // calling constructor
    MOTOROLA(600),
    IPHONE(890);

    int price;
    Mobile(int price) {
        this.price=price;
    }
    int getPrice(){
        return price;
    }
}
