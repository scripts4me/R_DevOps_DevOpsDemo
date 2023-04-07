package ch.zhaw.iwi.devops.fizzbuzz;

public class FizzBuzzConverter {

    public String convert(int i) {
        if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i % 100 == 0) {
            return "FizzBuzzUltraMegaGiga";
        } else if  (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
            return "FizzBuzzUltraMega";
        } else if (i % 3 == 0 && i % 7 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 7 == 0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }

}
