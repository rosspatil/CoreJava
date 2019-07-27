
public class prod {

	String pname;
	int price,total;
	Integer qty;
	
	prod()
	{
		pname="";
		price=0;
		total=0;
		qty=0;
	}
 public int total()
 {
	 return (price*qty);
 }
 public int gTotal()
 {
	 return (total+total);
 }
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}
}
