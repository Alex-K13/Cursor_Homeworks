package hw8.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsersFilter {

    private final static LocalDate today = LocalDate.of(2019, 12, 26);
    List<User> users = new ArrayList<>();

    private List<User> buildUsersList() {
        users.add(new User("victorvold@ukr.net", LocalDate.of(2019, 11, 2), "Green"));
        users.add(new User("petrfirst@ukr.net", LocalDate.of(2019, 11, 4), "Orange"));
        users.add(new User("makslichman@ukr.net", LocalDate.of(2019, 12, 25), "Green"));
        users.add(new User("kingofkyiv@gmail.com", LocalDate.of(2019, 12, 20), "Blue"));
        users.add(new User("valera@gmail.com", LocalDate.of(2019, 11, 15), "Orange"));
        users.add(new User("yulia@gmail.com", LocalDate.of(2019, 12, 8), "Green"));
        users.add(new User("dmitriy@ukr.net", LocalDate.of(2019, 12, 11), "Blue"));
        return users;
    }

    public void sortUsers() {
        buildUsersList();
        Map<String, List<String>> usersList = users.stream()
                .filter(user -> user.getLoginDate().isBefore(today.minusWeeks(1)))
                .collect(Collectors.groupingBy(User::getTeam,
                        Collectors.mapping(User::getEmail, Collectors.toList())));

        usersList.forEach((team, email) -> System.out.println(team + " team: " + email));
    }
}
