package kodlama.io.dataAccess.course;

import kodlama.io.entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanina eklendi. "+ course.getName());
    }
}