package violate.com;

public class AccountService{
    //single responsibilty principle
    AccountRepository repo=new AccountRepository();
    NotificationService notify=new NotificationService();
    public void openAccount(){
        System.out.println("fill account details");
        repo.create();
        notify.sendNotification();
    }

    public static void main(String[] args) {

    }
}

class AccountRepository{
    public void create(){
        System.out.println("store account obj in db");
    }
}
class NotificationService{
    public void sendNotification(){
        System.out.println("Notify");
    }

}