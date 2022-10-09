import java.util.Scanner;

import java.text.DecimalFormat;

public class Chengxu1 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        double arr2[] = new double[6];
        for (int q = 0; q < 6; q++) {
            Scanner my = new Scanner(System.in);
//            System.out.println("请输入一共有多少项数据");
//            int n = my.nextInt();
            double arr1[] = new double[12];

            for (int i = 0;i< arr1.length;i++){
                System.out.println("请输入第"+(q+1)+"行第"+(i+1)+"列数据");
                arr1[i] = my.nextDouble();
            }

            for (int j = 0; j < arr1.length-1; j++) {
                for (int k = 0; k < arr1.length-1-j; k++) {
                    if (arr1[k]>arr1[k+1]){
                        double temp = 0;
                        temp = arr1[k+1];
                        arr1[k+1] = arr1[k];
                        arr1[k] = temp;
                    }

                }

            }

            double sum = 0;
            for (int m = 1; m <arr1.length-1 ; m++) {
                sum +=arr1[m];

            }
            double aver = sum/(arr1.length-2);
            System.out.println("aver:"+df.format(aver));



            double b = 3.60;

            double c = Math.pow(aver,b);

            System.out.println("平均数"+aver+"的3.60次方："+c);

            double f2il = 6.34*0.00001*c;
            System.out.println("f2il:"+df.format(f2il));



            arr2[q] = f2il;

        }
        System.out.println("==============");
        System.out.println("未排序前各行f2il的值");
        for (int w = 0;w< arr2.length;w++){
            System.out.println("第"+(w+1)+"个f2il"+df.format(arr2[w]));
        }
        System.out.println("==============");

        double sum1 = 0;
        for (int e = 0;e< arr2.length;e++){
            sum1 +=arr2[e];
        }

        df = new DecimalFormat("0.0");
        double aver2 = sum1/ (double)arr2.length;
        System.out.println("aver2:"+aver2);
        df = new DecimalFormat("0.0");



        double biaozcha = Math.sqrt(((arr2[0]-aver2)*(arr2[0]-aver2)+(arr2[1]-aver2)*(arr2[1]-aver2)+(arr2[2]-aver2)*(arr2[2]-aver2)+(arr2[3]-aver2)*(arr2[3]-aver2)+(arr2[4]-aver2)*(arr2[4]-aver2)+(arr2[5]-aver2)*(arr2[5]-aver2))/6);
        double min = arr2[0];
        for (int r = 1;r< arr2.length;r++){
            if (min>arr2[r]){
                double fmin = 0;
                fmin = min;
                min = arr2[r];
                arr2[r] = fmin;
            }

        }

        System.out.println();
        df = new DecimalFormat("0.00");
        System.out.println("biaozcha:"+df.format(biaozcha));
        df = new DecimalFormat("0.0");

        System.out.println("min:"+df.format(min));
        System.out.println("==============");

        double f21 = 0.91*aver2;
        double f22 = 1.18*min;

        System.out.println("f21:"+df.format(f21));
        System.out.println("f22:"+df.format(f22));



        System.out.println("==============");
        if (f21<f22){

            System.out.println("f21和f22中较小值为f21:"+df.format(f21));

        }else{
            System.out.println("f21和f22中较小值为f22:"+df.format(f22));
        }

    }
}
