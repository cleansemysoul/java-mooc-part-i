
public class Main {

    public static void main(String[] args) {
        Gift l1 = new Gift("book", 2);
        Gift l2 = new Gift("teddy", 1);
        Gift l3 = new Gift("turnip", 4);
        Package p = new Package();
        p.addGift(l1);
        p.addGift(l2);
        p.addGift(l3);
        System.out.println(p.totalWeight());
    }
}
