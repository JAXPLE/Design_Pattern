import A_Singleton.Singleton;
import B_Factory.Coffee;
import B_Factory.CoffeeFactory;
import A_Singleton.Singleton;
import C_Strategy.Item;
import C_Strategy.KakaoCard;
import C_Strategy.KbCard;
import C_Strategy.ShoppingCart;
import D_Observer.JwonLEE;
import D_Observer.Owner;
import D_Observer.SuckHyn;

public class Main {
    public static void main(String[] args) {
//        SingleTone
        System.out.println("\n\n\nSingleTone");
        Singleton singletonA = Singleton.getInstance();
        Singleton singletonB = Singleton.getInstance();

        System.out.println("singleToneA " + singletonA.hashCode());
        System.out.println("singleToneB " + singletonB.hashCode());


//        Factory
        System.out.println("\n\n\nFactory");
        Coffee latte = CoffeeFactory.getCoffee("Latte",4000);
        Coffee americano = CoffeeFactory.getCoffee("Americano", 3000);

        System.out.println("Latte : " + latte);
        System.out.println("Americano : " + americano);


//        Strategy
        System.out.println("\n\n\nStrategy");
        ShoppingCart cart = new ShoppingCart();

        Item apple = new Item("사과",2000);
        Item pineApple = new Item("파인애플",5000);

        cart.addItem(apple);
        cart.addItem(pineApple);

        cart.pay(new KakaoCard("이재원","카드번호","456","1/1"));
        cart.pay(new KbCard("이재원","카드번호","456","1/1"));


//        Observer
        System.out.println("\n\n\nObserver");
        Owner owner = new Owner();

        JwonLEE jwonLEE = new JwonLEE();
        SuckHyn suckHyn = new SuckHyn();

        owner.register(jwonLEE);
        owner.register(suckHyn);

        owner.notifyCrew("테스트");
    }
}