import java.io.*;
class Order implements Serializable {
	private String title;
	private float price;
	private int unit;

	public Order(String t, float p, int u) { title=t; price=p; unit=u; }

	public String getTitle() { return title; }
	public float getPrice() { return price; }
	public int  getUnit() { return unit; }
}
