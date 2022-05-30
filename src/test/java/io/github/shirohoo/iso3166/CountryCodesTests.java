package io.github.shirohoo.iso3166;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CountryCodesTests {
    @Test
    void getAlpha2() {
        String expected = "KR";
        String actual = CountryCodes.KR.getAlpha2();
        assertEquals(expected, actual);
    }

    @Test
    void getAlpha3() {
        String expected = "KOR";
        String actual = CountryCodes.KR.getAlpha3();
        assertEquals(expected, actual);
    }

    @Test
    void getNumeric() {
        int expected = 410;
        int actual = CountryCodes.KR.getNumeric();
        assertEquals(expected, actual);
    }

    @Test
    void getNumericLeftPad() {
        String expected = "410";
        String actual = CountryCodes.KR.getNumericLeftPad();
        assertEquals(expected, actual);
    }

    @Test
    void getByIntCode() {
        Optional<CountryCodes> actual = CountryCodes.getByCode(410);
        assertTrue(actual.isPresent());
    }

    @Test
    void getByStringCode() {
        Optional<CountryCodes> actual = CountryCodes.getByCode("KOR");
        assertTrue(actual.isPresent());
    }
}
