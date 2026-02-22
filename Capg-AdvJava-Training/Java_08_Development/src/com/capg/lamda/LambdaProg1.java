package com.capg.lamda;

import java.nio.channels.Pipe.SourceChannel;
interface Person{
	public void eat();
}
public class LambdaProg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(){
			public void eat() {
				System.out.println("Eat Food");
			}
			
		};
		p1.eat();
	}

}
