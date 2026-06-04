public class store {
    void sope(int money){
        System.out.println(money);
        System.out.println("sope purchase");
    }    
    void chocolate(int money)

    {
        System.out.println(money);
        System.out.println("chocolate purchase");

    }
    public static void main(String[] args){
         
        store obj1=new store();
        obj1.sope(20);
        obj1.chocolate(10);
    }
}
