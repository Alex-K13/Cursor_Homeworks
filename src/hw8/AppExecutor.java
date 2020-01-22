package hw8;

import hw8.lambda.GreetingApp;
import hw8.movie.FilmsFilter;
import hw8.user.UsersFilter;

public class AppExecutor {
    public void runProgram() {

        System.out.println("lambdaApp ");
        new GreetingApp().outPhrase();
        System.out.println("\n");

        System.out.println("movieApp ");
        new UsersFilter().sortUsers();
        System.out.println("\n");

        System.out.println("userApp ");
        new FilmsFilter().calculateAveragePrice();
        new FilmsFilter().countFilmForGenre();
        System.out.println("\n");


    }
}
