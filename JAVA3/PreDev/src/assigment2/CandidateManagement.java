package assigment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class CandidateManagement {
	static Certificate certificates1 = new Certificate(1, "JAVA", "Good", "1/1/2000");
	static Certificate certificates2 = new Certificate(2, "C++", "Good", "1/1/2000");
	static Certificate certificates3 = new Certificate(3, ".NET", "Normal", "1/1/2000");
	static List<Certificate>certificatesList1 = new ArrayList<Certificate>();
    static {
    	certificatesList1.add(certificates1);
    }
	
	public static void main(String[] args) {
		Candidate candidates1 = new Experience(1, "Nam", "13/02/2001", "0818458816", "nam@gmail.com", 0, certificatesList1, 5, "Java");
		System.out.println(candidates1.showInfo());
		System.out.println(candidates1.showMe());
		Candidate candidates2 = new Fresher(2, "Nga", "13/02/2009", "0818458816", "nga@gmail.com", 1, certificatesList1, "12/01/2019", "S", "DHDT");
		System.out.println(candidates2.showInfo());
		System.out.println(candidates2.showMe());
		System.out.println(Candidate.candidateCount);
		
		if(candidates1 instanceof Fresher) {
			System.out.println("Candidate is Fresher");
		}else {
			System.out.println("Candidate is not Fresher");
		}
		
		Candidate[]listCandidates = new Candidate[20];
		listCandidates[0]=candidates1;
		listCandidates[1] = candidates2;
		//day6
		StringBuffer nameCandidate = new StringBuffer();
		for (Candidate candidate : listCandidates) {
			if (candidate!=null) {
				nameCandidate.append(candidate.getFullName()+",");
			}
		}
		System.out.println(nameCandidate);
		System.out.println("------");
		System.out.println("Day 6,7");
		Candidate candidates3 = new Intern(3, "John", "13/02/2003", "0818458816", "nam@gmail.com", 2, certificatesList1, "Finance", "IV", "DHHN");
		Candidate candidates4 = new Fresher(4, "Tom", "13/02/2001", "0818458816", "nga@gmail.com", 1, certificatesList1, "12/01/2019", "S", "DHDT");
		Set<Candidate> candidatesSet = new HashSet<>();
		candidatesSet.add(candidates1);
		candidatesSet.add(candidates2);
		candidatesSet.add(candidates3);
		candidatesSet.add(candidates4);
		for (Candidate candidate : candidatesSet) {
			System.out.println(candidate.showInfo());
		}
		System.out.println("Sort tang dan theo can�iate type va birthday");
		List<Candidate> candidateList = new ArrayList<Candidate>();
		candidateList.add(candidates1);
		candidateList.add(candidates2);
		candidateList.add(candidates3);
		candidateList.add(candidates4);
		Collections.sort(candidateList,new CandidateComperator());
		for (Candidate candidate : candidateList) {
			System.out.println(candidate.showInfo());
		}
	}
	public void display(List<Candidate> candidateList) {
		for (Candidate candidate : candidateList) {
			System.out.println(candidate.showInfo());
		}
	}

}
