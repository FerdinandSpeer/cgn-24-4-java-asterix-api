package de.fspeer.cgn244javaasterixapi;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
