package org.wecancodeit.courses;

public class Course {

	private long courseId;
	private String courseName;
	private String courseDescription;
	private String courseInstructor;

	// Constructor
	public Course(long courseId, String courseName, String courseDescription, String courseInstructor) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.courseInstructor = courseInstructor;
	}

	// Getters
	public Long getId() {
		return courseId;
	}

}  // End Course()
