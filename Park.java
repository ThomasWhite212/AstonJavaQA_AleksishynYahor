import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Attraction> attractions;

    public Park() {
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String hours, double cost) {
        attractions.add(new Attraction(name, hours, cost));
    }

    public void displayAttractions() {
        System.out.println("Attractions in the park:");
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

    private class Attraction {
        private String name;
        private String hours;
        private double cost;

        public Attraction(String name, String hours, double cost) {
            this.name = name;
            this.hours = hours;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Hours: " + hours + ", Cost: " + cost + " BYN";
        }
    }
}
