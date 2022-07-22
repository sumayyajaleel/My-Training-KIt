package encapsulation.banking;

public class ParentBank {
	private float money;
	private int customerId;
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void calculate()
	{
		float interest=money*5*0.8f;
		money=money+interest;
	}
	
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}

	
	

}
