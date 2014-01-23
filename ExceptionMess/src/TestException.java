public class TestException {
	public static void main(String[] args) {
		try {
			throw new MyException();
		} catch (MyException e) {
			// 由于实现的方法定义在MyException中，所以catch的参数不可以向上转型为Exception
			System.out.println("I am not an average Exception: "
					+ e.getPrintStackTraceAsString());
//			e.printStackTrace();
		}
	}
}
