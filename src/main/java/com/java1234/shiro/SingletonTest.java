package com.java1234.shiro;

public class SingletonTest {

    /*
     * public static void main(String[] args) { int[] arr = new int[] { 5, 4, 7,
     * 1, 6, 2 }; bubbleSort(arr); }
     * 
     * private static void bubbleSort(int[] arr) {
     * System.out.println("����ʼ..."); for (int i = 0; i < arr.length - 1; i++) {
     * for (int j = i + 1; j < arr.length; j++) { if (arr[i] > arr[j]) { int
     * temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; } } }
     * System.out.println("�������"); for (int i = 0; i < arr.length; i++) {
     * System.out.println(arr[i]); } }
     */

    /*
     * public static void main(String[] args) { int[] arr = new int[] { 5, 4, 7,
     * 1, 6, 2 }; selectSort(arr); for (int i = 0; i < arr.length; i++) {
     * System.out.println(arr[i]); } }
     * 
     * public static void selectSort(int[] arr) { for (int i = 0; i < arr.length
     * - 1; i++) { int min = i;//
     * ÿһ��ѭ���Ƚ�ʱ��min���ڴ�Ž�СԪ�ص������±꣬������ǰ���αȽ�������մ�ŵľ��Ǵ�������С��Ԫ�ص��±꣬����ÿ��������СԪ�ض�Ҫ���н�����
     * for (int j = i + 1; j < arr.length; j++) { if (arr[j] < arr[min]) { min =
     * j; } } // ���н��������min�����仯������н��� if (min != i) { swap(arr, min, i); } } }
     * 
     * public static void swap(int[] arr, int a, int b) { arr[a] = arr[a] +
     * arr[b]; arr[b] = arr[a] - arr[b]; arr[a] = arr[a] - arr[b]; }
     */

    /*
     * public static void main(String[] args) { Thread t = new Thread() { public
     * void run() { pong(); } }; t.run(); System.out.println("World"); }
     * 
     * public static void pong() { System.out.println("Hello"); }
     */

    public static void main(String[] args) {
        /*
         * String a = "My"; String b = "My"; String c = new String("My"); String
         * d = new String("My"); System.out.println(a.equals(b));
         * System.out.println(a == c); System.out.println(c.equals(d));
         * System.out.println(d == b);
         */
        System.out.println(5 & 7);
    }
}
