@Service
public class SessionService {
    @Autowired
    private SessionRepository sessionRepository;

    public Session scheduleSession(Session session) {
        return sessionRepository.save(session);
    }

    public List<Session> getSessionsForUser(Long userId) {
        return sessionRepository.findByUserId(userId);
    }
}
