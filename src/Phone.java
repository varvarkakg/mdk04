import java.util.Arrays;

public class Phone {
    String number;
    String model;
    double weight;

   Phone(String n, String m, double w) {
       this(n, m);
       weight = w;
   }
   Phone(String n, String m) {
       number = n;
       model = m;

    }
    Phone(){

    }
    void reciveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void reciveCall(String name,String number) {
        System.out.println("Звонит " + name + " с номером " + number);
        System.out.println("Мой телефон " + this.number);
    }

    String getNumber(){
        return number;
    }

    void sendMassege(String massege, String... numbers) {
        System.out.println("Сообщение " +massege + " было отправленно:");
        System.out.println(Arrays.toString(numbers));

    }
}

