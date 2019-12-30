package hw8;

import hw8.lambda.LambdaApp;
import hw8.user.UsersDistribution;
import hw8.movie.FilmsCatalog;

public class AppExecutor {
    public void runProgram() {

        System.out.println("lambdaApp ");
        new LambdaApp().outPhrase();
        System.out.println("\n");

        System.out.println("movieApp ");
        new UsersDistribution().sortUsers();
        System.out.println("\n");

        System.out.println("userApp ");
        new FilmsCatalog().calculateAveragePrice();
        new FilmsCatalog().countFilmForGenre();
        System.out.println("\n");


    }
}
