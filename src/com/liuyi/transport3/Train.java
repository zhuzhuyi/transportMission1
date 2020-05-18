package com.liuyi.transport3;

public class Train extends LandTransport {
    //驾驶火车
    public Train() {
        System.out.println( "驾驶火车");
    }

    //重写：特有的驾驶方法
    @Override
    public void DriveMethod() {
        System.out.println("机车电钥匙插好，所有的开关已经被打到应有的位置，" +
                "将自阀手柄从“制动”位移到“运转”位，稍等片刻，" +
                "等总风缸充风完成之后，将换向手柄打到“前”位，" +
                "再轻轻移动速度手柄至“*”位稍作停留，继续向前移动，" +
                "然后你继续移动手柄就行了。");
    }
}
