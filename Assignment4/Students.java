package week3.day1;

public class Students {
	
	
	public void getStudentInfo(String ID) {
		System.out.println("Student ID:"+ "        "+ID);
	}
	public void getStudentInfo(String ID,String NAME) {
		System.out.println("Student ID:"+ "        "+ID);
		System.out.println("Student NAME:"+ "      "+NAME);
	}
	public void getStudentInfo(String EMAILID , long PHONENO) {
		System.out.println("Student e-mailID:"+ "  "+EMAILID);
		System.out.println("Student phone no:"+ "  "+PHONENO);
	}

	
	
	public static void main(String[] args) {
		Students particulars = new Students();
		particulars.getStudentInfo("JAVASEL");
		particulars.getStudentInfo("JAVASEL","R.RANOJIDOSS");
		particulars.getStudentInfo("r.ranojidoss@testleaf.com", 1011111001);
		
		
	}
	

}
