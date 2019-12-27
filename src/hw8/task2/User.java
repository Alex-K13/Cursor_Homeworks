package hw8.task2;

import java.time.LocalDate;

public class User {
    private String email;
    private LocalDate loginDate;
    private String team;

    String getEmail() {
        return email;
    }

    LocalDate getLoginDate() {
        return loginDate;
    }

    String getTeam() {
        return team;
    }

    public User(String email, LocalDate loginDate, String team) {
        this.email = email;
        this.loginDate = loginDate;
        this.team = team;
    }
}
