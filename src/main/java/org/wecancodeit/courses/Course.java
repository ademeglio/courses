package org.wecancodeit.courses;

public class Course {

	private long id;
	private String name;
	private String description;
	private String instructor;

	// Constructor
	public Course(long courseId, String courseName, String courseDescription, String courseInstructor) {
		this.id = courseId;
		this.name = courseName;
		this.description = courseDescription;
		this.instructor = courseInstructor;
	}

	// Getters
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getInstructor() {
		return instructor;
	}

}  // End Course()
