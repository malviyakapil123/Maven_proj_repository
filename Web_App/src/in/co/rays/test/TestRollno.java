package in.co.rays.test;

import in.co.rays.bean.MarksheetBean;
import in.co.rays.model.MarksheetModel;

public class TestRollno {

	public static void main(String[] args) throws Exception {
		MarksheetBean mb = new MarksheetBean();
		mb.setRollno(1);

		MarksheetModel model = new MarksheetModel();

		mb = (MarksheetBean) model.getRollNo(mb);
		System.out.println("ROLLNO\tFNAME\tLNAME\tPHYSICS\tCHEMISTRY\tMATHS");
		System.out.print(mb.getRollno());
		System.out.print("\t" + mb.getFname());
		System.out.print("\t" + mb.getLname());
		System.out.print("\t" + mb.getPhysics());
		System.out.print("\t" + mb.getChemistry() + "\t");
		System.out.print("\t" + mb.getMathematics());

	}

}
