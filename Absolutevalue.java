package ramSirSession;

public class Absolutevalue {
	public static void main(String[] args) {
        int[] array = { -3,19,20,-20,-39,60 };
        
        for (int i = 0; i < array.length; i++) {
            int absoluteValue = Math.abs(array[i]);
            
            System.out.println("Absolute value of element at index" + i + "is" + absoluteValue);
        }
    }

}
