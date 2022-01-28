package violate.com;

public class interfaceSeg extends restaurent {
    public static void main(String[] args) {

    }
}
interface rest{
    void veg();
    void nonveg();
}
/*interface vegrestaurant {
    //interface segregation
    void veg();
}

interface nonvegrestaurant {
    void nonveg();
}*/

class kamat implements rest{
    @Override
    public void veg() {
        System.out.println("KAMAT--choose the items from our veg meals");

    }
    @Override
    public void nonveg() {
        System.out.println("Kamat--we have no  non veg meals");

    }
}
class bawarchi implements rest{
    @Override
    public void veg() {
        System.out.println("BAWARCHI--choose the items from our veg meals");

    }

    @Override
    public void nonveg() {
        System.out.println("BAWARCHI--choose the items from our  non veg meals");

    }
}
class restaurent{
    kamat k=new kamat();
    bawarchi b=new bawarchi();

    public void kamatt(){
        k.veg();

    }
    public void bawarchii(){
        b.nonveg();
        b.veg();
    }

}