package com.zyb.zyb01;

public class SparseArray {
    public static void main(String[] args) {
        //创建一个数组
        int array[][]=new int[10][10];
        //System.out.println(array);
        array[1][3]=1;
        array[2][5]=2;
        array[7][0]=-1;
        array[9][4]=3;
        for (int [] arr:array){
            for (int m:arr){
                System.out.printf("%d\t",m);

            }
            System.out.println();
        }
int sum=0;
        //System.out.println(array.length);
        for(int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                if (array[i][j]!=0){
                    sum++;
                }
            }
        }
        //将数组转化为稀疏数组
        int sparearray[][]=new int[sum+1][3];
        sparearray[0][0]=array.length;sparearray[0][1]=array.length;sparearray[0][2]=sum;
        int count=0;
        for (int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if (array[i][j]!=0){
                    count+=1;
                    sparearray[count][0]=i;
                    sparearray[count][1]=j;
                    sparearray[count][2]=array[i][j];
                }

            }
        }
        System.out.println("转化的稀疏数组为：~~~~~~~~~");
        for (int [] k:sparearray){
            for (int n:k){
                System.out.printf("%d\t",n);
            }
            System.out.println();
        }
        //System.out.println(sparearray.length);//二维数组时候length只会把数组的列数给打印出来;
//
        System.out.println("将稀疏数组还原成数组");
        int cherrarry[][]=new int[sparearray[0][0]][sparearray[0][1]];
        for (int i=1;i<5;i++){
            int j=0;
                cherrarry[sparearray[i][j]][sparearray[i][j+1]]=sparearray[i][j+2];
        }
        /*for (int i=0;i<sparearray[0][0];i++){
            for (int j=0;j<sparearray[0][1];j++){
                if (cherrarry[i][j]!=0){
                    continue;
                }
                else {
                    sparearray[i][j]=0;
                }
            }
        }*///这一步就显得多此一举了
        for (int [] arr:cherrarry){
            for (int m:arr){
                System.out.printf("%d\t",m);

            }
            System.out.println();
        }
    }
}
