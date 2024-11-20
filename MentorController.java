@RestController
@RequestMapping("/mentors")
public class MentorController {
    @Autowired
    private MentorService mentorService;

    @GetMapping("/search")
    public ResponseEntity<List<Mentor>> searchMentors(@RequestParam String query) {
        List<Mentor> mentors = mentorService.searchMentors(query);
        return new ResponseEntity<>(mentors, HttpStatus.OK);
    }
}
