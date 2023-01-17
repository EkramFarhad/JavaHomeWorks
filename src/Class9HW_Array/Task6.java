package Class9HW_Array;

public class Task6 {
    public static void main(String[] args) {

        String[] countries = {"Canada", "Turkish", "Afghanistan", "USA", "Indian"};
        String capital;

        for (int i = 0; i < countries.length; i++) {

            switch (countries[i]) {
                case "Canada":
                    capital = "Ottawa";
                    System.out.println("The Capital of " + countries[i] + " is " + capital + ".");
                    break;
                case "Turkish":
                    capital = "Angara";
                    System.out.println("The Capital of " + countries[i] + " is " + capital + ".");
                    break;
                case "Afghanistan":
                    capital = "Kabul";
                    System.out.println("The Capital of " + countries[i] + " is " + capital + ".");
                    break;
                case "USA":
                    capital = "Washington DC";
                    System.out.println("The Capital of " + countries[i] + " is " + capital + ".");
                    break;
                case "Indian":
                    capital = "New Deli";
                    System.out.println("The Capital of " + countries[i] + " is " + capital + ".");

            }
        }
    }
}
