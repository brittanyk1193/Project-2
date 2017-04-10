///////////////////////////////////////////////////////////////////////////////
// ALL STUDENTS COMPLETE THESE SECTIONS
// Title: UsePackage
// Files: Package.java InsuredPackage.java
// Semester: Spring 2017
//
// Author: Brittany King
// Email: bkk160130@utdallas.edu
// CS Login: bkk160130
// Lecturer's Name: Dr. Nassim Sohaee
// Course Section: 001
//
//////////////////////////// 80 columns wide //////////////////////////////////
public class UsePackage {

	public static void main(String[] args) {
		Package pack1 = new Package(120, 'A');
		pack1.display();
		
		Package pack2 = new Package(12, 'M');
		pack2.display();
		
		Package pack3 = new Package(20, 't');
		pack3.display();
		
		InsuredPackage ipack1 = new InsuredPackage(4, 'm', true);
		ipack1.display();
		
		InsuredPackage ipack2 = new InsuredPackage(7, 'T', true);
		ipack2.display();
		
		InsuredPackage ipack3 = new InsuredPackage(10, 'A', true);
		ipack3.display();
	}

}
