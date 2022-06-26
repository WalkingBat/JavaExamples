// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

public class Example_04 {
    public static void main(String[] args) {
        int count = 3;
        HanoiTower('1', '2', '3', count);
    }

    public static void HanoiTower(char a, char b, char c, int count) {

    	if (count == 1){
		    System.out.println(String.format("from %s to %s", a, b));
	    }else {
		    HanoiTower(a, c, b, count - 1);
		    System.out.println(String.format("from %s to %s", a, b));
	        HanoiTower(c, b, a, count-1);
    	}

    }
}