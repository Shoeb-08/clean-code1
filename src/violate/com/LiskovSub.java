package violate.com;

public class LiskovSub extends delivery{
    public static void main(String[] args) {

    }
}
class delivery{
    int userId;
    String items;
    public void onWay(){
        System.out.println("on way");
    }
}
class normalDelivery extends delivery{
    public void onWay(){
        System.out.println("on way Normal delivery");
    }

}
class expressDelivery extends delivery{
    public void onWay(){

        //System.out.println("on way express delivery");
        throw new RuntimeException("hi");
    }

}
