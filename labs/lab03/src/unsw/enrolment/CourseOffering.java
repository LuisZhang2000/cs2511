package unsw.enrolment;
import java.util.ArrayList;
import java.util.List;

public class CourseOffering {

    private Course course;
    private String term;
    private List<Session> sessions;
    private List<Enrolment> enrolments;

    public CourseOffering(Course course, String term) {
        this.course = course;
        this.term = term;
        this.sessions = new ArrayList<>();
        this.enrolments = new ArrayList<>();
        this.course.addOffering(this);
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    public Course getCourse() {
        return course;
    }

    public String getTerm() {
        return term;
    }

    public void enrol(Student student) {
        if (checkPrereqs(student.getEnrolments())) {
            //Enrolment e = new Enrolment(this, student);
            student.addEnrolments(new Enrolment(this, student));
            enrolments.add(new Enrolment(this, student));
        }
    }

    public boolean checkPrereqs(ArrayList<Enrolment> enrolments) {

        for (Enrolment e : enrolments) {
            // if the course has no prereqs, TRUE
            if (getCourse().getPrereqs().isEmpty()) {
                return true;
            } else {
                // for each prerequisite course check the grade
                for (Course c : getCourse().getPrereqs()) {
                    if (e.getCourse().getTitle().equals(c.getTitle())) {
                        // if student hasn't done the prereq yet or failed, FALSE
                        if (e.getGrade() == null) return false;
                        if (e.getGradeMark() < 50) return false;
                    }
                }
            }
        }
        return true;
    }

}
