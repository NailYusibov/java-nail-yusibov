package org.example.chapter01.task07;

// Написать метод для нормализации угла. Метод должен приводить любой угол (в градусах)
// к стандартному диапазону от 0° до 360°. Использовать оператор %

public class AngleNormal {
    private static final int FULL_CIRCULAR = 360;

    public int normalAngle(int angle) {
        int normalized = angle % FULL_CIRCULAR;
        if (normalized < 0) {
            normalized += FULL_CIRCULAR;
        }
        return normalized;
    }
}
