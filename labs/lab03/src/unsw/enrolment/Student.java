package unsw.enrolment;
import java.util.ArrayList;

public class Student {

    private String zid;
    private ArrayList<Enrolment> enrolments;

	public Student(String zid) {
        this.zid = zid;
        enrolments = new ArrayList<>();
    }

	public String getZID() {
		return zid;
    }

    public ArrayList<Enrolment> getEnrolments() {
        return enrolments;
    }

    public void addEnrolments(Enrolment enrolments) {
		this.enrolments.add(enrolments);
    }
    
    @Override
	public String toString() {
		return zid + "'s Enrolments:\n" + enrolments.toString();
	}
}
