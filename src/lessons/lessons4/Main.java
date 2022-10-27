package lessons.lessons4;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Tom", 5);
        String[] name = new String[10];
        int[] age = new int[10];
        int value = 10;
        while (value > 0) {
            value--;
            Cat defaultCat = new Cat();
            String defaultCatName = defaultCat.getName();
            int defaultCatAge = defaultCat.getAge();
            System.out.println(defaultCatName + defaultCatAge);
        }
        for (value = 0; value < 10; value++) ;
        {
            Cat defaultCat = new Cat();
            String defaultCatName = defaultCat.getName();
            int defaultCatAge = defaultCat.getAge();
            System.out.println(defaultCatName + defaultCatAge);

        }
            Cat defaultCat = new Cat();
            String defaultCatName = defaultCat.getName();
             int defaultCatAge = defaultCat.getAge();
        do {
            System.out.println(defaultCatName + defaultCatAge);}
            while (true) ;
        }
    }





