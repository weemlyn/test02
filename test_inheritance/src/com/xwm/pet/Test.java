package com.xwm.pet;

public class Test {
	public static void main(String[] args) {
		//Pet p1 = new Pet();
		 Pet p1=new Pet("w1", 5, "雄性", "有配偶"); Pet p2=new Pet("w2", 4, "雌性", "无配偶");
		 // Pet p3=new Pet("w3", 5, "雄性", "无配偶"); Pet p4=new Pet("w4", 4, "雄性", "无配偶");
		
		//Pet p2 = new Pet();
		if (p1.getGender() != p2.getGender()) {
			if (p1.getGender() == "雄性") {
				if (p1.getAge() >= 5 && p2.getAge() >= 4) {
					if(p1.getPartner()=="有配偶"||p2.getPartner()=="有配偶") {
						System.out.println(p1.getName() + "和" + p2.getName() + "有人有配偶，不能结婚");
					}
					else {
						System.out.println(p1.getName() + "和" + p2.getName() + "可以结婚");
					}

				}else {
					System.out.println(p1.getName() + "和" + p2.getName() + "年纪不符要求，不能结婚");
				}
			} else if (p1.getGender() == "雌性") {
				if (p1.getAge() >= 4 && p2.getAge() >= 5) {
					if(p1.getPartner()=="有配偶"||p2.getPartner()=="有配偶") {
						System.out.println(p1.getName() + "和" + p2.getName() + "有人有配偶，不能结婚");
					}
					else {
						System.out.println(p1.getName() + "和" + p2.getName() + "可以结婚");
					}

				}else {
					System.out.println(p1.getName() + "和" + p2.getName() + "年纪不符要求，不能结婚");
				}

			}
			
		} else {
			System.out.println(p1.getName() + "和" + p2.getName() + "性别相同，不能结婚");
		}

	}

	

	

}
