package com.liuyi.transport3;

public class Automobile extends LandTransport{
    //开小轿车，构造方法
    public Automobile(){
        System.out.println("开小轿车");
    }
    //重写驾驶方法

    @Override
    public void DriveMethod() {
        System.out.println("1、系安全带  " +
                           "2、点火，踩离合器，挂一档  " +
                            "3、打左转向灯。鸣喇叭提示前后行人车辆等。  " +
                            "4、松手刹    5、松离合器、适当点油门，起步向左道靠上" +
                                    "6、起步走上正常行车道后，打回转向灯。    ") ;
    }
}
