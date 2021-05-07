package com.javaex.oop.summary;

public class SummaryApp {
	
	static KungfuSkill dojang[];
	public static void main(String[] args) {
		Human h1=new Human("고길동", 50);
		Human h2=new TheOne("네오", 48);
		Panda p1=new Panda("핑", 30);
		Panda p2=new KungfuPanda("포", 15);
	
		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
		
		fly(h1);
		fly(h2);
		fly(p1);
		fly(p1);
		
		//	kungfu 할 수 있는 객체를 dojang에 넣기
		dojang=new KungfuSkill[] {
//				(KungfuSkill)h1, //-> KungfSkill을 구현하지 않음
				(KungfuSkill)h2,
//				(KungfuSkill)p1,
				(KungfuSkill)p2
		};
		
		for(KungfuSkill actor:dojang) {
			actor.kunfu();
		}
		
	}
	
	private static void fight(Animal actor) {
		if(actor instanceof KungfuSkill) {
			((KungfuSkill)actor).kunfu();
		}
		else {
			System.out.println(actor.name + ":쿵후 못해요!");
		}
	}
	
	private static void fly(Animal actor) {
		if(actor instanceof Flyable) {
			((Flyable)actor).fly();
		}
		else
			System.out.println(actor.name+": 하늘을 못날아요!");
	}

}
