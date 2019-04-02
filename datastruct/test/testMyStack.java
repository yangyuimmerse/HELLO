package datastruct.test;

import datastruct.MyStack;

public class testMyStack {

	public static void main(String[] args) {
		//创建一个栈
		MyStack ms = new MyStack();
		//压入数组
		ms.push(9);
		ms.push(8);
		ms.push(7);
//		ms.push(6);
//		ms.push(5);
//		int pop = ms.pop();
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
//		System.out.println(ms.peek());
//		System.out.println(ms.pop());
//		System.out.println(ms.peek());
		//查看是否为空
		System.out.println(ms.isEmpty());
	}

}
