package violate.com;

public class openClosed extends foodd{
    public static void main(String[] args) {

    }
}
/*
interface foodType{
    public int price();
}*/
class paneer {
    int cost;
    public int price(){
        return 150;
    }
}
class chicken {
    int cost;
    public int price(){
        return 250;
    }
}
class foodd{
    paneer p1=new paneer();
    chicken c1=new chicken();
    public void chi(){
        System.out.println("chicken "+c1.price());
    }
    public void pan(){
        System.out.println("paneer "+ p1.price());
    }
}
/*interface comparator{
    // open for extension
    int compare(int val1, int val2);

}
class Arrayy{
    // no need to modification

   /* public static void sort(int a[], comparator comp){
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
}*/
/*class AscComparator implements comparator {
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
*/