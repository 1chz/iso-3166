package io.github.shirohoo.iso3166;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CountryCodesTests {
    @Test
    void getAlpha2() {
        CountryCodes sut = CountryCodes.KR;

        String actual = sut.getAlpha2();

        assertEquals("KR", actual);
    }

    @Test
    void getAlpha3() {
        CountryCodes sut = CountryCodes.KR;

        String actual = sut.getAlpha3();

        assertEquals("KOR", actual);
    }

    @Test
    void getNumeric() {
        CountryCodes sut = CountryCodes.KR;

        int actual = sut.getNumeric();

        assertEquals(410, actual);
    }

    @Test
    void getNumericLeftPad() {
        CountryCodes sut = CountryCodes.KR;

        String actual = sut.getNumericLeftPad();

        assertEquals("410", actual);
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
