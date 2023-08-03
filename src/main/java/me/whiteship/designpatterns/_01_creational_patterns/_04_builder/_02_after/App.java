package me.whiteship.designpatterns._01_creational_patterns._04_builder._02_after;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

public class App {

    public static void main(String[] args) {
    	// Director를 만들기위해서 default 객체를 생성해줘야함 -> 단점
    	// 구조 자체가 복잡해짐 -> 단점
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
    }
}
