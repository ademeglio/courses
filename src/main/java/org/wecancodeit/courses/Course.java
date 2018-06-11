package org.wecancodeit.courses;

public class Course {

	private long id;
	private String courseName;
	private String courseDescription;
	private String courseInstructor;

	// Constructor
	public Course(long courseId, String courseName, String courseDescription, String courseInstructor) {
		this.id = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.courseInstructor = courseInstructor;
	}

	// Getters
	public Long getId() {
		return id;
	}

}  // End Course()
