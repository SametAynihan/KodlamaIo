import java.util.Scanner;

public class Manager {
	public void aferManager() {
		System.out.println("T�m i�lemler ba�ar�yla ger�ekle�ti.");
	}
	
	public void allInformation(InstructorInfo instructorInfo1, UserInfo userInfo1 ,StudentInfo studentInfo1) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Evet : 1 ");
		System.out.println("Hay�r : 2 ");
		System.out.println("T�m bilgileri g�r�nt�lemek istiyor musunuz?");
		System.out.print("Cevap : ");
		int temp = scan.nextInt();
		
		if(temp == 1) {
			System.out.println("id: "+instructorInfo1.id+ "  �sim: "+instructorInfo1.name+
					"  Soy �sim: "+instructorInfo1.lastName+ "  Meslek: "+instructorInfo1.job+"  Email: "+instructorInfo1.email+
					"  Adres: "+instructorInfo1.adress+ "  Deneyim S�resi: "+instructorInfo1.experiences);
			
			System.out.println("id: "+userInfo1.id+ "  �sim: "+userInfo1.name+
					"  Soy �sim: "+userInfo1.lastName+ "  Meslek: "+userInfo1.job+"  Email: "+userInfo1.email+
					"  Adres: "+userInfo1.adress+ "  Sahip Oldu�u Kurslar: "+userInfo1.userLearnedCourses);
			
			System.out.println("id: "+studentInfo1.id+ "  �sim: "+studentInfo1.name+
					"  Soy �sim: "+studentInfo1.lastName+ "  Meslek: "+studentInfo1.job+"  Email: "+studentInfo1.email+
					"  Adres: "+studentInfo1.adress+ "  Sahip Oldu�u Kurslar: "+studentInfo1.studentLearnedCourses);
			System.out.println("Ba�ar�l�! T�m bilgiler g�r�nt�lendi.");
		}
		else if(temp == 2) {
			System.out.println("Bilgiler sakl� kalmaya devam edecek..");
			System.out.println("Programdan ��k�l�yor..");
		}
		else {
			System.out.println("Hatal� veya eksik tu�lama yapt�n�z.");
			System.out.println("Programdan ��k�l�yor..");
		}
		
	}
	
}
