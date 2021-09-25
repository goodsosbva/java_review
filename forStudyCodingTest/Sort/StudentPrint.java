package codingTestSort;

import java.util.*;

class Student implements Comparable<Student> {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    // ���� ������ '������ ���� ����'
    @Override
    public int compareTo(Student other) {
    	System.out.print("this: " + this.score + " ");
    	System.out.print("other: " + other.score + " ");
        if (this.score < other.score) {
            return -1;
        }
        return 1;
    }
}

public class StudentPrint {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // N�� �Է¹ޱ�
        int n = sc.nextInt();

        // N���� �л� ������ �Է¹޾� ����Ʈ�� ����
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            students.add(new Student(name, score));
        }

        Collections.sort(students);

        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i).getName() + " ");
        }

	}

}
