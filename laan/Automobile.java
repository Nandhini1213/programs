package laan;

import Automobile.Aauto;

interface flyable
{
	void fly();
}
interface runable extends flyable
{
	void run();
}
interface Swimable extends runable
{
	// public,static,final
	double speed = 34.9;

	// by default all methods abstract
	void swim();

	void pause();

}

public class Automobile {
	{

	}

	class WaterAuto extends Automobile implements Swimable {
		@Override
		public void swim() {
			System.out.println("10 km/hr");
		}

		@Override
		public void pause() {
			System.out.println("pause for 30 mins");
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("100km/hr");
			
		}

	}
	class Aauto extends Automobile implements Swimable
	{

		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("160 km/hr");
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("10 km/hr");
		}

		@Override
		public void swim() {
			// TODO Auto-generated method stub
			System.out.println("25 km/hr");
		}

		@Override
		public void pause() {
            			// TODO Auto-generated method stub
			System.out.println("pause for 30 minutes");
		}
		
		
	}

	public class Automobilemain {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Aauto w = new Aauto();
			w.fly();
			w.run();
			w.swim();
			w.pause();
			System.out.println(Swimable.speed);

		}
	}
}
