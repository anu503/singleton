package com.main;

public class Singleton {

	private static Singleton singleton_instance = null;
	public String str;

	private Singleton() {
		str = "This is Selenium";
	}

	public static Singleton getInstance() {
		if (singleton_instance == null)
			singleton_instance = new Singleton();
		return singleton_instance;

	}

	public static void main(String[] args) {
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		Singleton c = Singleton.getInstance();
		a.str = (a.str).toUpperCase();
		System.out.println(a.str);
		System.out.println(b.str);
		System.out.println(c.str);

		b.str = (b.str).toLowerCase();
		System.out.println(a.str);
		System.out.println(b.str);
		System.out.println(c.str);

	}

}
