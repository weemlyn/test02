package com.xwm.netuser;

public class NetUserTest {

	public static void main(String[] args) {
		NetUser p1=new NetUser("0001", "张三");
		p1.check();
		NetUser p2=new NetUser("0002", "李四","123456@qq.com");
		p2.check();

	}

}
