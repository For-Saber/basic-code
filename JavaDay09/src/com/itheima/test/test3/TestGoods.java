package com.itheima.test.test3;

public class TestGoods {
    public static void main(String[] args) {

        Goods[] arr=new Goods[3];

        Goods g1=new Goods("001","华为p40",5999.0,100);
        Goods g2=new Goods("002","保温杯",150.0,50);
        Goods g3=new Goods("003","枸杞",15.0,70);

        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods=arr[i];
            System.out.println("商品ID为："+goods.getId());
            System.out.println("商品名称为："+goods.getName());
            System.out.println("商品价格为："+goods.getPrice());
            System.out.println("商品库存为："+goods.getCount());
        }
    }
}
