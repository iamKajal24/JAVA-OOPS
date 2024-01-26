package OOPS;

interface Bank67 {
	float getOfInterest();
}

class SBI67 implements Bank67 {
	public float getOfInterest() {
		return 9.15f;
	}
}

class PNB67 implements Bank67 {
	public float getOfInterest() {
		return 9.7f;
	}
}

public class JavaInterFaceBank {

	public static void main(String[] args) {
		Bank67 B = new SBI67();
		System.out.println("ROI : " + B.getOfInterest() + " % ");
	}

}
