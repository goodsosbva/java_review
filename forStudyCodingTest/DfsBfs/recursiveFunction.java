package Dfs_Bfs;

public class recursiveFunction {
	
	public static void RecursiveFunction(int i) {
        // 100��° ȣ���� ���� �� ����ǵ��� ���� ���� ���
        if (i == 100) return;
        System.out.println(i + "��° ��� �Լ����� " + (i + 1) + "��° ����Լ��� ȣ���մϴ�.");
        RecursiveFunction(i + 1);
        System.out.println(i + "��° ��� �Լ��� �����մϴ�.");
    }

	public static void main(String[] args) {
		RecursiveFunction(1);

	}

}
