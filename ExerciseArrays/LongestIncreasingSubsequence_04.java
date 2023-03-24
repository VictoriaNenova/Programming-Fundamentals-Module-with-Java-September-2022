package MoreExerciseArrays;

import java.util.*;


public class LongestIncreasingSubsequence_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[] numsArr = Arrays.stream(scanner.nextLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();

        int maxLength = 0;
        int lastIndex = -1;

        int[] length = new int[numsArr.length];
        int[] prev = new int[numsArr.length];

        for (int i = 0; i < numsArr.length; i++) {
            length[i] = 1;// това е минималната дължина на последователност от елементи която може да има
            prev[i] = -1; //предишния елемент винаги ще започва от -1 , тъй като на инекс 0 няма друго число по-вляво от него

            for (int j = 0; j <= i; j++) {
                if (numsArr[j] < numsArr[i] && length[j] + 1 > length[i]) {
                    length[i] = 1 + length[j];
                    prev[i] = j;
                }
            }
            if (length[i] > maxLength) {
                maxLength = length[i];
                lastIndex = i;
            }
        }
            int[] lis = new int[maxLength]; //longest increasing subsequence (LIS)
            int currentIndex = maxLength - 1;

            while(lastIndex != -1){
                lis[currentIndex] = numsArr[lastIndex];
                currentIndex--;
                lastIndex = prev[lastIndex];
            }
            for (int print = 0; print < lis.length; print++) {
                System.out.print(lis[print] + " ");
            }

    }
}
// По-сложно решение на задачата на този линк:
// https://github.com/Martin-BG/SoftUni-Algorithms-2018/blob/320b404ebaede91e8fa7873c65d02da4c3ac8749/src/_04_dynamic_programming/lab/Pr02LongestIncreasingSubsequents.java