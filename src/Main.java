public class Main {
    public static void main(String[] args) {
        byte years = 27;
        if (years >= 18) {
            System.out.println("Если возраст человека равен " + years + ", то он совершеннолетний");
        }   else  {
            System.out.println("Если возраст человека равен " + years + ", то он не достиг совершеннолетия, нужно немного подождать");
        }


        double temp = 2;
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }   else  {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }


        int speed = 49;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }   else  {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }


        int age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else
            if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else
            if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        } else
            if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }


        int ageKid = 18;
        if (ageKid < 5) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то ему нельзя кататься на аттракционе.");
        } else
            if (ageKid >= 5 && ageKid < 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }


        int allPassengers = 80;
        int seatedPassengers = 60;
        int capacity = 102;
        if (allPassengers < capacity) {
            if (allPassengers < seatedPassengers) {
                System.out.println("Есть место в вагоне, сидячие места");
            } else {
                System.out.println("Есть место в вагоне, только стоячие места.");
            }
        } else {
            System.out.println("Вагон полностью забит");
        }


        int one = 18;
        int two = 2;
        int three = 54;
        if (one > two && one > three) {
            System.out.println("Большее число: " + one);
        } else
            if (two > one && two > three) {
            System.out.println("Большее число: " + two);
        } else {
            System.out.println("Большее число: " + three);
        }

    }
}
