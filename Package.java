/*
* Super class for InsuredPackage.java. Includes constructor for basic package.
* Method to calculate cost based on weight and method of transportation.
*
* <p>Bugs: none
*
* @author Brittany King
*/
//super class
public class Package {
	//data
	protected int ounces;
	protected char method;
	protected double cost;
	
	//constructors
	public Package(int weight, char method){
		this.ounces= weight;
		this.method = Character.toUpperCase(method);
		this.cost = calculateCost();
	}
		
	//methods
	/*
	 * Calculate cost based on method and weight of package
	 * name: calculateCost
	 * input: none
	 * output: none
	 * 
	 */
	public double calculateCost(){
		if (this.method == 'A'){
		if (this.ounces <= 8){
			this.cost = 2.00;
		}
		else if (this.ounces > 8 && this.ounces <= 16){
			this.cost = 3.00;
		}
		else if (this.ounces > 17){
			this.cost = 4.50;
		}
	}
	if	(this.method == 'T'){
		if (this.ounces <= 8){
			this.cost = 1.50;
		}
		else if (this.ounces > 8 && this.ounces <= 16){
			this.cost = 2.35;
		}
		else if (this.ounces > 17){
			this.cost = 3.25;
		}
	}
	if	(this.method == 'M'){
		if (this.ounces <= 8){
			this.cost = 0.50;
		}
		else if (this.ounces > 8 && this.ounces <= 16){
			this.cost = 1.50;
		}
		else if (this.ounces > 17){
			this.cost = 2.15;
		}
	}
	return this.cost;
	}
	/*
	 * Display values of the package
	 * name: display
	 * input: none
	 * output: none
	 */
	public void display(){
		System.out.println("Package information:");
		System.out.println("Weight: " + ounces +" ounces");
		System.out.println("\tMethod: " + method);
		System.out.println("\tCost: $" + cost);
		
	}
}
