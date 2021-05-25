import java.util.Scanner;

public class Manager {
	public void aferManager() {
		System.out.println("Tüm iþlemler baþarýyla gerçekleþti.");
	}
	
	public void allInformation(InstructorInfo instructorInfo1, UserInfo userInfo1 ,StudentInfo studentInfo1) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Evet : 1 ");
		System.out.println("Hayýr : 2 ");
		System.out.println("Tüm bilgileri görüntülemek istiyor musunuz?");
		System.out.print("Cevap : ");
		int temp = scan.nextInt();
		
		if(temp == 1) {
			System.out.println("id: "+instructorInfo1.id+ "  Ýsim: "+instructorInfo1.name+
					"  Soy Ýsim: "+instructorInfo1.lastName+ "  Meslek: "+instructorInfo1.job+"  Email: "+instructorInfo1.email+
					"  Adres: "+instructorInfo1.adress+ "  Deneyim Süresi: "+instructorInfo1.experiences);
			
			System.out.println("id: "+userInfo1.id+ "  Ýsim: "+userInfo1.name+
					"  Soy Ýsim: "+userInfo1.lastName+ "  Meslek: "+userInfo1.job+"  Email: "+userInfo1.email+
					"  Adres: "+userInfo1.adress+ "  Sahip Olduðu Kurslar: "+userInfo1.userLearnedCourses);
			
			System.out.println("id: "+studentInfo1.id+ "  Ýsim: "+studentInfo1.name+
					"  Soy Ýsim: "+studentInfo1.lastName+ "  Meslek: "+studentInfo1.job+"  Email: "+studentInfo1.email+
					"  Adres: "+studentInfo1.adress+ "  Sahip Olduðu Kurslar: "+studentInfo1.studentLearnedCourses);
			System.out.println("Baþarýlý! Tüm bilgiler görüntülendi.");
		}
		else if(temp == 2) {
			System.out.println("Bilgiler saklý kalmaya devam edecek..");
			System.out.println("Programdan çýkýlýyor..");
		}
		else {
			System.out.println("Hatalý veya eksik tuþlama yaptýnýz.");
			System.out.println("Programdan çýkýlýyor..");
		}
		
	}
	
}
