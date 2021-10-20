package finalcrawford;

public class Registration {
	private double GEN_REG=0,STU_REG=0,ECOMM=0,WEB=0,JAVA=0,SECURITY=0,total=0;
	//the basic premise to this is that if an option is selected, its cost is changed from 0 
	//to the actual amount. when the total is calculated, only the selected options have a value >0
	public Registration() {
	}
	public void setRegistrationCost(int a) {
	if (a==1) 
		GEN_REG=699;
	if (a==2)
		STU_REG=499;
	}
	public void setWorkshopCost(int wsIndex){
		//this assumes the variables listed on the test are in the same order as the table on page 2
		if (wsIndex==0)
			ECOMM=295;
		if (wsIndex==1)
			WEB=295;
		if (wsIndex==2)
			JAVA=395;
		if (wsIndex==3)
			SECURITY=349;
	}
	public double getTotal() {
		total=GEN_REG+STU_REG+ECOMM+WEB+JAVA+SECURITY;
		return total;
	}
}
