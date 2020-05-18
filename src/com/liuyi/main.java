package com.liuyi;
//重写快捷键 ctrl+o

import com.liuyi.person.Person;
import com.liuyi.transport3.*;

public class main {
    public static void main(String[] args) {

        //空中交通工具
////Peter驾驶飞艇
        Person p1 = new Person("Peter");
        Aircraft aircraft = new Aircraft();
        aircraft.DriveMethod();
////Jerry驾驶飞机
        System.out.println();
        Person p2 = new Person("Jerry");
        Airplane airplane = new Airplane();
        airplane.DriveMethod();


////Tom驾驶热气球
        System.out.println();
        Person p3 = new Person("Tom");
        HotAirBalloon hotAirBalloon = new HotAirBalloon();
        hotAirBalloon.DriveMethod();

//陆地篇

////Gina骑自行车
        System.out.println();
        Person p4 = new Person("Gina");
        Bicycle bicycle = new Bicycle();
        bicycle.DriveMethod();
// Bob坐火车
        System.out.println();
        Person p5 = new Person("Bob");
        Train train = new Train();
        train.DriveMethod();

//Kelly骑摩托车
        System.out.println();
        Person p6 = new Person("Kelly");
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.DriveMethod();

//Lily开小轿车
        System.out.println();
        Person p7 = new Person("Lily");
        Automobile automobile = new Automobile();
        automobile.DriveMethod();

//水中交通工具
////猪猪艺驾驶气垫船
        System.out.println();
        Person p8 = new Person("猪猪艺");
        Hovercraft hovercraft = new Hovercraft();
        hovercraft.DriveMethod();

////Jane驾驶轮船
        System.out.println();
        Person p9 = new Person("Jane");
        Ship ship = new Ship();
        ship.DriveMethod();

////Tommy驾驶潜水艇
        System.out.println();
        Person p10 = new Person("Tommy");
        Submarine submarine = new Submarine();
        submarine.DriveMethod();
}

}
