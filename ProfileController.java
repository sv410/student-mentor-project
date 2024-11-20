@RestController
@RequestMapping("/profiles")
public class ProfileController {
    @Autowired
    private ProfileService profileService;

    @GetMapping("/{id}")
    public ResponseEntity<UserProfile> getProfile(@PathVariable Long id) {
        UserProfile profile = profileService.getProfileById(id);
        return new ResponseEntity<>(profile, HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<UserProfile> updateProfile(@RequestBody UserProfile profile) {
        UserProfile updatedProfile = profileService.updateProfile(profile);
        return new ResponseEntity<>(updatedProfile, HttpStatus.OK);
    }
}
