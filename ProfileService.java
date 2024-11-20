@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public UserProfile getProfileById(Long id) {
        return profileRepository.findById(id).orElse(null);
    }

    public UserProfile updateProfile(UserProfile profile) {
        return profileRepository.save(profile);
    }
}
