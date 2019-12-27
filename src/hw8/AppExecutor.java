package hw8;

import hw8.task1.LambdaApp;
import hw8.task2.UsersDistribution;
import hw8.task3.FilmsCatalog;

public class AppExecutor {
    public void runProgram() {

        System.out.println("task/1 ");
        new LambdaApp().outPhrase();
        System.out.println("\n");

        System.out.println("task/2 ");
        new UsersDistribution().sortUsers();
        System.out.println("\n");

        System.out.println("task/3 ");
        new FilmsCatalog().calculateAveragePrice();
        System.out.println("\n");


    }
}
