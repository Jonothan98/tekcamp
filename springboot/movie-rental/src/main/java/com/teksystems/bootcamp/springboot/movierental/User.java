@Entity
public class User {
    @Id
    private Long id;
    private String firstName;
    private int age;
    private String email;

    // getters and setters

    @NotNull(message = "First Name cannot be null")
    private String firstName;

    @Min(value = 15, message = "Age should not be less than 15")
    @Max(value = 65, message = "Age should not be greater than 65")
    private int age;
}