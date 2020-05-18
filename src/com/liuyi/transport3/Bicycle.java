package com.liuyi.transport3;

public class Bicycle extends LandTransport {
    //骑自行车
    public Bicycle() {
        System.out.println( "骑自行车");
    }
    //重写：特有的驾驶方法
//快捷键 ctrl+o
    @Override
    public void DriveMethod() {
        System.out.println("脚蹬踏板，控制平衡，握住自行车把手控制方向");
    }
}
