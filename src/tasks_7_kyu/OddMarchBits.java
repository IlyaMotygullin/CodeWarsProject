package tasks_7_kyu;

/*
Нечетные биты готовятся к битным битвам.

Поэтому n биты перемещаются справа налево по 8 траектории битов. Как только
наиболее значимый бит достигает левого края, их марш завершен.
Каждый шаг будет сохранен в виде массива 8 целых чисел.

Возвращает массив всех шагов.

1 <= n <= 8

ПРИМЕЧАНИЕ: n != 0, потому что n представляет собой число 1.
 */


import java.util.Arrays;

public class OddMarchBits {
    public static void main(String[] args) {

    }
    public static int[][] BitMarch(int n) {
        var array = new int[9 - n][8];
        for (var i = 0; i < array.length; i++) {
            Arrays.fill(array[i], 8 - i - n, 8 - i, 1);
        }
        return array;
    }
}
