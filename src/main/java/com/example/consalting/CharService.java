package com.example.consalting;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CharacterFrequencyService {

    public List<Char> so(String inputString) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Char> result = frequencyMap.entrySet().stream()
                .map(entry -> new Char(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());

        result.sort((a, b) -> Integer.compare(b.getQuantity(), a.getQuantity()));

        return result;
    }
}
