package unsw.enrolment.test;

import java.time.DayOfWeek;
import java.time.LocalTime;

import unsw.enrolment.Course;
import unsw.enrolment.CourseOffering;
import unsw.enrolment.Lecture;
import unsw.enrolment.Student;
import unsw.enrolment.*;

public class EnrolmentTest {

    public static void main(String[] args) {

        // Create courses
        Course comp1511 = new Course("COMP1511", "Programming Fundamentals");
        Course comp1531 = new Course("COMP1531", "Software Engineering Fundamentals");
        comp1531.addPrereq(comp1511);
        Course comp2521 = new Course("COMP2521", "Data Structures and Algorithms");
        comp2521.addPrereq(comp1511);

        CourseOffering comp1511Offering = new CourseOffering(comp1511, "19T1");
        CourseOffering comp1531Offering = new CourseOffering(comp1531, "19T1");
        CourseOffering comp2521Offering = new CourseOffering(comp2521, "19T2");

        // TODO Create some sessions for the courses
        Session comp2521lec = new Lecture("Online", DayOfWeek.TUESDAY, LocalTime.of(16, 00), LocalTime.of(18, 00), "lecturer1");
        Session comp2521tut = new Tutorial("Online", DayOfWeek.FRIDAY, LocalTime.of(11, 00), LocalTime.of(12, 00), "tutor1");
        Session comp2521lab = new Lab("Online", DayOfWeek.FRIDAY, LocalTime.of(12, 00), LocalTime.of(14, 00), "tutor1", "assistant1");

        comp2521Offering.addSession(comp2521lec);
        comp2521Offering.addSession(comp2521tut);
        comp2521Offering.addSession(comp2521lab);

        Session comp1511lec = new Lecture("Online", DayOfWeek.MONDAY, LocalTime.of(9, 00), LocalTime.of(11, 00), "lecturer1");
        Session comp1511tut = new Tutorial("Online", DayOfWeek.MONDAY, LocalTime.of(11, 00), LocalTime.of(12, 00), "tutor1");
        Session comp1511lab = new Lab("Online", DayOfWeek.MONDAY, LocalTime.of(12, 00), LocalTime.of(14, 00), "tutor1", "assistant1");

        comp1511Offering.addSession(comp1511lec);
        comp1511Offering.addSession(comp1511tut);
        comp1511Offering.addSession(comp1511lab);

        // TODO Create a student
        Student Luis = new Student("z5205864");

        // TODO Enrol the student in COMP1511 for T1 (this should succeed)
        // Since there are currently no methods to enrol students, need to make one (done in Student.java)
        comp1511Offering.enrol(Luis);

        System.out.println("-----Display-----");
        System.out.println(Luis.toString());

        // TODO Enrol the student in COMP1531 for T1 (this should fail as they
        // have not met the prereq)

        comp1531Offering.enrol(Luis);

        System.out.println("-----Display2-----");
        System.out.println(Luis.toString());

        // TODO Give the student a passing grade for COMP1511
        Enrolment e = new Enrolment(comp1511Offering, Luis);
        e.setGrade(new Grade(100));

        // TODO Enrol the student in 2521 (this should succeed as they have met
        // the prereqs)
        comp2521Offering.enrol(Luis);
    }
}
