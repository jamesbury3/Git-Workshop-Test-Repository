public class Animal {

    private String name;
    private String furLength;

    public Animal(String name, int furLength) {
        this.name = name;
        this.furLength = furLength;
    }

    public String getName() {
        return "Animal: " + this.name;
    }
}