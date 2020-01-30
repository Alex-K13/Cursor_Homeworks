package hw8.controller;

import hw8.lambda.GreetingApp;
import hw8.movie.FilmsFilter;
import hw8.user.UsersFilter;

public class AppExecutor {
    public void runProgram() {

        System.out.println("App of output greeting: ");
        new GreetingApp().outPhrase();
        System.out.println("\n");

        System.out.println("user App:");
        UsersFilter users = new UsersFilter();
        users.buildUsersList();
        users.sortUsers();
        System.out.println("\n");

        System.out.println("movie App: ");
        FilmsFilter films = new FilmsFilter();
        films.addTwoCollection();
        films.calculateAveragePrice();
        films.countingFilmByGenre();
        System.out.println("\n");


    }
}
