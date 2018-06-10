package org.wecancodeit.courses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

	private Map<Long, Course> courseList = new HashMap<>();

	// Constructor
	public CourseRepository(Course...courses) {
		for(Course course : courses) {
			courseList.put(course.getId(), course);
		}
	}

	// Methods
	public Course findOne(long courseId) {
		return courseList.get(courseId);
	}

	public Collection<Course> findAll() {
		return courseList.values();
	}

} // End CourseRepository()
