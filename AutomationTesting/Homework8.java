package dwl;

public class Homework8 {

	public static void main(String[] args) {

		String[] grad = { "Beograd", "Lisabon", "Rim", "Valensija", "Solun" };

		for (int i = 1; i < 4; i++) {
			System.out.println(grad[i]);
		}
		
		System.out.println();
		
		String[] cities = { "Lisabon", "London", "Helsinki", "Prag", "Madrid" };

		for (String city : cities) {
			if (city.equals("Prag")) {
				break;
			}
			System.out.println(city);
		}
	}

}
