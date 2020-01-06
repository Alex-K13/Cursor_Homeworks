package hw8;

import hw8.lambda.GreetingApp;
import hw8.movie.FilmsFilter;
import hw8.user.UsersFilter;

public class AppExecutor {
    public void runProgram() {

        System.out.println("lambdaApp: ");
        new GreetingApp().outPhrase();
        System.out.println("\n");

        System.out.println("userApp:");
        UsersFilter users = new UsersFilter();
        users.buildUsersList();
        users.sortUsers();
        System.out.println("\n");

        System.out.println("movieApp: ");
        FilmsFilter films = new FilmsFilter();
        films.addTwoCollection();
        films.calculateAveragePrice();
        films.countingFilmByGenre();
        System.out.println("\n");


    }
}
