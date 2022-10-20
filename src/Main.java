import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Person.setAge(10);
        Person.setIsMale(true);
        Person.setMoney(100);
        Person.setName("Ivan");
        Person.setNumber((short) 1234);
        Person.setHouse((byte) 23);
        Person.setFloor((char) 7);
        Person.setRandom(4.4);
        Person.setDistance(123456789);



        int age = Person.getAge();
        age += 10;
        Person.setAge(age);
        System.out.println(age);

        boolean isMale=Person.getIsMale();
        isMale=false;
        Person.setIsMale(isMale);
        System.out.println(isMale);

        float money=Person.getMoney();
        money+=50;
        Person.setMoney(money);
        System.out.println(money);

        String name = Person.getName();
        name = name + " 123 " ;
        Person.setName(name);
        System.out.println(name);

        short number=Person.getNumber();
        number = (short)(number + (short) 12);
        Person.setNumber(number);
        System.out.println(number);

        byte house=Person.getHouse();
        house=(byte)(house+ (byte) 13);
        Person.setHouse(house);
        System.out.println(house);

        char floor=Person.getFloor();
        floor=(char)(floor+(char) 19);
        Person.setFloor(floor);
        System.out.println((int)floor);

        double random=Person.getRandom();
        random=(double)(random+(double) + 0.1);
        Person.setRandom(random);
        System.out.println(random);

        long distance=Person.getDistance();
        distance=(long)(distance+(long) 987654321);
        Person.setDistance(distance);
        System.out.println(distance);





    }
}
