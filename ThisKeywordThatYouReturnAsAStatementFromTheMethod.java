package OOPS;

class AA{
	AA getAA() {
		return this;
	}
	void msg() {
		System.out.println("Hello Java !");
	}
}
public class ThisKeywordThatYouReturnAsAStatementFromTheMethod {

	public static void main(String[] args) {
       
		new AA().getAA().msg();
	}
}
