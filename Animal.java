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
<<<<<<< HEAD
        
        return this.furLength + 1 -1;
=======
        return this.furLength;
>>>>>>> 5939d3fca64ec5e8eb00486cc0685cec6ca911e5
    }
}