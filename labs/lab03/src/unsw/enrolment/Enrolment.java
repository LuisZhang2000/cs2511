package unsw.enrolment;

public class Enrolment {

    private CourseOffering offering;
    private Grade grade;
    private Student student;

    public Enrolment(CourseOffering offering, Student student) {
        this.offering = offering;
        this.student = student;
    }

    public Course getCourse() {
        return offering.getCourse();
    }

    public String getTerm() {
        return offering.getTerm();
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public int getGradeMark() {
        return getGrade().getMark();
    }

    @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n" + getCourse().getCourseCode() + " ~ " + getCourse().getTitle() + "\n";
	}
}
