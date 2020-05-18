package com.liuyi.transport3;

public class Submarine extends MaritimeMeansOfTransport {
    //驾驶潜水艇，构造方法
    public Submarine(){
        System.out.println("驾驶潜水艇");
    }

    //重写驾驶方法

    @Override
    public void DriveMethod() {
        System.out.println("由于在海中是长时间看不见参照物的所以一般不会是个人驾驶"
                        + "驾驶员的作用是汇报突发情况，然后由控制部门控制");
    }
}
