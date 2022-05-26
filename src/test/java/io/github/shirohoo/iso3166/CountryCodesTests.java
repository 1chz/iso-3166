package io.github.shirohoo.iso3166;

import io.github.shirohoo.iso3166.CountryCodes;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CountryCodesTests {
    @Test
    void getAlpha2() {
        String actual = CountryCodes.KR.getAlpha2();
        String expected = "KR";
        assertEquals(expected, actual);
    }

    @Test
    void getAlpha3() {
        String actual = CountryCodes.KR.getAlpha3();
        String expected = "KOR";
        assertEquals(expected, actual);
    }

    @Test
    void getNumeric() {
        int actual = CountryCodes.KR.getNumeric();
        int expected = 410;
        assertEquals(expected, actual);
    }

    @Test
    void getNumericLeftPad() {
        String actual = CountryCodes.KR.getNumericLeftPad();
        String expected = "410";
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
