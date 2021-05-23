
public class Main {

	public static void main(String[] args) {
		CoursesInfo courseInfo1 = new CoursesInfo();
		courseInfo1.id = 1;
		courseInfo1.courseName = "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)";
		courseInfo1.courseInstructor = "Engin Demiro�";
		courseInfo1.courseLength = "4 Ay";
		
		CoursesInfo courseInfo2 = new CoursesInfo();
		courseInfo2.id = 1;
		courseInfo2.courseName = "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)";
		courseInfo2.courseInstructor = "Engin Demiro�";
		courseInfo2.courseLength = "2 Ay";
		
		CoursesInfo courseInfo3 = new CoursesInfo();
		courseInfo2.id = 1;
		courseInfo3.courseName = "Programlamaya Giri� ��in Temel Kurs";
		courseInfo3.courseInstructor = "Engin Demiro�";
		courseInfo3.courseLength = "1 Ay";
		
		InstructorInfo instructorInfo1 = new InstructorInfo();
		instructorInfo1.id = 10;
		instructorInfo1.name = "Engin";
		instructorInfo1.lastName = "Demiro�";
		instructorInfo1.job = "E�itmen";
		instructorInfo1.email = "engindemirog@gmail.com";
		instructorInfo1.adress = "Istanbul";
		instructorInfo1.experiences = "5 Y�l";
		
		UserInfo userInfo1 = new UserInfo();
		userInfo1.id = 100;
		userInfo1.name = "Elif";
		userInfo1.lastName = "Eyl�l";
		userInfo1.job = "Avukat";
		userInfo1.email = "elifeyl�l@hotmail.com";
		userInfo1.adress = "K�z Kulesi";
		userInfo1.userLearnedCourses = "Programlamaya Giri� ��in Temel Kurs";
		
		StudentInfo studentInfo1 = new StudentInfo();
		studentInfo1.id = 1000;
		studentInfo1.name = "Samet";
		studentInfo1.lastName = "Aynihan";
		studentInfo1.job = "��renci";
		studentInfo1.email = "aynihan.samet1@gmail.com";
		studentInfo1.adress = "Kayseri";
		studentInfo1.studentLearnedCourses = courseInfo1.courseName;		

		CoursesManager courseManager = new CoursesManager();
		courseManager.addCourse(courseInfo1, courseInfo2, courseInfo3);
		
		UserManager userManager = new UserManager();
		userManager.addUser(userInfo1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(studentInfo1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructorInfo1);
		
		Manager manager = new Manager();
		manager.aferManager();
		
		Manager allInfo = new Manager();
		allInfo.allInformation(instructorInfo1, userInfo1, studentInfo1);
		
	}

}
