class Singleton2 {

	private static Singleton2 singleton = null;
	static {
		singleton = new Singleton2();
	}
	public static Singleton2 getInstance(){
		return singleton;
	}
	private Singleton2() {
		
	}
}