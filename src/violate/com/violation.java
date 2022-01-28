package violate.com;
//import com2.ABChotel;
//import com2.*;
//import com2.interfaceSegrigation.*;

public class violation {
    static void del(delivery v){
        v.onWay();
    }
    public static void main(String[] args) {
        AccountService ac=new AccountService();
        ac.openAccount();
       // System.out.println("");
       // kamat r1=new kamat();
        System.out.println("choose restaurant");
        restaurent r2=new restaurent();
        r2.kamatt();
        r2.bawarchii();
        System.out.println("dish prices");

        openClosed o1=new openClosed();
        o1.chi();
        o1.pan();
        delivery d1=new delivery();
        del(new normalDelivery());
        del(new expressDelivery());

        /*
        System.out.println("--ORDER--PLACED--");
        dish(new food());
        System.out.println("--ORDERD--RICE--");
        dish(new rice());
        System.out.println("--ORDERD--ROTI--");
        dish(new roti());*/


    }
}

/*class AccountService{
    //single responsibilty principle
    AccountRepository repo=new AccountRepository();
    NotificationService notify=new NotificationService();
    public void openAccount(){
        System.out.println("fill account details");
        repo.create();
        notify.sendNotification();
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

interface vegrestaurant {
    //interface segregation
    void veg();
}

interface nonvegrestaurant {
    void nonveg();
}

class ABChotel implements vegrestaurant {
    @Override
    public void veg() {
        System.out.println("ABC--choose the items from our veg meals");

    }
}

class XYZhotel implements vegrestaurant, nonvegrestaurant {
    @Override
    public void veg() {
        System.out.println("XYZ--choose the items from our veg meals");

    }

    @Override
    public void nonveg() {
        System.out.println("XYZ--choose the items from our  non veg meals");

    }

}



interface comparator{
    // open for extension
    int compare(int val1, int val2);

}
class Arrayy{
    // no need to modification
    public static void sort(int a[], comparator comp){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(comp.compare(a[i],a[j])>0){//if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
}
class AscComparator implements comparator {
    @Override
    public int compare(int val1,int val2){
        return val1-val2;
    }
}
class DscComparator implements comparator {
    @Override
    public int compare(int val1,int val2){
        return val2-val1;
    }
}

class food{
    public void cook(){
        System.out.println("cooking food");

    }
    public void serve(){
        System.out.println("served the dish");
    }
}
class rice extends food{
    public void cook(){
        System.out.println("cooking food");

    }
    public void serve(){
        System.out.println("served the dish");
    }
}
class roti extends food{
    public void cook(){
        System.out.println("cooking food");


    }
    public void serve(){
        System.out.println("served the dish");
    }
}
*/
