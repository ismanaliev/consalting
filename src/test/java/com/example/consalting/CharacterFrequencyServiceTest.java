package com.example.consalting;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterFrequencyServiceTest {

    @Test
    public void testCalculateCharacterFrequency() {
        CharacterFrequencyService service = new CharacterFrequencyService();
        String inputString = "aaaaabcccc";

        List<CharacterFrequency> result = service.calculateCharacterFrequency(inputString);

        // Проверяем, что результат не пустой
        assertNotNull(result);
        // Проверяем, что символ 'a' имеет частоту 5
        assertEquals(5, result.get(0).getFrequency());
        // Проверяем, что символ 'c' имеет частоту 4
        assertEquals(4, result.get(1).getFrequency());
        // Проверяем, что символ 'b' имеет частоту 1
        assertEquals(1, result.get(2).getFrequency());
    }
}
