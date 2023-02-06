public class Phonedemo {
    public static void main(String[] args) {
        Phone phone1=new Phone("89111111111","Apple", 3.2 );
        Phone phone2=new Phone("89112111112", "Samsung");
        Phone phone3=new Phone();

        //phone2.weight = 3.3;

        //phone3.number = "89111131113";
        //phone3.model = "Samsung";
        //phone3.weight = 3;

        System.out.println(phone1.getNumber());
        System.out.println(phone1.model);
        System.out.println(phone1.weight);
        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.model);
        System.out.println(phone2.weight);
        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.model);
        System.out.println(phone3.weight);
        System.out.println();

        phone1.reciveCall("Кирилл");
        phone2.reciveCall("Екатерина");
        phone2.reciveCall("Мария", "89111111611");
        phone3.reciveCall("Захар");

        phone1.sendMassege("Привет","7466464738");
        phone2.sendMassege("Hello", "8373654564");
    }
}
