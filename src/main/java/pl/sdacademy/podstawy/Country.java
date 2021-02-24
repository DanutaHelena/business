package pl.sdacademy.podstawy;

public class Country {
    private final int retiremntAge;
    private final String countryName;

    Country(int retiremntAge, String countryName) {
            this.retiremntAge = retiremntAge;
            this.countryName = countryName;
        }

    public int getRetiremntAge() {
        return retiremntAge;
    }

    public String getCountryName() {
        return countryName;
    }
    public String toString() {
        return countryName;
    }
}

