public class Animal {

    private String name;
    private String furLength;

    public Animal(String name, int furLength) {
        this.name = name;
        this.furLength = furLength;
    }

    public String getName() {
        
        return this.name;
    }

    public int getFurLength() {
        
        return this.furLength + 1 -1;
    }
}