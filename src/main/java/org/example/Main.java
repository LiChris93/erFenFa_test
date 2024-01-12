package org.example;

public class Main {
    public static void main(String[] args) {
        //二分法求零点
        double left = 1,right = 2,average;//先自己作图看哪两个区间有零点:)
        if(func(left)*func(right) > 0){
            System.out.print(left+"和"+right+"之间无零点或者两个零点都在其中，无法计算");
            return;
        }
        for(int i =0;i<=4;i++){//5次循环足够取0.1近似值了
            average = (left+right)/2;//先求区间两边的平均值
            if(func(left)*func(average) < 0){//零点在左半区间
                right= average;//区间缩小一半，取原来的左半边
            }else{//零点在右半区间
                left=average;//区间缩小一半，取原来的右半边
            }
        }
        System.out.print("零点在"+left+"和"+right+"之间");

    }
    public static double func(double x){
        return 2*x*x*x-3*x*x-18*x+28;//y=f(x)=2x^3-3x^2-18x+28
    }
}