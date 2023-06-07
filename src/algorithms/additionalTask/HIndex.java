package algorithms.additionalTask;

import java.util.Arrays;

/**
 * дан массив целых чисел, где индекс - номер статьи, которую выпустил ученый, а значение - количество цитат этой статьи.
 * h-индекс - индекс цитирования ученого, он определяется по количеству статей и цитат.
 * Если у ученого есть минимум 1 статья с 1 и более цитатами, то индекс равен 1
 * Если у ученого есть минимум 2 статьи с 2 и более цитатами, то индекс равен 2
 * Если у ученого есть минимум 3 статьи с 3 и более цитатами, то индекс равен 3 и тд
 *
 * Необходимо определить h-индекс по данным входящего масссива.
 *
 * пример:
 * [1, 0, 6, 7, 2, 1] - h-индекс равен двум, тк в массиве нет трех чисел больше 3х
 * [19, 5, 5] - h-индекс равен трем, тк в массиве всего 3 числа и все они больше 3х
 * [1, 0, 1, 0, 1, 2] - h-индекс равен 1, тк в массиве всего 1 число больше 1
 */
public class HIndex {




    static int hIndex(int[] articles) {
        int n = articles.length;
        for (int index = 1; index <= n; index++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if(articles[i] >= index) {
                    count++;
                }
            }
            if (count < index)
                return index - 1;
        }
        return n;
    }

    static int hIndexSort(int[] articles) {
        Arrays.sort(articles);

        int n  = articles.length;
        int index = 1;

        for (int i  = n - 1; i >= 0; i--) {
            if (articles[i] < index)
                return index - 1;
        }
        return n;
    }

    static int hIndexSortedSecond(int[] articles) {
        int n  = articles.length;
        int[] count = new int[n+1];

        for (int article : articles) {
            if (article >= n) {
                count[n]++;
            } else {
                count[article]++;
            }
        }

        int pos = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < count[i]; j++) {
                articles[pos] = i;
                pos++;
            }
        }


        int index = 1;

        for (int i  = n - 1; i >= 0; i--) {
            if (articles[i] < index)
                return index - 1;
        }
        return n;
    }

}
