@RestController
@RequestMapping("/sessions")
public class SessionController {
    @Autowired
    private SessionService sessionService;

    @PostMapping("/schedule")
    public ResponseEntity<Session> scheduleSession(@RequestBody Session session) {
        Session scheduledSession = sessionService.scheduleSession(session);
        return new ResponseEntity<>(scheduledSession, HttpStatus.CREATED);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Session>> getSessionsForUser(@PathVariable Long userId) {
        List<Session> sessions = sessionService.getSessionsForUser(userId);
        return new ResponseEntity<>(sessions, HttpStatus.OK);
    }
}
