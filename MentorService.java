@Service
public class MentorService {
    @Autowired
    private MentorRepository mentorRepository;

    public List<Mentor> searchMentors(String query) {
        return mentorRepository.findByNameContaining(query);
    }
}
