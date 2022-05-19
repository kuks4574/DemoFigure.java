package com.company;

public class Main {

    public static void main(String[] args) {
        //  int c = 123;
//        System.out.println("Hello");
//


//       for (int i = 1; i < 10; i++) {
//           if (i == 5)
//               break;
//          System.out.println("Произведение I = " + i);
//       }


//        for (int i = 1; i < 10; i++) {
//            if (i == 5)
//                continue;
//            System.out.println("Произведение I = " + i);
//        }


        // Бесконечный цикл
        //for(;;) {
        // }


//            int n = 10;
//            for (int f = 5, k = n * 2; f < 2; f++, n++ ;
//            k = n * 2){
//            System.out.println(k * f);
//        }


//        int j = 4;
//                do {
//                    System.out.println(j);
//                    j--;
//                } while (j > 0);


        int nums[];
        int[] nums2;
        nums2 = new int[4];
        nums2[0] = 1;
        nums2[1] = 2;
        nums2[2] = 3;
        nums2[3] = 4;

        System.out.println(nums2[0]);

        int[] num3 = new int[]{1, 2, 3, 4};
        int[] num4 = {1, 2, 3, 4};
        System.out.println(num3 == num4);

        int last = nums2[nums2.length - 1];
        System.out.println(last);

        int[][] nums22 = {{1, 2, 3}, {3, 3, 5}};


//        public class ForEachEx {
        int[] numser = new int[]{1, 2, 3, 4, 7};
//        for(int i  : num33) {
//                System.out.println("Элементы " + i);

        for (int i = 0; i < numser.length; i++) {
            System.out.println(numser[i]);

        }
//        int[] num44 = new int[]{1, 2, 3, 4, 7};
//        for (int i : num44) {
//            System.out.println(num44[i]);
//        }


        // ПЕРЕБОР МАССИВА
        int [][] numa = new int [][]{{3,2,3}, {2,5,4}, {6,4,5}};

        for (int j = 0; j < numa.length - 1; j++) {
            System.out.println(numa[j]);
            for (int k = 0; k < numa.length; k++) {
                System.out.println(numa[j][k]);
            }
            }
        }



    }
