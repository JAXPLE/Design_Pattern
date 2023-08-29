package C_Strategy;

public class KakaoCard implements Payment{
    private String name;
    private String number;
    private String cvv;
    private String dateOfExpiry;

    public KakaoCard(String name, String number, String cvv, String dateOfExpiry) {
        this.name = name;
        this.number = number;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using KakaoCard");
    }
}
