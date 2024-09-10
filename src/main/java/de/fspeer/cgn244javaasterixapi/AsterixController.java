package de.fspeer.cgn244javaasterixapi;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/asterix/characters")
//@RequiredArgsConstructor
public class AsterixController {

    private final CharacterRepo characterRepo;

    public AsterixController(CharacterRepo characterRepo) {
        this.characterRepo = characterRepo;
    }


    @GetMapping
    public List<Character> getAllCharacters() {
        return characterRepo.findAll();

    }

    @GetMapping("{/id}")
    public Optional<Character> getCharacter(@PathVariable String id) {
        return characterRepo.findById(id);
    }

    @PostMapping
    public Character createCharacter(@RequestBody Character character) {
        return characterRepo.save(character);
    }

    @PutMapping
    public Character updateCharacter(@RequestBody Character character) {
        if (characterRepo.existsById(character.id())){
            return characterRepo.save(character);
        }
        return character;
    }

    @DeleteMapping
    public void deleteCharacter(@RequestBody Character character) {
        characterRepo.deleteById(character.id());
    }
}
