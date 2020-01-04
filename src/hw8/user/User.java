package hw8.user;

import java.time.LocalDate;

public class User {
    private String email;
    private LocalDate loginDate;
    private String team;

    User(String email, LocalDate loginDate, String team) {
        this.email = email;
        this.loginDate = loginDate;
        this.team = team;
    }

    String getEmail() {
        return email;
    }

    LocalDate getLoginDate() {
        return loginDate;
    }

    String getTeam() {
        return team;
    }
}
