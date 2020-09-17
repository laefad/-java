package com.company.Current.Pr2;

public class Pr2 {

    public static void main(String[] args) {

        ShapeTest test = new ShapeTest();
        test.test();

        DogKennel dc = new DogKennel(10);
        dc.addDog(new DogKennel.Dog(10, "Jerry"));
        dc.addDog(new DogKennel.Dog(2, "Bob"));
        dc.addDog(new DogKennel.Dog(7, "Garry"));

        dc.printDogs();
    }

    public static class ShapeTest {

        public class Shape {
            private int dots;
            private boolean ellipse;

            public int getNumberOfDots() {
                if (ellipse)
                    throw new Error("An ellipse has an infinite number of points.");
                return dots;
            }

            public boolean isEllipse() {
                return ellipse;
            }

            Shape(boolean ellipse) {
                this.ellipse = ellipse;
                dots = 0;
            }

            Shape(int dots) {
                this.dots = dots;
                ellipse = false;
            }

        }

        public void test()
        {
            Shape triangle = new Shape(3);
            System.out.println("Triangle dots = " + triangle.getNumberOfDots());

            Shape circle = new Shape(true);
            System.out.println("Circle is ellipse? " + circle.isEllipse());
            try
            {
                System.out.println("Circle dots = " + circle.getNumberOfDots());
            }
            catch (Error e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public static class DogKennel {
        public static class Dog {
            private int age;
            private String name;

            public int getAge() {
                return age;
            }

            public int getAgeLikeHuman() {
                return age * 7;
            }

            public void setAge(int age) {
                if (age < 0)
                    throw new Error("The age can't be less than 0");
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            Dog(int age, String name) {
                setAge(age);
                setName(name);
            }

            @Override
            public String toString() {
                return "Dog {" +
                        "age=" + age +
                        ", name='" + name + '\'' +
                        '}';
            }
        }

        private Dog[] dogs;
        private int size;
        private int currentSize = 0;

        public void addDog(Dog dog) {
            if (size == currentSize)
                throw new Error("Вog kennel is full.");

            dogs[currentSize++] = dog;
        }

        public void printDogs()
        {
            System.out.print("Dogs in kennel: ");

            for (int i = 0; i < currentSize; i++)
                System.out.print( (i > 0 ? ", " : "") +
                        dogs[i].getName() + " " + dogs[i].getAge() + " years");

            System.out.println("");
        }

        DogKennel(int size) {
            if (size < 0)
                throw new NegativeArraySizeException();

            this.size = size;
            dogs = new Dog[size];
        }
    }
}
