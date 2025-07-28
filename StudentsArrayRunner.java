class StudentsArrayRunner {
	
	public static void main(String [] args) {
		String [] studentNames = StudentsArray.getStudentNames();
		System.out.println(studentNames);
		
		byte [] ages = StudentsArray.getAges();
		System.out.println(ages);
		
		short [] rollNos = StudentsArray.getRollNos();
		System.out.println(rollNos);
		
		int [] marks = StudentsArray.getMarks();
		System.out.println(marks);
		
		long [] phones = StudentsArray.getPhones();
		System.out.println(phones);
		
		float [] percentages = StudentsArray.getPercentages();
		System.out.println(percentages);
		
		double [] scores = StudentsArray.getScores();
		System.out.println(scores);
		
		char [] grades = StudentsArray.getGrades();
		System.out.println(grades);
		
		boolean [] passStatus = StudentsArray.getPassStatus();
		System.out.println(passStatus);
		
		for(int i = 0; i < studentNames.length; i++) {
			System.out.println(studentNames[i]);
		}
		
		for(int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		
		for(int i = 0; i < rollNos.length; i++) {
			System.out.println(rollNos[i]);
		}
		
		for(int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		for(int i = 0; i < phones.length; i++) {
			System.out.println(phones[i]);
		}
		for(int i = 0; i < percentages.length; i++) {
			System.out.println(percentages[i]);
		}
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		for(int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		
		for(int i = 0; i < passStatus.length; i++) {
			System.out.println(passStatus[i]);
		}
	}
}

	
	