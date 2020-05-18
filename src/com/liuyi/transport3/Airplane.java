package com.liuyi.transport3;

public class Airplane extends AirTransport {
    //飞机，构造方法
    public Airplane(){
        System.out.println("驾驶飞机");
    }

    //重写驾驶方法
    public void DriveMethod(){
        System.out.println("专业的飞行驾驶员，通过控制油门、脚蹬、操纵杆驾驶");
    }


}
