public class DoubleThreadSafeSingleton {

	private static DoubleThreadSafeSingleton instance;

	public static DoubleThreadSafeSingleton getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (DoubleThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new DoubleThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}