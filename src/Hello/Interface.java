package Hello;
interface call {
	void vehicle();                               
}
interface vehicle3 extends call {
	void vehicle12();
}
class vehicle2 implements vehicle3 {
public void vehicle() {
	System.out.println("Bus");
}
@Override
public void vehicle12() {
	// TODO Auto-generated method stub
	System.out.println("Cycle");
}
}
public class Interface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    vehicle2 v=new vehicle2();
    v.vehicle();
    v.vehicle12();
    	}
}
