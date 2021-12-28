package assigment2;

import java.util.Comparator;
import java.util.Date;

public class CandidateComperator implements Comparator<Candidate> {

	@Override
	public int compare(Candidate o1, Candidate o2) {
		String[]date1 = o1.getBirthDay().split("/");
		String year1 = date1[2];
		int yearNum1 = Integer.parseInt(year1);
		String[]date2 = o2.getBirthDay().split("/");
		String year2 = date2[2];
		int yearNum2 = Integer.parseInt(year2);
		// TODO Auto-generated method stub
		if (o1.getCandidateType() == o2.getCandidateType()) {
			return yearNum1 - yearNum2;
		}
		return o1.getCandidateType() - o2.getCandidateType();
	}

}
