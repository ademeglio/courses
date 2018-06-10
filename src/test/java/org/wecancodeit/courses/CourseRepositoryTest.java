package org.wecancodeit.courses;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class CourseRepositoryTest {
	
	CourseRepository underTest;
	
	private long firstCourseId = 1L;
	private Course firstCourse = new Course(firstCourseId, "1st course name", "1st course description", "1st course instructor");
	
	private long secondCourseId = 2L;
	private Course secondCourse = new Course(secondCourseId, "2nd Course name", "2nd course description", "2nd course instructor");
	
	
	@Test
	public void shouldFindACourse() {
		// Setup
		underTest = new CourseRepository(firstCourse);
		// Act
		Course result = underTest.findOne(firstCourseId);
		// Assert
		assertThat(result, is(firstCourse));
	}
	
	@Test
	public void shouldFindASecondCourse() {
		// Setup
		underTest = new CourseRepository(secondCourse );
		// Act
		Course result = underTest.findOne(secondCourseId);
		// Assert
		assertThat(result, is(secondCourse));
	}
	
	@Test
	public void shouldFindAllCourses() {
		// Setup
		underTest = new CourseRepository(firstCourse, secondCourse);
		// Act
		Collection<Course> result = underTest.findAll();
		// Assert
		assertThat(result, containsInAnyOrder(firstCourse, secondCourse));
	}
	
	
	
} // End CourseRepositoryTest()
