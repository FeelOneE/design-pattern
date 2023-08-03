package me.whiteship.designpatterns._02_structural_patterns._08_composite._02_after;


public class Client {
	
	// 핵심 모델이 트리로 표현될 수 있을 때 -> 컴포짓 패턴
	
    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }
    
    // 아이템, 가방 모두 컴포넌틍라는 공통 인터페이스를 구현
    // getPrice가 아이템, 가방 따로 있을 필요가 없음
    // 가방 아이템이 계층 구조를 가지고 있기 떄문
    
    // 가발은 아이템의 구성 (전체-구성) 구조
    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }


}
