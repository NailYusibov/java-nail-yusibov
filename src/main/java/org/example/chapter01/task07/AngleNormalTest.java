package org.example.chapter01.task07;

// Написать метод для нормализации угла. Метод должен приводить любой угол (в градусах)
// к стандартному диапазону от 0° до 360°. Использовать оператор %

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AngleNormalTest {
    @ParameterizedTest
    @CsvSource({"0,0", "10,10", "360,0", "370,10", "720,0", "-45,315", "725,5"})
    void shouldNormalizeAngle(int numb, int expected) {
        AngleNormal normal = new AngleNormal();

        int result = normal.normalAngle(numb);

        assertEquals(expected, result);
    }
}
