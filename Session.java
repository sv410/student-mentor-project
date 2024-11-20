@Entity
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long mentorId;
    private Long userId;
    private LocalDateTime sessionTime;

    // Getters and Setters
}
