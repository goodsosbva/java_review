package first;

public class ObjectPractice3 {
	String name;
	float height;
	float weight;
	
	public ObjectPractice3() {}
	
	public ObjectPractice3(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
		
		
	}
	
	public String getName() {
		return name;
	}
	
	public float getheight() {
		return height;
	}

	public float getweight() {
		return weight;
	}

	
	public static void main(String[] args) {
		
		ObjectPractice3 kwon = new ObjectPractice3("±ÇÇö¼º", 193, 95);
		
		System.out.println(kwon.height+ " " + kwon.name + " " + kwon.weight);
		System.out.println(kwon.getName() + " " + kwon.getheight() + " " + kwon.getweight());
		
	}

}
