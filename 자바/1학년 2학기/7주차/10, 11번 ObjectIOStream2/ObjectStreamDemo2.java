import java.io.*;
public class ObjectStreamDemo2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Order[] orders = {
			new Order("10분의 기적",   	10.0f, 10),
			new Order("소크라테스에서",	20.0f, 100),
			new Order("논어",			30.0f, 10000)
		};
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("orders.dat"));
			out.writeObject(orders);
			
			float total=0.0f;
			Order[] ords;
			in = new ObjectInputStream(new FileInputStream("orders.dat"));
			ords = (Order[])in.readObject();
			for (Order o : ords) {
				System.out.format("You ordered %d unit of %s at $%.1f%n", o.getUnit(), o.getTitle(), o.getPrice());
				total += o.getUnit() * o.getPrice();
			}
			System.out.format("Total: %.2f$", total);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try { if(out != null) out.close(); } catch(IOException e) {}
			try { if(in != null) in.close(); } catch(IOException e) {}
		}
	}
}