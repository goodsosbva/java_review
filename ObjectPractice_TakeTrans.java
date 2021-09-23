package first;

public class ObjectPractice_TakeTrans {

	public static void main(String[] args) {
		ObjectPractice_student kwon = new ObjectPractice_student("kwon", 5000);
		ObjectPractice_student son = new ObjectPractice_student("son", 10000);
		ObjectPractice_student kang = new ObjectPractice_student("kang", 20000);
		
		
		ObjectPractice_Bus bus80 = new ObjectPractice_Bus(80);
		kwon.takeBus(bus80);
		kwon.showInfo();
		bus80.showInfo();
		
		ObjectPractice_Subway subwayorange = new ObjectPractice_Subway("3호선");
		son.takeSubway(subwayorange);
		son.showInfo();
		subwayorange.showInfo();
		// 택시
		ObjectPractice_Texi generaltexi = new ObjectPractice_Texi("general texi");
		kang.takeTexi(generaltexi);
		kang.showInfo();
		generaltexi.showInfo();

	}

}
