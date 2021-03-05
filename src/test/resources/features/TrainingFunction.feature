@CRM-206 @CRM
Feature: 

	Background:
		#@CRM-202
		Given user log in with HR credentials
		Then verify that page title is "Portal"
		#@CRM-207
		When user navigates to "Services" tab and "Training" menu
		Then user should be on the "Course list" page as a default
		

	#As a user, I should be able to use Training functions under Services menu.(SP4)
	#
	#AC: User  can find the specific course.
	@CRM-199 @CRM
	Scenario: Verify that as a user I can find the specific course.
		And user searches the courses including "Intranet" keywords
		Then as a result user should have to see the specific course_courses including "Intranet" keywords
			

	#As a user, I should be able to use Training functions under Services menu.(SP4)
	#
	#AC: User can see his/her courses under MyCourses.
	@CRM-203 @CRM
	Scenario: Verify that as a user I can see my courses under MyCourses.
		Then user navigates to "My Courses" submenu
		And page title should contains "Course report"
		Then user should see her_his "Intranet Portal training course" in the table	

	#As a user, I should be able to use Training functions under Services menu.(SP4)
	#
	#AC: User can see his/her grades under Grade Book.
	@CRM-204 @CRM
	Scenario: Verify that as a user I can see my grades under Grade Book.
		Then user navigates to "Grade Book" submenu
		And page title should contains "Test results"
		Then user should see her_his "Last score" in the table	

	#As a user, I should be able to use Training functions under Services menu.(SP4)
	#
	#AC: User can see his/her courses under MyCourses.
	@CRM-205 @CRM
	Scenario: Verify that as a user I can edit my Student's Profile.
		Then user navigates to "Profile" submenu
		And page title should contains "Student's Profile"
		Then user should able to edit her_his profile