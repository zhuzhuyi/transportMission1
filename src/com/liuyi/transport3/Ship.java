package com.liuyi.transport3;

public class Ship extends MaritimeMeansOfTransport {//气垫船
    public Ship(){
        System.out.println("驾驶轮船");
    }

    //重写驾驶方法

    @Override
    public void DriveMethod() {
        System.out.println("检查一切的仪器是否正常；按按钮启动发动专职" +
                "若顺风可打开船帆" +
                "掌舵控制方向；关闭发动机即停止");
    }

}
