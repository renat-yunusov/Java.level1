package lesson_6;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("dog1", 500, 0.5, 10);
        Dog dog2 = new Dog();
        dog2.run = 1000;
        dog2.jump = 3;
        dog2.swim = 100;
        dog2.name = "Monster DOG";

	    Cat cat1 = new Cat();
	    cat1.name = "cat1";

	    Cat cat2 = new Cat();
	    cat2.swim = 7;
	    cat2.name = "Kitty";

	    Cat cat3 = new Cat("cat3", 500, 7);

	    dog1.run(600);
	    cat1.swim(5);
	    cat2.swim(5);
	    dog2.run(950);
	    dog2.swim(50);
	    dog2.jump(10);
	    cat3.swim(5);
    }
}
