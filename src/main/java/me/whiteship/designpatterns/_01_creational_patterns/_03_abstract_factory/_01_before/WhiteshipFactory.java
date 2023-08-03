package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._01_before;

import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.DefaultShipFactory;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Ship;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        
        // 만약 Wheel을 변경하고 싶다면 코드변경이 필수
        // 바꾸고 싶지 않음, How? -> Abstract Factory 패턴
        ship.setWheel(new WhiteWheel()); 
        return ship;
    }
}
