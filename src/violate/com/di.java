package violate.com;

public class di extends customerBusinessLogic{
    public static void main(String[] args){

    }
}

interface icustomerDataAccess {
    String getName(int id);
}
class customerDataAccess implements icustomerDataAccess{
    public customerDataAccess(){

    }
    public String getName(int id){
        return "Raju";
    }
}
class DataAccessFactory{
    public static icustomerDataAccess getCustomerDataAccessObj(){
        return new customerDataAccess();
    }

}
class customerBusinessLogic{
    icustomerDataAccess cda;
    public  customerBusinessLogic(){
        cda=DataAccessFactory.getCustomerDataAccessObj();
    }
    public String getName(int id){
        return cda.getName(id);
    }
}

/*
interface hotel{
    void seeReviews();
    void seeRating();
}
class foodQuality() implements hotel{
    @Override
    public void seeReviews() {
        System.out.println("good food");

    }

    @Override
    public void seeRating() {
        System.out.println("5 star taste");
    }
}
class serviceQuality() implements hotel{
    @Override
    public void seeReviews() {
        System.out.println("late service");

    }

    @Override
    public void seeRating() {
        System.out.println("3 star servicing");
    }

}
class review{
    hotel h;
}*/