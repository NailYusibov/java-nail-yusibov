package org.example.chapter01.task07;

// Написать метод для нормализации угла. Метод должен приводить любой угол (в градусах)
// к стандартному диапазону от 0° до 360°. Использовать оператор %

public class AngleNormal {
    public int normalAngle(int angle) {
        int normalized = angle % 360;
        if (normalized < 0) {
            normalized += 360;
        }
        return normalized;
    }
}
