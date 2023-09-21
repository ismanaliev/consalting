package com.example.consalting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/char")
public class CharacterFrequencyController {
    private final CharService characterFrequencyService;

    @Autowired
    public CharacterFrequencyController(CharService characterFrequencyService) {
        this.characterFrequencyService = characterFrequencyService;
    }

    @GetMapping
    public ResponseEntity<List<Char>> getCharacterFrequency(@RequestParam String inputString) {
        List<Char> result = characterFrequencyService.method(inputString);
        return ResponseEntity.ok(result);
    }
}
