package com.liuyi.transport3;

public class Motorcycle extends LandTransport {
    //骑摩托车
    public Motorcycle(){
        System.out.println("骑摩托车");
    }
    //重写方法

    @Override
    public void DriveMethod() {
        System.out.println("带上安全帽"
                +"1、离合打火，然后挂1档，慢松离合加油门" +
                "     2、升档，略加油门，快捏离合把手"
                +"      3、刹车:一般刹车时，都是先刹车，后捏离合");
    }
}
