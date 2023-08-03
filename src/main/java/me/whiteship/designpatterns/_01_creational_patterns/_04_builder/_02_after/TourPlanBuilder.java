package me.whiteship.designpatterns._01_creational_patterns._04_builder._02_after;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);
    
    // builder 안에 있는 메서드를 호출하면 다른 builder 메서드를 호출할 수 있음!
    // .title().startDate() ...
    
    TourPlan getPlan();
    
    // getPlan() 호출시 객체를 반환

}
