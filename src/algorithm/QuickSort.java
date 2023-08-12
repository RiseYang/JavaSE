package algorithm;

import java.util.Arrays;

/**
 * array:��������㷨  begin:��ʼλ��  end������λ��
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 6, 9, 2, 5, 3, 7, 4, 8};
        //���ÿ��������㷨
        quick(arr, 0, arr.length - 1);
        //��ӡ����ĺ������鿴�Ƿ���ȷ
        System.out.println(Arrays.toString(arr));
    }

    /**
     * ���������㷨
     *
     * @param arr   ��������㷨
     * @param begin �����������ʼλ��
     * @param end   ��������Ľ���λ��
     */
    public static void quick(int[] arr, int begin, int end) {
        //�����ʼλ�úͽ���λ���غϣ�ʵ���Ͼ���һ�����֣����Կ�ʼλ��һ��Ҫ�Ƚ���λ��С�����Ҳ������
        if (begin < end) {//��ʼ����С�ڽ�������
            int stand = arr[begin]; //�������鿪ʼ�ڵ�λ��
            //��ʼλ��
            int low = begin;
            //����λ��
            int high = end;

            while (low < high) {//whileѭ����low��λ��С��high��λ��ʱ
                //�ӽ���λ�ÿ�ʼ���е����ݶ���stand����Ҫ�����м�λ���ƶ� ����high
                while (low < high && arr[high] > stand) {
                    high--;
                }
                //������highλ�����ݸ��Ƶ���ʼstartλ��
                arr[low] = arr[high];
                //�ӿ�ʼstartλ�ÿ�ʼ���е����ݶ���stand����ҪС�����м�λ���ƶ� ��ʼlow
                while (low < high && arr[low] < stand) {
                    low++;
                }

                //����ʼstartλ�����ݸ��Ƶ�highλ��
                arr[high] = arr[low];
            }
            //�м�λ���ҵ�
            arr[low] = stand;

            quick(arr, begin, low);

            quick(arr, low + 1, end);
        }
    }
}
