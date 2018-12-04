import java.io.*;
import java.lang.*;
class TemperatureException extends Exception {
	private int temperature; //예외에 대한 추가 정보

	TemperatureException() { super("제어 불가"); }
	TemperatureException(String msg) { super(msg); }

	void setTemperature(int t) { temperature = t; }
	int getTemperature() { return temperature; }
} //TemperatureException

public class 원자로감시 {
   	static int 현재로온도 = 10000;

   	public static void main(String[] args) {
		try {	
			반응로감시(); 
			return;
		} catch (TemperatureException e) {
			System.out.println();
			System.out.println(e.getMessage() + ": " + e.getTemperature());
		} finally { 
			System.out.println("원자로 셧다운");
		}
   	} //main()

	static int 변이() {
		int amount;
		amount = (int)(Math.random() * 1000);
		return amount;
  	} //변이( )

	static int 제어( ) {
		int temp=0;
		switch ((int)(Math.random() * 3)) {
			case 0: temp = -500; 	break;
			case 1: temp = 0; 	break;
			case 2: temp = 500;	break;
		}
		return temp;
    	} //제어( )

	static void 반응로감시( ) throws TemperatureException {
		TemperatureException e;
		while (true) {
	   		if (현재로온도 > 15000) {
				TemperatureException e1 = new TemperatureException(); //제어 불가
		   		e1.setTemperature(현재로온도);  
				throw e1;
			} else if (현재로온도 > 12000) {
				현재로온도 += 제어();
				System.out.println("경고: " + 현재로온도);
		   	} else {
				System.out.println();
	   			System.out.println("정상: " + 현재로온도);
				현재로온도 += 변이();
			}
	   	}
  	} //반응로감시()
} //원자로감시
