public class BRTest {

	private int calls;
	private int successfulCalls;
	private int totalReturned;
	/*
	 * 0 - ArithmeticException
	 * 1 - NullPointerException
	 * 2 - ArrayIndexOutOfBoundsException
	 * 3 - ClassCastException
	 * 4 - NegativeArraySizeException
	 */
	private int[] excepCounts = new int[5];


	public void callIt() {
		calls++;
		try {
			totalReturned += BadRandom.randVal();
			successfulCalls++;
		} catch (ArithmeticException e) {
			excepCounts[0]++;
		} catch (NullPointerException e) {
			excepCounts[1]++;
		} catch (ArrayIndexOutOfBoundsException e) {
			excepCounts[2]++;
		} catch (ClassCastException e) {
			excepCounts[3]++;
		} catch (NegativeArraySizeException e) {
			excepCounts[3]++;
		}
	}

	public void resetCounts() {
		calls = 0;
		successfulCalls = 0;
		totalReturned = 0;
		for(int i=0; i<excepCounts.length; i++) {
			excepCounts[i] = 0;
		}
	}

	public void nRandInts(int n) {
		while(successfulCalls<n) {
			callIt();
		}
	}

	public void writeData() {
		System.out.println("Number of calls: " + calls);
		System.out.println("Successful calls: " + successfulCalls);
		System.out.println("Total returned: " + totalReturned);

		float pa = ((float)(excepCounts[0]*100)/calls);
		System.out.println("Percentage Arithmetic Exceptions: " + pa);
		float pb = ((float)(excepCounts[1]*100)/calls);
		System.out.println("Percentage Null Pointer Exceptions: " + pb);
		float pc = ((float)(excepCounts[2]*100)/calls);
		System.out.println("Percentage Array Index Exceptions: " + pc);
		float pd = ((float)(excepCounts[3]*100)/calls);
		System.out.println("Percentage Class Cast Exceptions: " + pd);
		float pe = ((float)(excepCounts[4]*100)/calls);
		System.out.println("Percentage Negative Array Exceptions: " + pe);

		float ps = (float)((successfulCalls*100)/calls);
		System.out.println("Percentage of successful returned integers: " + ps);
	}

	public static void main(String[] args) {
		BRTest me = new BRTest();
		me.resetCounts();
		me.nRandInts(30);
		me.writeData();
	}
}