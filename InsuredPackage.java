/*
* Subclass to Package.java. Includes option for insurance on Package constructor.
* Calculates new price with insurance
*
* <p>Bugs: none
*
* @author Brittany King
*/
public class InsuredPackage extends Package {
	//data
	private boolean insurance;
	
	//constructor
	public InsuredPackage(int weight, char method,boolean insurance){
		super(weight, method);
		if(insurance)
			super.cost = insuranceCost();
		
	}
	//methods
	/*
	 * Calculates total cost of the package with insurance included. Price of
	 * insurance based on original package cost.
	 * name: insuranceCost
	 * input: none
	 * output: double
	 */
	public double insuranceCost(){
		if (super.cost <= 1 ){
			super.cost = super.cost + 2.45;
		}
		else if (super.cost <= 3 ){
			super.cost = super.cost + 3.95;
		}
		else if (super.cost > 3 ){
			super.cost = super.cost + 5.55;
		}
		return cost;
	}
	/*
	 * name: display
	 * input: none
	 * output:none
	 */
	public void display(){
		System.out.println("Insured Package information:");
		System.out.println("\tWeight: " + ounces);
		System.out.println("\tMethod: " + method);
		System.out.println("\tCost: $" + cost);
			
	}
	
	
}
