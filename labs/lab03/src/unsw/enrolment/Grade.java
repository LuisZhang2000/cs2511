package unsw.enrolment;

public class Grade {
    private int mark;
    private String grade;

    public Grade(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
		this.mark = mark;
    }
    
    public String getGrade() {
        return grade;
    }

    public String setGrade(int mark) {
        String grade;
    	if (mark >= 85) grade = "HD";
    	else if (mark >= 75) grade = "D";
    	else if (mark >= 65) grade = "C";
        else if (mark >= 50) grade = "P";
        else grade = "FL";
        return grade;
    }
}
