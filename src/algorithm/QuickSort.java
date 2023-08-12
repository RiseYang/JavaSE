package algorithm;

import java.util.Arrays;

/**
 * array:被排序的算法  begin:初始位置  end：结束位置
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 6, 9, 2, 5, 3, 7, 4, 8};
        //调用快速排序算法
        quick(arr, 0, arr.length - 1);
        //打印排序的后结果，查看是否正确
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 快速排序算法
     *
     * @param arr   被排序的算法
     * @param begin 快速排序的起始位置
     * @param end   快速排序的结束位置
     */
    public static void quick(int[] arr, int begin, int end) {
        //如果开始位置和结束位置重合，实际上就是一个数字，所以开始位置一定要比结束位置小，而且不能相等
        if (begin < end) {//开始的数小于结束的数
            int stand = arr[begin]; //定义数组开始在的位置
            //开始位置
            int low = begin;
            //结束位置
            int high = end;

            while (low < high) {//while循环当low低位数小于high高位数时
                //从结束位置开始所有的数据都比stand数据要大，向中间位置移动 结束high
                while (low < high && arr[high] > stand) {
                    high--;
                }
                //将结束high位置数据复制到开始start位置
                arr[low] = arr[high];
                //从开始start位置开始所有的数据都比stand数据要小，向中间位置移动 开始low
                while (low < high && arr[low] < stand) {
                    low++;
                }

                //将开始start位置数据复制到high位置
                arr[high] = arr[low];
            }
            //中间位置找到
            arr[low] = stand;

            quick(arr, begin, low);

            quick(arr, low + 1, end);
        }
    }
}
